# Assignment #1 — Builder Pattern: Car Configuration System

**Course:** Software Design Patterns  
**Topic:** Car Production & Configuration

---

## 1. Domain Description

This project implements the classical **GoF Builder Creational Design Pattern** using a car production system.

A car is a complex object that contains multiple configurable properties:

- Brand
- Model
- Engine
- Color
- Transmission
- Air Conditioning
- GPS

The Builder Pattern allows cars to be constructed step by step using the same construction process.

---

## 2. Pattern Components

| Component | File | Responsibility |
|---|---|---|
| **Product** | `Car.java` | Represents the final car object. |
| **Builder** | `CarBuilder.java` | Builds the car step by step using method chaining. |
| **Director** | `CarDirector.java` | Provides reusable car configurations. |
| **Client** | `Main.java` | Tests the Builder and Director. |

---

## 3. Clean Code Principles Justification

### 1. Meaningful, Intention-Revealing Names

- **Before:**
  ```java
  builder.setC("BMW");
  builder.make();

After:

builder.setBrand("BMW");
director.createSportCar();
Justification: Names clearly describe the purpose of variables and methods.
2. Small Functions
   Before: One large method responsible for configuring the entire car.

After:

public CarBuilder setBrand(String brand) {
this.brand = brand;
return this;
}
Justification: Each method performs one focused operation.
3. No Magic Strings

Before:

.setTransmission("Automatic")

After:

private static final String AUTOMATIC_TRANSMISSION = "Automatic";
.setTransmission(AUTOMATIC_TRANSMISSION)
Justification: Named constants make repeated values easier to understand and maintain.
4. Validated Construction

Before:

return new Car(...);

After:

if (brand == null || brand.isBlank()) {
throw new IllegalStateException("Brand is required");
}
Justification: The Builder prevents incomplete or invalid Car objects from being created.
5. Focused Classes
   Car
   ↓
   Product

CarBuilder
↓
Builds the product

CarDirector
↓
Creates predefined configurations

Main
↓
Client
Justification: Each class has one clear responsibility.
4. Method Chaining

The Builder uses a Fluent API.

Each setter returns this:

public CarBuilder setModel(String model) {
this.model = model;
return this;
}

This allows:

Car car = new CarBuilder()
.setBrand("Audi")
.setModel("A6")
.setEngine("2.0L")
.setColor("Blue")
.setTransmission("Automatic")
.setAirConditioning(true)
.setGps(false)
.build();
5. Car Configurations

The project demonstrates several configurations:

Sport Car — BMW M5
Family Car — Toyota Camry
Luxury Car — Mercedes-Benz S-Class
Custom Car — Audi A6
6. Execution

Run the program through Main.java.

Example output:

Sport Car:
Car{brand='BMW', model='M5', engine='V8', color='Black', transmission='Automatic', airConditioning=true, gps=true}

Family Car:
Car{brand='Toyota', model='Camry', engine='2.5L', color='White', transmission='Automatic', airConditioning=true, gps=false}

Luxury Car:
Car{brand='Mercedes-Benz', model='S-Class', engine='V8', color='Silver', transmission='Automatic', airConditioning=true, gps=true}

Custom Car:
Car{brand='Audi', model='A6', engine='2.0L', color='Blue', transmission='Automatic', airConditioning=true, gps=false}