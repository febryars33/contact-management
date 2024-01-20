# Contact API Spec

## Create Contact

Endpoint : POST /api/contacts

Request Header :
- X-API-TOKEN : TOKEN (Mandatory)

Request Body :

```json
{
  "firstName": "Febriansyah",
  "lastName": "Riki Setiadi",
  "email": "febri@example.com",
  "phone": "089237623332"
}
```

Response Body (Success) :

```json
{
  "id": "random string",
  "firstName": "Febriansyah",
  "lastName": "Riki Setiadi",
  "email": "febri@example.com",
  "phone": "089237623332"
}
```

Response Body (Failed) :

```json
{
  "errors": "Email format invalid, phone format invalid, ..."
}
```

## Update Contact

Endpoint : PUT /api/contacts/{idContact}

Request Header :
- X-API-TOKEN : TOKEN (Mandatory)

Request Body :

```json
{
  "firstName": "Febriansyah",
  "lastName": "Riki Setiadi",
  "email": "febri@example.com",
  "phone": "089237623332"
}
```

Response Body (Success) :

```json
{
  "firstName": "Febriansyah",
  "lastName": "Riki Setiadi",
  "email": "febri@example.com",
  "phone": "089237623332"
}
```

Response Body (Failed) :

```json
{
  "errors": "Email format invalid, phone format invalid, ..."
}
```

## Get Contact

Endpoint : GET /api/contacts/{idContact}

Request Header :
- X-API-TOKEN : TOKEN (Mandatory)

Request Body :

```json
{
  "id": "random string",
  "firstName": "Febriansyah",
  "lastName": "Riki Setiadi",
  "email": "febri@example.com",
  "phone": "089237623332"
}
```

Response Body (Success) :

```json
{
  "id": "random string",
  "firstName": "Febriansyah",
  "lastName": "Riki Setiadi",
  "email": "febri@example.com",
  "phone": "089237623332"
}
```

Response Body (Failed, 404) :

```json
{
  "errors": "Contact is not found!"
}
```

## Search Contact

Endpoint : GET /api/contacts

Query Parameters :
- name : String, contact first name or last name, using like query, optional
- phone : String, contact phone, using like query, optional
- email : String, contact email, using like query, optional
- page : Integer, start from 0, default 0
- size : Integer, default 10

Request Header :
- X-API-TOKEN : TOKEN (Mandatory)

Request Body :

```json

```

Response Body (Success) :

```json
{
  "data": [
    {
      "id": "random string",
      "firstName": "Febriansyah",
      "lastName": "Riki Setiadi",
      "email": "febri@example.com",
      "phone": "089237623332"
    },
    {
      "id": "random string",
      "firstName": "Lorem Ipsum",
      "lastName": "Dolor Sit Amet",
      "email": "lorem@example.com",
      "phone": "6165464543"
    }
  ],
  "paging": {
    "currentPage": 0,
    "totalPage": 10,
    "size": 10
  }
}
```

Response Body (Failed) :

## Remove Contact

Endpoint : DELETE /api/contacts/{idContact}

Request Header :
- X-API-TOKEN : TOKEN (Mandatory)

Request Body :

Response Body (Success) :

```json
{
  "data": "OK"
}
```

Response Body (Failed, 404) :

```json
{
  "errors": "Contact is not found!"
}
```

