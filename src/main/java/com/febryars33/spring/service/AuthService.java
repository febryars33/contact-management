package com.febryars33.spring.service;

import com.febryars33.spring.entity.User;
import com.febryars33.spring.model.LoginUserRequest;
import com.febryars33.spring.model.TokenResponse;
import com.febryars33.spring.repository.UserRepository;
import com.febryars33.spring.security.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ValidationService validationService;

    @Transactional
    public TokenResponse login(LoginUserRequest request)
    {
        validationService.validate(request);

        User user = userRepository.findById(request.getUsername())
                .orElseThrow(() -> new ResponseStatusException((HttpStatus.UNAUTHORIZED), "Username or Password wrong!!"));

        if (BCrypt.checkpw(request.getPassword(), user.getPassword())) {
            user.setToken(UUID.randomUUID().toString());
            user.setTokenExpiredAt(next30Days());
            userRepository.save(user);

            return TokenResponse.builder()
                    .token(user.getToken())
                    .expiredAt(user.getTokenExpiredAt())
                    .build();
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Username or Password wrong!!");
        }
    }

    private Long next30Days()
    {
        return System.currentTimeMillis() + (1000 * 16 * 24 * 30);
    }
}
