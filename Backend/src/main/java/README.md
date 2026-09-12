# AgriMart Backend

Simple Java Spring Boot backend for the AgriMart hackathon.

## Requirements
- Java 17+
- Maven
- MySQL
- VS Code with Java/Spring Boot extensions

## Run
1. Create a MySQL database named `agrimart`.
2. Open `src/main/resources/application.properties`.
3. Replace `YOUR_MYSQL_PASSWORD` with your local MySQL password.
4. Run `AgriMartApplication.java`.

## API
- GET `/api/products` - view products
- POST `/api/products` - add a product
- DELETE `/api/products/{id}` - delete a product

Example POST body:
{
  "name": "Tomatoes",
  "price": 40,
  "quantity": 50,
  "description": "Fresh farm tomatoes"
}
