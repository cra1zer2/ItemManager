# 🛒 ItemManager (Java)

## 📖 Overview
**ItemManager** is a Java-based application designed to manage a shopping list. It demonstrates core Object-Oriented Programming (OOP) principles, interface implementation, and collection handling in Java.

The project goes beyond basic requirements by including a driver class (`Main.java`) to demonstrate functionality and structured output formatting.

## ✨ Features
- **Product Management**: Create products with name, quantity, and category.
- **List Operations**:
    - Add new items.
    - Remove items by name.
    - Search for specific items.
    - Display all items in the list.
- **Status Tracking**: Mark items as "Purchased" or "Not Purchased".
- **Formatted Output**: Custom display methods for product details.

## 📂 Project Structure
The project is organized into a clean package structure:

```
ItemManager/
├── src/
│   ├── main/java/ItemManager/
│   │   ├── ItemManager.java       # Interface defining core operations
│   │   ├── ItemManagerImpl.java   # Concrete implementation of the logic
│   │   ├── Product.java           # Data model for a single product
│   │   └── Main.java              # Entry point / Demonstration script
│   └── test/java/                 # (Reserved for JUnit tests)
└── README.md
```

## 🚀 Implementation Status

### ✅ Completed
- **Core Logic**: Full implementation of `ItemManager` interface and `Product` model.
- **Data Handling**: `ArrayList` integration for dynamic list management.
- **Demonstration**: `Main.java` setup to populate and display sample data (Oranges, Matcha, Apple).
- **Output**: `showProductInfo()` and `showList()` methods are functional.

### 🚧 In Progress
- **Unit Testing**: Integration of **JUnit 5** to verify logic (Constructors, Add/Remove flows).

## 🎓 Educational Roadmap & Future Goals
Since this is an educational project, future development focuses on learning new concepts:

1.  **Unit Testing (Priority)**:
    -   Implement comprehensive test coverage using JUnit 5.
    -   Test edge cases (e.g., removing non-existent items).
2.  **Interactive CLI**:
    -   Expand `Main.java` to use `Scanner` for a fully interactive command-line interface (User Input Loop).
3.  **Data Persistence**:
    -   Save and load the shopping list from a file (`.txt` or `.json`) so data survives restart.
4.  **Advanced Java Features**:
    -   Use Java Streams API for filtering and sorting the list.
    -   Explore Dependency Injection concepts.