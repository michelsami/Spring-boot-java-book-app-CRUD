

````markdown
# 📚 Spring Boot Java Book App – CRUD API

A well-structured Spring Boot application that demonstrates how to build REST APIs with CRUD operations using Spring Data JPA and an H2 in-memory database.

This project also includes **global exception handling**, **environment-aware error paths**, and **Swagger documentation generated from Postman**.

---

## ✅ Features

🔹 Create a Spring Boot REST API for book management  
🔹 Define a `Book` entity with fields like title, author, and pages  
🔹 Perform CRUD operations (Create, Read, Update, Delete)  
🔹 Add a custom finder method: `findBookByTitle(String title)`  
🔹 Use Spring Data JPA for repository interactions  
🔹 Store data in H2 in-memory database  
🔹 Test endpoints using Postman or Swagger UI  
🔹 View DB records via the H2 Console  
🔹 📦 Centralized global exception handling  
🔹 🛡️ Custom error responses with message, details, and (optionally) the request path  
🔹 🌐 Environment-specific error behavior: path shown only in `dev`  
🔹 ✍️ Exception handling moved to service layer  
🔹 🔁 Converted Postman collection to `openapi.yaml` to generate Swagger documentation

---

## 🔧 Tech Stack

- ☕ Java 17+  
- ⚙️ Spring Boot  
- 🌐 Spring Web  
- 🧬 Spring Data JPA  
- 💾 H2 Database  
- 📦 Maven  
- 📬 Postman  
- 📜 Swagger / OpenAPI

---

## 🚀 Getting Started

### 🔁 Clone the repository

```bash
git clone https://github.com/michelsami/Spring-boot-java-book-app-CRUD.git
cd Spring-boot-java-book-app-CRUD
````

### ▶️ Run the project

```bash
mvn spring-boot:run
```

### 💻 Access the H2 Console (optional)

URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
Use the configured JDBC URL in `application.properties`.

---

## 📘 API Endpoints

| Method | Endpoint               | Description             |
| ------ | ---------------------- | ----------------------- |
| GET    | `/book/v1/name/{name}` | Get book by title       |
| GET    | `/book/v1/all`         | Get all books           |
| POST   | `/book/v1/add`         | Add a new book          |
| PUT    | `/book/v1/update/{id}` | Update an existing book |
| DELETE | `/book/v1/delete/{id}` | Delete a book           |

🛠️ Test all endpoints using **Postman** or view them via **Swagger UI** (once enabled).

---

## 🧠 Purpose

This project serves as a foundation for understanding:

* REST API development with Spring Boot
* Repository abstraction with Spring Data JPA
* Clean exception handling practices
* OpenAPI documentation workflow
* Structuring a production-ready Spring Boot backend

---

## 🔗 Related Links

🔗 [GitHub Repo](https://github.com/michelsami/Spring-boot-java-book-app-CRUD)
🔗 [LinkedIn Post – Initial Setup](https://www.linkedin.com/posts/michel-sabet_github-michelsamispring-boot-java-book-app-crud-activity-7340400283094519808-O-E1?utm_source=share&utm_medium=member_desktop&rcm=ACoAABC2lcYBUh10gbIb59c0wnhcUot7H6V_fUQ)

---


