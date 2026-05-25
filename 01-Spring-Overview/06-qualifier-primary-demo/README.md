# `@Qualifier` and `@Primary` in Spring

`@Qualifier` and `@Primary` are annotations used in Spring to resolve bean ambiguity during Dependency Injection.

They are mainly required when multiple beans of the same type exist inside the Spring IoC Container.

---

# 📌 Why These Annotations are Needed

When Spring finds more than one bean of the same type, it becomes confused about which bean should be injected.

This situation causes:

* bean ambiguity
* autowiring conflicts
* application startup errors

`@Qualifier` and `@Primary` help Spring decide which bean to inject.

---

# 📌 `@Primary`

`@Primary` marks a bean as the default choice for dependency injection.

When multiple beans of the same type exist:

* Spring automatically selects the bean marked with `@Primary`
* unless another bean is explicitly specified using `@Qualifier`

---

# 📌 Characteristics of `@Primary`

| Feature                | Description                            |
| ---------------------- | -------------------------------------- |
| Default Bean Selection | Chosen automatically during autowiring |
| Reduces Configuration  | No need to specify bean every time     |
| Global Preference      | Preferred across the application       |

---

# 📌 When to Use `@Primary`

Use `@Primary` when:

* one implementation should act as the default
* most parts of the application use the same implementation
* reducing repetitive configuration is preferred

---

# 📌 `@Qualifier`

`@Qualifier` is used to explicitly specify which bean should be injected.

It provides precise control over dependency injection.

Instead of relying on default selection, Spring injects the specifically qualified bean.

---

# 📌 Characteristics of `@Qualifier`

| Feature                 | Description                                          |
| ----------------------- | ---------------------------------------------------- |
| Explicit Bean Selection | Chooses a specific bean                              |
| Resolves Ambiguity      | Eliminates confusion between multiple beans          |
| Fine-Grained Control    | Allows different implementations in different places |

---

# 📌 When to Use `@Qualifier`

Use `@Qualifier` when:

* multiple implementations are required
* different modules need different beans
* explicit dependency selection is needed

---

# 📌 `@Primary` vs `@Qualifier`

| `@Primary`                     | `@Qualifier`                              |
| ------------------------------ | ----------------------------------------- |
| Sets default bean              | Selects specific bean                     |
| Global preference              | Local explicit selection                  |
| Less configuration             | More precise control                      |
| Used for common implementation | Used for multiple implementation handling |

---

# 📌 Priority Rule

If both annotations are present:

* `@Qualifier` takes higher priority than `@Primary`

Spring always prefers explicit bean selection over default selection.

---

# 📌 Common Real-World Usage

* Multiple payment gateway implementations
* Different database services
* Notification systems (Email, SMS, Push)
* Multiple caching providers
* Different authentication strategies

---

# 📌 Common Issues

| Issue                           | Cause                                   |
| ------------------------------- | --------------------------------------- |
| NoUniqueBeanDefinitionException | Multiple beans found without resolution |
| Autowiring Failure              | Incorrect qualifier name                |
| Wrong Bean Injection            | Improper default configuration          |

---

# 📌 Best Practices

* Use `@Primary` for default/common implementations
* Use `@Qualifier` for explicit control
* Keep bean names meaningful
* Avoid unnecessary multiple implementations
* Prefer constructor injection with qualifiers

---

# 📌 Related Concepts

* Dependency Injection
* Autowiring
* Beans
* IoC Container
* Component Scanning

---

# 🎯 Key Takeaway

`@Primary` and `@Qualifier` are essential Spring annotations used to resolve dependency injection ambiguity.

* `@Primary` → defines the default bean
* `@Qualifier` → explicitly selects a specific bean

Together, they provide flexibility and precise control over Spring’s dependency injection mechanism.
