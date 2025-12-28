# Vehicle Management System — Assignment 2

## Project Overview
This project demonstrates Object-Oriented Programming concepts using Java.  
The Vehicle Management System showcases inheritance, composition, aggregation, and abstraction by modeling different vehicle types and their drivers.

The project includes:
- An abstract superclass `Vehicle`
- Subclasses `Car`, `Motorcycle`, and `Truck`
- A `Driver` class associated with vehicles
- A main program that stores vehicles in an array and processes them polymorphically

---

## Class Hierarchy

### Superclass: `Vehicle`
- Abstract class
- Fields: `brand`, `year`
- Abstract methods: `startEngine()`, `stopEngine()`
- Concrete method: `displayInfo()`
- Holds a `Driver` object (composition)

### Subclasses
| Class | Specialization | Overridden Methods |
|-------|----------------|--------------------|
| `Car` | adds doors and fuel type | `startEngine()`, `stopEngine()` |
| `Motorcycle` | supports sidecar flag | `startEngine()`, `stopEngine()` |
| `Truck` | adds load capacity and axle count | `startEngine()`, `stopEngine()` |

### Access Modifiers
- `protected` used in `Vehicle` to allow direct subclass access.
- `private` used in `Driver` and subclass-specific fields for encapsulation.
- Constructors leverage `super(...)` for chaining to the superclass.

---

## Driver Association
- Each vehicle *contains* a `Driver` object (composition).
- A single driver can be assigned to multiple vehicles (aggregation).

---

## How to Compile and Run

```bash
javac src/*.java
java -cp src Main
