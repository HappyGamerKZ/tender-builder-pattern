# Tender Builder Pattern (Java)

This project is a Java implementation of the **Builder Design Pattern** developed in accordance with **Clean Code** principles[cite: 1].

The domain model is centered around a **Tender Management System**[cite: 1]. It demonstrates how a single construction process can produce two entirely different product representations: a concrete Java object (`Tender`) and a formatted text document (`String Spec Sheet`)[cite: 1].

---

## 🛠 Key Features & Architecture

* **Fluent API:** Every configuration method returns `this` (`TenderBuilder`), enabling method chaining[cite: 1].
* **Immutable Product:** The `Tender` class has `final` fields, no public setters, and a package-private constructor to prevent unauthorized modification[cite: 1].
* **Dual Representations:**
    1. `WebTenderBuilder` — Constructs an in-memory `Tender` object[cite: 1].
    2. `DocumentTenderBuilder` — Generates a human-readable text specification sheet[cite: 1].
* **Decoupled Director:** `TenderDirector` manages predefined workflows (`makeAgroTender`, `makeITTender`) while depending solely on the `TenderBuilder` interface[cite: 1].
* **State Validation:** The `getResult()` method validates required fields and throws an `IllegalStateException` on invalid or missing data[cite: 1].

---

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK 17 or higher)

### Compilation & Execution

# 1. Clone the repository:
git clone https://github.com/your-username/tender-builder-pattern.git
cd tender-builder-pattern

# 2. Navigate to the source directory and compile the project:
javac -d bin src/com/example/builder/*.java

# 3. Run the application:
java -cp bin com.example.builder.Main