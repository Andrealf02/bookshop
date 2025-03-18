# Library Management System

## Project Overview

This project implements a simple **Library Management System** using a **Hexagonal Architecture**. The application allows customers to borrow books from the library, simulating operations such as querying available books and saving loan orders. The design follows clean architecture principles, ensuring separation of concerns between the application's core logic, input/output, and external dependencies.

---

## Technologies Used

- **Java**: The programming language for implementation.
- **Spring Boot**: For creating RESTful APIs.
- **Maven**: For dependency management.
- **Hexagonal Architecture**: To maintain modularity and scalability of the system.

---

## Project Structure

The project is organized into distinct layers following the Hexagonal Architecture:

```plaintext
src/main/java/com/library
├── application
│   ├── controllers
│   │   └── LibraryController.java  // Handles incoming HTTP requests
├── domain
│   ├── entities
│   │   ├── Book.java               // Represents a library book
│   │   └── Order.java              // Represents a loan order
│   ├── ports
│   │   └── BookRepository.java     // Interface for external dependencies
│   └── services
│       └── LibraryService.java     // Core business logic
├── infrastructure
│   ├── adapters
│   │   └── DatabaseBookRepository.java  // Simulates database operations

````

# Library Management System

## Descriptions of Key Components

### application/controllers:
- **LibraryController.java**: Exposes REST endpoints to interact with the library system (e.g., borrowing books).

### domain/entities:
- **Book.java**: Represents the title of a book.
- **Order.java**: Captures information about a loan order (customer name and book title).

### domain/ports:
- **BookRepository.java**: A port that defines the required operations for interacting with the data source.

### domain/services:
- **LibraryService.java**: Contains the core logic for processing loan requests (e.g., checking availability and saving orders).

### infrastructure/adapters:
- **DatabaseBookRepository.java**: Simulates the persistence layer with static data for available books.

---

## Endpoints

### Borrow a Book
- **URL**: `/library/borrow`
- **Method**: `POST`

#### Parameters:
- `customerName`: Name of the customer borrowing the book.
- `bookTitle`: Title of the book to borrow.

#### Response:
- `"El préstamo fue exitoso."`: If the book is successfully borrowed.
- `"El libro no está disponible."`: If the requested book is unavailable.

#### Example Request:
```http
POST /library/borrow?customerName=John&bookTitle=Don Quijote
````

## Sample Workflow

1. **Customer wants to borrow a book:**  
   The customer submits a `POST` request to `/library/borrow` with their name and the title of the book they want to borrow.

2. **System checks availability:**  
   The `LibraryService` checks if the book is available using the `DatabaseBookRepository`.

3. **Process the loan:**  
   If the book is available, a new `Order` is created and saved using the repository.

4. **Respond to the customer:**  
   The system responds indicating whether the loan was successful or the book is unavailable.

## Author

Developed by **Alf**.  
Feel free to reach out for questions, suggestions, or contributions.