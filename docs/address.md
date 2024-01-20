# Address API Spec

## Create Contact

Endpoint : POST /api/contacts/{idContact}/addresses

Request Header :
- X-API-TOKEN : TOKEN (Mandatory)

Request Body :

```json
{
  "street": "Jl. Pasteur",
  "city": "Bandung",
  "province": "Jawa Barat",
  "country": "Indonesia",
  "postalCode": "29374"
}
```

Response Body (Success) :

```json
{
  "id": "random string",
  "street": "Jl. Pasteur",
  "city": "Bandung",
  "province": "Jawa Barat",
  "country": "Indonesia",
  "postalCode": "29374"
}
```

Response Body (Failed) :

```json
{
  "errors": "Contact not is not found!"
}
```

## Update Contact

Endpoint : PUT /api/contacts/{idContact}/addresses/{idAddress}

Request Header :
- X-API-TOKEN : TOKEN (Mandatory)

Request Body :

```json
{
  "street": "Jl. Jakarta",
  "city": "Bandung",
  "province": "Jawa Barat",
  "country": "Indonesia",
  "postalCode": "29374"
}
```

Response Body (Success) :

```json
{
  "id": "random string",
  "street": "Jl. Jakarta",
  "city": "Bandung",
  "province": "Jawa Barat",
  "country": "Indonesia",
  "postalCode": "29374"
}
```

Response Body (Failed) :

```json
{
  "errors": "Address is not found!"
}
```

## Get Contact

Endpoint : GET /api/contacts/{idContact}/addresses/{idAddress}

Request Header :
- X-API-TOKEN : TOKEN (Mandatory)

Request Body :

```json

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
  "errors": "Address is not found!"
}
```

Response Body (Failed) :

## Remove Contact

Endpoint : DELETE /api/contacts/{idContact}/addresses/{idAddress}

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

## List Address

Endpoint : GET /api/contacts/{idContact}/addresses

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
      "street": "Jl. Pasteur",
      "city": "Bandung",
      "province": "Jawa Barat",
      "country": "Indonesia",
      "postalCode": "29374"
    },
    {
      "id": "random string",
      "street": "Jl. Jakarta",
      "city": "Bandung",
      "province": "Jawa Barat",
      "country": "Indonesia",
      "postalCode": "29375"
    }
  ]
}
```

Response Body (Failed, 404) :

```json
{
  "errors": "Contact is not found!"
}
```