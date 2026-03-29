# 🧪 UI Automation Framework – SauceDemo

A simple, scalable UI automation framework built using:

* **Java 17**
* **Selenide**
* **Cucumber (BDD)**
* **Spring (Lightweight DI)**
* **JUnit 5**
* **Allure Reporting**

---

# 🚀 Project Overview

This framework automates key user flows on the **SauceDemo** website:

* ✅ Login functionality
* 🛒 Add to cart functionality

It follows **Page Object Model (POM)** and clean architecture principles.

---

# 📁 Project Structure

```
src
 ├── main
 │   ├── java/com/company/automation
 │   │    ├── config        # Spring + Selenide config
 │   │    ├── enums         # User types (extendable)
 │   │    └── pages         # Page Object classes
 │   │
 │   └── resources
 │         └── application.properties
 │
 └── test
     ├── java/com/company/automation
     │    ├── steps         # Step Definitions
     │    ├── hooks         # Hooks (Screenshots, teardown)
     │    ├── runner        # Cucumber Runner
     │    └── config        # Cucumber Spring Config
 │
     └── resources/features
           ├── login.feature
           └── add_to_cart.feature
```

---

# ⚙️ Configuration

### 📄 application.properties

```
app.url=https://www.saucedemo.com
browser=chrome
timeout=10000

app.username=standard_user
app.password=secret_sauce
```

---

# ▶️ How to Run Tests

### Run all tests:

```
./gradlew clean test
```

---

# 📊 Allure Report

### Generate report:

```
./gradlew allureReport
```

### Open report:

```
./gradlew allureServe
```

---

# 🧩 Tech Stack

| Tool     | Purpose              |
| -------- | -------------------- |
| Selenide | UI automation        |
| Cucumber | BDD                  |
| Spring   | Dependency Injection |
| JUnit 5  | Test Runner          |
| Allure   | Reporting            |

---

# 🛒 Sample Test Flow

### Login + Add to Cart

```
Given user is on login page
When user logs in
And user adds item to cart
And user opens cart
Then item should be visible in cart
```

---

# 📸 Reporting Features

* Screenshot on failure
* Step-level reporting (Allure)

---

# ⚠️ Known Improvements

* Add multi-user support via Enum
* Add parallel execution
* Add retry mechanism for flaky tests
* Add API + UI hybrid testing

---

# 🧠 Best Practices Followed

* Page Object Model (POM)
* Separation of concerns
* Clean step definitions
* Minimal Spring usage (no over-engineering)

---

# 👨‍💻 Author

Automation Framework designed for learning and scalable QA automation.

---

# ⭐ Future Enhancements

* Docker execution
* CI/CD integration (Jenkins/GitHub Actions)
* Cross-browser testing
* Dynamic test data handling

---
