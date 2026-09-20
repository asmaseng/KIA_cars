# Assignment #2 — Factory Method & Abstract Factory

## Topic
Kia Cars

## Part A — Factory Method

The Factory Method pattern is used to create different Kia car models.

### Product
- Car

### Concrete Products
- KiaSportage
- KiaK5

### Creator
- CarFactory

### Concrete Creators
- SportageFactory
- K5Factory

The factory method is `createCar()`.

---

## Part B — Abstract Factory

The Abstract Factory pattern creates families of related Kia products.

### Abstract Products
- KiaCar
- KiaEngine
- KiaInterior

### Family 1
Standard Kia:
- StandardKiaCar
- StandardKiaEngine
- StandardKiaInterior

### Family 2
Sport Kia:
- SportKiaCar
- SportKiaEngine
- SportKiaInterior

### Concrete Factories
- KiaStandardFactory
- KiaSportFactory

### Client

`KiaClient` works only with abstract factory and abstract product interfaces.

It does not directly instantiate concrete products.

---

## Clean Code Principles

### 1. Meaningful Names
Classes and methods have names that clearly describe their purpose.

### 2. Small Methods
Methods perform one focused task.

### 3. Focused Classes
Each class has a clear responsibility.

### 4. Validated Construction
`CarConfiguration` validates required values and throws a clear exception for invalid state.

### 5. No Magic Values
Reusable values are stored in named constants.

---

## Technologies

- Java 17
- Maven
- IntelliJ IDEA

## Git History

Commit 1:
`Implement Factory Method for Kia cars`

Commit 2:
`Add Abstract Factory for Kia car families`