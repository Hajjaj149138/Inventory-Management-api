# 📦 Inventory Management System API

A robust and scalable RESTful API built with **Spring Boot**, following a professional **Layered Architecture**. This project manages product inventories with built-in data validation and standardized API responses.

---

## ✨ Key Features

* **Layered Architecture**: Organized into `controller`, `service`, `repository`, `model`, and `dto` for high maintainability.
* **Full CRUD Operations**: Create, Read, Update, and Delete products seamlessly.
* **Data Validation**: Strict input validation using Jakarta Bean Validation (e.g., `@NotBlank`, `@Positive`).
* **Generic Response Wrapper**: All API responses follow a consistent `{ success, message, data }` format.
* **H2 In-Memory Database**: Quick setup with an embedded database for testing and development.

---

## 🛠️ Tech Stack

* **Java 17**
* **Spring Boot 3.x**
* **Spring Data JPA** (Hibernate)
* **H2 Database**
* **Lombok** (to reduce boilerplate code)

---

## 📂 Project Structure

```text
src/main/java/com/example/inventory_management/
├── controller   # REST Endpoints
├── service      # Business Logic
├── repository   # Database Communication
├── model        # Entities & Enums
└── dto          # Data Transfer Objects (API Response)
