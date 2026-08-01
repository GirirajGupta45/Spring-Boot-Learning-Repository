# CRUD Operations using JPA EntityManager

This project demonstrates how to perform basic **CRUD (Create, Read, Update, Delete)** operations using **JPA**, **Hibernate**, and **EntityManager** in a Spring Boot application without using Spring Data JPA repositories.

---

# Learning Objectives

After completing this project, you will understand:

- JPA Architecture
- Hibernate as JPA Provider
- EntityManager API
- Persistence Context
- Entity Lifecycle
- CRUD Operations
- Transaction Management
- REST API integration with JPA

---

# Project Structure

```
Controller
      │
      ▼
DAO Interface
      │
      ▼
DAO Implementation
      │
      ▼
EntityManager
      │
      ▼
Hibernate
      │
      ▼
MySQL Database
```

---

# EntityManager Methods Used

| Method | Purpose |
|---------|---------|
| persist() | Insert new entity |
| find() | Retrieve entity by Primary Key |
| merge() | Update detached entity |
| remove() | Delete managed entity |

---

# Request Flow

```
Postman
      │
      ▼
Controller
      │
      ▼
DAO
      │
      ▼
EntityManager
      │
      ▼
Hibernate
      │
      ▼
MySQL
```

---

# Persistence Context

EntityManager maintains a **Persistence Context**.

```
EntityManager
       │
       ▼
Persistence Context
       │
       ├── Student(id=1)
       ├── Student(id=2)
       └── Student(id=3)
```

Every managed entity resides inside the Persistence Context until the transaction ends or it is detached.

---

# Entity Lifecycle

```
New Entity
     │
persist()
     │
     ▼
Managed Entity
     │
merge()
     │
     ▼
Updated Entity
     │
remove()
     │
     ▼
Removed Entity
```

---

# Transaction Management

Database modifying operations must execute inside a transaction.

```java
@Transactional
```

Used for:

- Save
- Update
- Delete

Read operations generally do not require an explicit transaction in simple scenarios.

---

# Advantages of EntityManager

- Standard JPA API.
- Works with any JPA Provider (Hibernate, EclipseLink, etc.).
- Fine-grained control over Persistence Context.
- Direct interaction with Hibernate.
- Supports JPQL and Native SQL.
- Better understanding of JPA internals.
- Excellent for learning Hibernate fundamentals.

---

# Limitations of EntityManager

### 1. Boilerplate Code

Every CRUD operation requires manual implementation.

Example

```
Controller
      ↓
DAO
      ↓
EntityManager
```

Compared to Spring Data JPA, more code must be written.

---

### 2. No Automatic Repository Methods

Methods like:

```
save()
findAll()
findById()
deleteById()
```

must be implemented manually.

---

### 3. Manual Query Writing

Complex queries require explicit JPQL or Native SQL.

---

### 4. More Responsibility

The developer is responsible for:

- Transactions
- Persistence Context
- Entity state
- Query optimization

---

### 5. More Time Consuming

Building large enterprise applications solely with EntityManager requires significantly more effort than using Spring Data JPA.

---

# When to Use EntityManager

Recommended for:

- Learning JPA
- Learning Hibernate
- Understanding Persistence Context
- Learning Entity Lifecycle
- Custom JPQL
- Native SQL Queries
- Fine-grained database control

---

# When Spring Data JPA is Better

Recommended for:

- Enterprise applications
- Rapid development
- Production-ready REST APIs
- Standard CRUD operations
- Repository abstraction

---

# EntityManager vs Spring Data JPA

| EntityManager | Spring Data JPA |
|---------------|-----------------|
| Low Level API | High Level Abstraction |
| Manual CRUD | Automatic CRUD |
| More Control | Less Boilerplate |
| Better for Learning | Better for Productivity |
| Requires More Code | Minimal Code |
| Uses EntityManager Internally | Built on top of EntityManager |

---

# Key Concepts Learned

- JPA
- Hibernate
- EntityManager
- Persistence Context
- Entity Lifecycle
- Transactions
- CRUD Operations
- REST APIs
- DAO Pattern
- Dependency Injection

---

# Conclusion

This project provides a complete understanding of implementing CRUD operations using **JPA EntityManager** and **Hibernate**. Instead of relying on Spring Data JPA repositories, all database interactions are performed manually through the EntityManager, helping build a strong foundation in JPA internals, persistence context, entity lifecycle, and transaction management.