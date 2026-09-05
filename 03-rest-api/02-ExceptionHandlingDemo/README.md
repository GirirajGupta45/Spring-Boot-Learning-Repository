# Exception Handling in Spring Boot

Exception handling is used to handle errors that occur during the execution of a Spring Boot application and return meaningful responses to the client.

Spring Boot provides different mechanisms for handling exceptions, including **individual exception handling** and **global exception handling**.

---

# 📌 Why Exception Handling is Used

Exception handling helps:

- prevent application failures from reaching the client as unstructured errors
- return appropriate HTTP status codes
- provide meaningful error messages
- maintain consistent error responses
- separate error handling from business logic

---

# 📌 Custom Exceptions

Custom exceptions are application-specific exceptions created to represent particular errors.

Examples:

- `StudentNotFoundException`
- `UserNotFoundException`
- `ResourceAlreadyExistsException`

### Characteristics

- Represent specific application errors
- Usually extend `RuntimeException`
- Make exceptions more meaningful
- Can be handled using Spring's exception-handling mechanisms

---

# 📌 Individual Exception Handling

Individual exception handling handles exceptions within a **specific controller** using `@ExceptionHandler`.

### Characteristics

- Handler is defined inside a controller
- Applies to that controller
- Useful for controller-specific exceptions
- Allows custom error responses

### Use Cases

- Controller-specific errors
- Small applications
- Different controllers requiring different error-handling logic
- Learning `@ExceptionHandler`

---

# 📌 `@ExceptionHandler`

`@ExceptionHandler` is used to define a method that handles a specific exception.

It can be used inside a controller for individual exception handling.

### Benefits

- Handles specific exceptions
- Keeps exception-handling logic organized
- Allows custom HTTP responses
- Prevents default error responses from being returned

---

# 📌 Global Exception Handling

Global exception handling provides a centralized mechanism for handling exceptions across multiple controllers.

It is commonly implemented using `@RestControllerAdvice` along with `@ExceptionHandler`.

### Characteristics

- Centralized exception handling
- Applies across multiple controllers
- Reduces duplicate code
- Provides consistent error responses

### Use Cases

- Enterprise applications
- Multiple REST controllers
- Common application-wide exceptions
- Standardized error responses

---

# 📌 `@RestControllerAdvice`

`@RestControllerAdvice` is used to create a centralized exception-handling component for REST APIs.

It allows exception handlers to be defined separately from controllers and applied across multiple controllers.

### Benefits

- Centralized error handling
- Cleaner controllers
- Consistent API responses
- Easier maintenance

---

# 📌 Exception Handling Flow

```text
Client
   ↓
Controller
   ↓
Service / DAO
   ↓
Exception Occurs
   ↓
Exception Handler
   ↓
Error Response
   ↓
Client
```

---

# 📌 Exception Handling Responsibility

Exception generation and HTTP response handling should be separated.

```text
DAO / Repository
       ↓
Throws Exception
       ↓
Controller / Global Handler
       ↓
HTTP Error Response
```

DAO or Repository should generally **not handle HTTP responses**.

---

# 📌 HTTP Status Codes

| **Status Code** | **Meaning** |
|-----------------|-------------|
| `400` | Bad Request |
| `401` | Unauthorized |
| `403` | Forbidden |
| `404` | Resource Not Found |
| `409` | Conflict |
| `500` | Internal Server Error |

---

# 📌 Individual vs Global Exception Handling

| **Individual Handling** | **Global Handling** |
|-------------------------|---------------------|
| Handler inside Controller | Handler inside Advice class |
| Controller-specific | Application-wide |
| Less centralized | Centralized |
| More duplication | Less duplication |
| Suitable for specific cases | Suitable for common exceptions |

---

# 📌 Error Response

A REST API should return a structured error response instead of exposing internal exception details.

Common fields include:

- `status`
- `message`
- `timestamp`
- `error`
- `path`

A consistent error-response structure makes it easier for clients to process API errors.

---

# 📌 Best Practices

- Create meaningful custom exceptions.
- Use appropriate HTTP status codes.
- Keep exception handling separate from DAO and business logic.
- Use `@RestControllerAdvice` for common application-wide exceptions.
- Maintain a consistent error-response structure.
- Avoid exposing stack traces and sensitive internal information.
- Prefer global handling when the same exception is handled by multiple controllers.

---

# 🎯 Key Takeaway

Spring Boot provides multiple approaches to exception handling:

- `@ExceptionHandler` → handles specific exceptions
- Individual handling → controller-specific exception handling
- `@RestControllerAdvice` → centralized exception handling
- Global handling → common exception handling across controllers
- Custom exceptions → represent application-specific errors
- HTTP status codes → communicate the type of error to the client

Proper exception handling improves **API reliability, consistency, maintainability, and separation of responsibilities**.