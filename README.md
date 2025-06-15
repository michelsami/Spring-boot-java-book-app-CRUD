# Spring-boot-java-book-app-CRUD
This project serves as a starting point for beginners to understand how to build REST APIs with Spring Boot and perform CRUD operations using Spring Data JPA. It also demonstrates how to customize repository queries and validate the data through H2 console and Postman.


📚 Spring Boot CRUD Application

A simple and well-structured Spring Boot application demonstrating CRUD operations on a Book entity using Spring Data JPA and H2 in-memory database.

✅ Features

✅ Create a Spring Boot project with RESTful API endpoints

✅ Define a Book entity with basic fields

✅ Perform Create, Read, Update, Delete (CRUD) operations

✅ Add a custom finder method: findBookByTitle(String title)

✅ Use Spring Data JPA for database interaction

✅ Store data in an in-memory H2 Database

✅ Test and validate APIs using Postman

✅ View and verify database records via the H2 console

🔧 Tech Stack

Java 17+

Spring Boot

Spring Web

Spring Data JPA

H2 Database

Maven

🚀 How to Run the Project

Clone the repository:

git clone https://github.com/michelsami/Spring-boot-java-book-app-CRUD.git

Navigate into the project directory:

cd spring-boot-crud-app

Build and run the application:

mvn spring-boot:run

Access H2 console (optional):
Visit: http://localhost:8080/h2-console


📬 API Endpoints (Sample)

Method

Endpoint

Description

/book/v1

GET

/name/{bookName}
Get book by title 

/all
Get all books

POST

/add
Add a new book


PUT

/update/{bookId}
Update a book

DELETE

/delete/{bookId}
Delete a book


Test all endpoints using Postman.

🧠 Purpose

This project serves as a starting point for beginners to understand how to build REST APIs with Spring Boot and perform CRUD operations using Spring Data JPA. It also demonstrates how to customize repository queries and validate the data through H2 console and Postman.



