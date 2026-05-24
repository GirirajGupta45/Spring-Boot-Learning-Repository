# Dependency Injection (DI)

Dependency Injection (DI) is a design pattern used to achieve loose coupling between objects.
Instead of a class creating its own dependencies, the dependencies are provided from an external source.

DI is one of the core concepts of the Spring Framework and is used to improve flexibility, maintainability, and testability of applications.

---

# 📌 Why Dependency Injection Exists

Without DI:

* Classes become tightly coupled
* Dependency management becomes difficult
* Testing becomes harder
* Code becomes less reusable

With DI:

* Objects remain independent
* Dependencies can be changed easily
* Unit testing becomes simpler
* Application becomes modular and maintainable

---

# 📌 Core Idea

A class should focus only on its own responsibility rather than creating and managing dependent objects.

Dependency Injection shifts the responsibility of object creation and dependency management to the Spring IoC Container.

---

# 📌 Relationship with IoC

Dependency Injection is a way to implement Inversion of Control (IoC).

* **IoC** → Principle
* **DI** → Technique used to achieve IoC

Instead of the application controlling object creation, the framework controls it.

---

# 📌 Types of Dependency Injection

## Constructor Injection

Dependencies are provided through the constructor.

### Characteristics

* Recommended approach in Spring
* Promotes immutability
* Ensures required dependencies are available at object creation
* Easier unit testing

### Best Used When

Dependencies are mandatory.

---

## Setter Injection

Dependencies are provided using setter methods.

### Characteristics

* Allows optional dependencies
* More flexible configuration
* Dependencies can be modified after object creation

### Best Used When

Dependencies are optional.

---

## Field Injection

Dependencies are injected directly into fields.

### Characteristics

* Shorter syntax
* Less boilerplate code

### Drawbacks

* Difficult to test
* Breaks encapsulation
* Not recommended for production-grade applications

---

# 📌 Advantages of Dependency Injection

| Advantage          | Description                         |
| ------------------ | ----------------------------------- |
| Loose Coupling     | Components remain independent       |
| Better Testability | Easy to mock dependencies           |
| Maintainability    | Easier to modify and extend         |
| Reusability        | Components can be reused easily     |
| Scalability        | Supports modular application design |

---

# 📌 DI in Spring Framework

The Spring IoC Container manages:

* object creation
* dependency injection
* bean lifecycle
* configuration management

Spring automatically injects required dependencies into managed beans.

---

# 📌 Important Concepts Related to DI

| Concept       | Purpose                               |
| ------------- | ------------------------------------- |
| Bean          | Object managed by Spring              |
| IoC Container | Manages objects and dependencies      |
| Autowiring    | Automatic dependency resolution       |
| Bean Scope    | Defines bean lifecycle and visibility |
| Configuration | Defines how beans are created         |

---

# 📌 Constructor Injection vs Setter Injection

| Constructor Injection  | Setter Injection       |
| ---------------------- | ---------------------- |
| Mandatory dependencies | Optional dependencies  |
| Immutable design       | Mutable design         |
| Recommended approach   | Used for flexibility   |
| Better testing support | Easier reconfiguration |

---

# 📌 Common Real-World Usage

* Service and Repository communication
* Database connectivity
* API integrations
* Authentication systems
* Enterprise application architecture

---

# 📌 Important Notes

* Spring officially recommends Constructor Injection for most cases.
* Dependency Injection reduces hardcoded object creation.
* DI improves separation of concerns.
* Large Spring applications heavily rely on DI architecture.

---

# 🎯 Key Takeaway

Dependency Injection is one of the foundational concepts of Spring Framework that enables:

* loose coupling
* cleaner architecture
* better scalability
* easier testing
* maintainable enterprise applications
