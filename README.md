# Tender Builder Pattern (Java)

This project is a Java implementation of the **Builder Design Pattern** developed in accordance with **Clean Code** principles and academic requirements for AITU.

The domain model is centered around a **Tender Management System**. It demonstrates how a single construction process managed by a Director can produce two entirely different product representations: an in-memory Java object (`WebTender`) and a structured specification document (`TenderSpecification`).

---

## 🛠 Key Features & Architecture

* **Fluent API:** Every configuration method returns `this` (`TenderBuilder`), enabling method chaining.
* **Immutable Product:** The `WebTender` class has `final` fields, no public setters, and a package-private constructor to ensure strong encapsulation.
* **Dual Representations:**
  1. `WebTenderBuilder` — Constructs a strongly typed `WebTender` domain object.
  2. `TenderSpecificationBuilder` — Generates a formatted `TenderSpecification` document object using `StringBuilder`.
* **Decoupled Director:** `TenderDirector` manages predefined workflows (`makeAgroTender`, `makeITTender`) while depending solely on the `TenderBuilder` interface.
* **State Validation:** The `getResult()` method validates required fields and throws an `IllegalStateException` on invalid or missing data.

---

## 📁 Package Structure

```text
src/
└── kz/aitu/se2534/tender/
    ├── WebTender.java
    ├── TenderSpecification.java
    ├── TenderBuilder.java
    ├── WebTenderBuilder.java
    ├── TenderSpecificationBuilder.java
    ├── TenderDirector.java
    └── Main.java
```
---

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK 17 or higher)

### Compilation & Execution

# 1. Clone the repository:
git clone https://github.com/your-username/tender-builder-pattern.git
cd tender-builder-pattern

# 2. Navigate to the source directory and compile the project:
javac -d bin src/kz/aitu/se2534/tender/*.java

# 3. Run the application:
java -cp bin kz.aitu.se2534.tender.Main
