# Component Scanning in Spring

Component Scanning is a mechanism in Spring that automatically detects and registers classes as Spring Beans.

Instead of manually configuring beans, Spring scans specified packages and creates objects for classes marked with stereotype annotations.

---

# 📌 Purpose of Component Scanning

Component Scanning helps:

* reduce manual bean configuration
* automate bean registration
* simplify application setup
* support scalable application architecture

It is one of the core features behind Spring’s automatic dependency management.

---

# 📌 How Component Scanning Works

During application startup, Spring scans packages for classes annotated with:

* `@Component`
* `@Service`
* `@Repository`
* `@Controller`
* `@RestController`

Once detected:

* Spring creates objects (beans)
* stores them inside IoC Container
* manages their lifecycle and dependencies

---

# 📌 Stereotype Annotations

| Annotation        | Purpose                          |
| ----------------- | -------------------------------- |
| `@Component`      | Generic Spring-managed component |
| `@Service`        | Service/business layer component |
| `@Repository`     | Data access layer component      |
| `@Controller`     | MVC controller                   |
| `@RestController` | REST API controller              |

These annotations make classes eligible for component scanning.

---

# 📌 Default Scanning Behavior

By default, Spring Boot scans:

* the package containing the main application class
* all its sub-packages

Because of this, project package structure becomes very important.

---

# 📌 `scanBasePackages`

`scanBasePackages` is used to explicitly define which packages Spring should scan for components.

It is commonly used when:

* components exist outside the default package hierarchy
* working with modular applications
* integrating external modules
* customizing scanning behavior

---

# 📌 Why `scanBasePackages` is Needed

Sometimes Spring cannot detect beans because:

* classes are located in different package hierarchies
* modules are separated
* application structure is customized

In such cases, specifying base packages ensures Spring scans the correct locations.

---

# 📌 Benefits of Component Scanning

| Benefit                  | Description                        |
| ------------------------ | ---------------------------------- |
| Less Configuration       | Reduces XML/manual setup           |
| Automatic Bean Detection | Beans are registered automatically |
| Cleaner Architecture     | Encourages layered design          |
| Better Maintainability   | Easier project management          |
| Faster Development       | Minimal configuration required     |

---

# 📌 Common Issues

| Issue                         | Cause                        |
| ----------------------------- | ---------------------------- |
| Bean Not Found                | Package not scanned          |
| Autowiring Failure            | Component missing from scan  |
| NoSuchBeanDefinitionException | Spring unable to detect bean |

Most component scanning issues are related to incorrect package structure or scanning configuration.

---

# 📌 Best Practices

* Keep the main application class at the root package
* Maintain proper package hierarchy
* Use stereotype annotations appropriately
* Use `scanBasePackages` only when necessary
* Prefer clean modular package organization

---

# 📌 Related Concepts

* IoC Container
* Dependency Injection
* Beans
* Autowiring
* Bean Lifecycle

---

# 🎯 Key Takeaway

Component Scanning enables Spring to automatically discover and manage application components.

It plays a critical role in:

* automatic bean creation
* dependency injection
* scalable Spring architecture
* reducing configuration overhead

`scanBasePackages` provides additional control over how and where Spring performs component scanning.
