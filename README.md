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
├── pom.xml                # Maven configuration
├── src/
│   ├── main/java/ItemManager/
│       ├── ItemManager.java       # Interface defining core operations
│       ├── ItemManagerImpl.java   # Concrete implementation of the logic
│       ├── Product.java           # Data model for a single product
│       └── Main.java              # Entry point / Demonstration script
```
## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven

### Build and Run
1. Navigate to the project root:
   ```bash
   cd ItemManager
   ```
2. Compile the project:
   ```bash
   mvn clean compile
   ```
3. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="ItemManager.Main"
   ```

## 🔮 Future Improvements
1.  **Input Validation**:
    -   Test edge cases (e.g., removing non-existent items).
2.  **Interactive CLI**:
    -   Expand `Main.java` to use `Scanner` for a fully interactive command-line interface (User Input Loop).
3.  **Data Persistence**:
    -   Save and load the shopping list from a file (`.txt` or `.json`) so data survives restart.
4.  **Advanced Java Features**:
    -   Use Java Streams API for filtering and sorting the list.
    -   Explore Dependency Injection concepts.