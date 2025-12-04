# Item Manager (Java)

## Project Goal
Create a simple Java program to manage a shopping list.
Users can add products, remove them, search, display all items, and mark products as purchased by their list number.

## Requirements
The project consists of three main classes/interfaces:

| File | Type | Description |
|------|------|-------------|
| `ItemManager.java` | Interface | Defines methods for managing products |
| `Product.java` | Class | Represents a single product |
| `ItemManagerImpl.java` | Class | Implements the interface and application logic |

## Project Structure
```
ItemManager/
├── src/
│ └── main/
│       └── java/
│           └── ItemManager/
│               ├── ItemManager.java
│               ├── Product.java
│               ├── ItemManagerImpl.java
│               └── Main.java
│ └── test/
│   └── java/
│       └── (Tests to be added)
└── README.md
```

## Tasks & WIP

### 1. Product Class `Product`
- [x] Fields: `name`, `quantity`, `category`, `purchased`
- [x] Constructor
- [x] Getters and Setters
- [x] `showProductInfo()` method

### 2. ItemManager Interface `ItemManager`
- [x] `addItem`
- [x] `removeItem`
- [x] `findItem`
- [x] `getAllItems`

### 3. ItemManagerImpl Class `ItemManagerImpl`
- [x] `productList` field
- [x] Constructor
- [x] Interface implementation
- [x] `showList()`
- [x] `markAsPurchased(int index)`

### 4. Unit Tests (JUnit 5)
- [ ] Setup JUnit 5
- [ ] Create `ItemManagerImplTest`
- [ ] Test `Product` class
- [ ] Test `ItemManagerImpl` class

## Future Goals
- [ ] Refine `showList` method signature
- [ ] Expand the application with more features