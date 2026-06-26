# Clothing Store Application

## Overview

The Clothing Store Application is a full-stack e-commerce platform that provides users with the ability to browse products, search for items, manage their profiles, and add products to a shopping cart. The application consists of a Spring Boot backend that exposes RESTful APIs and a frontend application built with JavaScript and CSS for user interaction.

The system also includes role-based access control, allowing administrators to manage products and categories while restricting these operations for regular users.

---

## Features

### Customer Features

- Browse available clothing products
- Search for products
- Create and manage user accounts
- User authentication and login
- Update profile information
- Add products to shopping cart
- View shopping cart contents

### Administrator Features

- Add new products
- Update existing products
- Delete products
- Create and manage product categories
- Update product categories
- Manage product inventory through secured endpoints

---

## Technology Stack

### Backend

- Java
- Spring Boot
- Maven
- MySQL
- REST APIs

### Frontend

- JavaScript
- HTML
- CSS

### API Testing & Documentation

- Swagger
- Insomnia

---

## Database

The application uses a MySQL database for storing:

- User accounts
- Product information
- Product categories
- Shopping cart data
- Authentication and authorization data

---

## Getting Started

### Prerequisites

Before running the application, ensure you have the following installed:

- Java JDK
- Maven
- MySQL Server

---

## Backend Setup

### Clone the Repository

```bash
git clone <repository-url>
cd clothing-store
```

### Configure the Database

Update the database connection settings in your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/clothing_store
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Build the Project

```bash
mvn clean install
```

### Run the Backend

```bash
mvn spring-boot:run
```

The API will be available at:

```text
http://localhost:8080
```

---

## Frontend Setup

Navigate to the frontend application directory and start the frontend according to its setup instructions.

The frontend communicates with the backend API running on:

```text
http://localhost:8080
```

---

## API Endpoints

The backend exposes REST API endpoints for:

### Products

- View products
- Search products
- Product details

### Users

- Register account
- Login
- Update profile information

### Shopping Cart

- Add products to cart
- View cart contents
- Remove products from cart

### Admin Operations

- Create products
- Update products
- Delete products
- Manage categories

> Note: Administrative endpoints require administrator privileges.

---

## API Documentation

Swagger documentation is available when the application is running.

Example:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## Testing

API endpoints were tested using:

- Swagger UI
- Insomnia

---

## Security

The application uses role-based authorization to separate customer and administrator functionality.

### User Permissions

- Browse products
- Search products
- Manage profile
- Manage shopping cart

### Administrator Permissions

- Add products
- Update products
- Delete products
- Manage product categories

---

## Future Enhancements

Potential improvements include:

- Order processing and checkout
- Payment integration
- Product reviews and ratings
- Wishlist functionality
- Email notifications
- Enhanced admin dashboard

---

## Author

Created as a full-stack Clothing Store application demonstrating Spring Boot backend development, MySQL database integration, RESTful API design, authentication, authorization, and frontend integration. 