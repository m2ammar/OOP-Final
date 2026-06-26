# OOP Final Project — Java Practice Collection

A comprehensive collection of Java programs built throughout my OOP course at KSBL, covering everything from basic class design to multithreading. This repo documents my progression from simple object modeling to complex system design.

---

## About

These programs were written as lab tasks, assignment practice, and exam preparation. Each package is a self-contained mini-system targeting a specific OOP concept or real-world domain.

---

## Highlights

### Hardest Problems

**Zoo (Cage System)**
The most challenging problem in this collection. The `Cage` class required implementing `addAnimal()` with two constraints enforced simultaneously — capacity limit of 5 animals per cage, and no duplicate species allowed within the same cage. No expected output or hints were given. The distribution logic in `Zoo` then had to randomly fill 50 cages with 100–200 animals while respecting those constraints, retrying on failure without overcounting.

**Snakes and Ladders**
Built from scratch with no starter logic provided. Required designing the board game mechanics independently — turn handling, position tracking, snake/ladder triggers, and game state display — using OOP principles rather than procedural logic.

### Math Without Formulas

**Triangle (midsquestions)**
Given only a `MyPoint` class and asked to compute triangle area. Had to independently derive the coordinate geometry formula:
Area = |x_a(y_b - y_c) + x_b(y_c - y_a) + x_c(y_a - y_b)| / 2
Also implemented collinearity detection in the constructor to reject degenerate triangles.

---

## Packages

| Package | Concepts Covered |
|---|---|
| `AssignmentPractice` | Classes, inheritance basics |
| `BankSystem` | Abstract classes, loan types |
| `BankAccountSystem` | Sports team hierarchy |
| `CarInternal` | Composition, internal components |
| `FinalHospital` | Full hospital domain model |
| `FitnessCenter` | Member types, polymorphism |
| `GradingSystem` | Encapsulation, grade logic |
| `HospitalManagementSystem` | Patient types, inheritance |
| `HospitalPatientSystem` | Emergency/In/OutPatient hierarchy |
| `LibrarySystem` | Staff and member roles |
| `PaySystem` | Full-time vs part-time pay |
| `RideHandlingCompany` | Interfaces (`Trackable`), vehicles |
| `ScholarshipLottery` | Randomized selection logic |
| `ScholarshipSystem` | Fined vs scholarship students |
| `SmartHome` | Device abstraction |
| `SnakesNLadder` | Board game OOP design |
| `SportsClub` | Member specialization |
| `Threading` | Multithreading basics |
| `ThreadingBMe` | Extended thread practice |
| `Transactions` | Orders, payment methods |
| `VehicleSystem` | Electric vs regular car |
| `Zoo` | Complex constraint-based system |
| `Lab12 / Lab12Task` | Generics, wildcards |
| `Lab13` | Calculator with generics |
| `LabTask13march` | Library generics practice |
| `midsquestions` | Geometry, coordinate math |

---

## Tech Stack

- Java (JDK 17+)
- IntelliJ IDEA
- No external libraries — pure Java

---

## How to Run

Open the project in IntelliJ IDEA and run the `Main.java` inside any package directly.

---

## Author

**Muhammad Ammar** — BSCS Data Science, KSBL Karachi
GitHub: [m2ammar](https://github.com/m2ammar)
