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

**SnakesNLadder & SnakesNLadder1**
Two independent implementations of Snakes and Ladders built from scratch with no starter logic. `SnakesNLadder` uses a `BoardGame` base class with `SnakesAndLadders` extending it. `SnakesNLadder1` is a more detailed implementation with separate `Cell`, `Snake`, `Ladder`, and `SnLBoard` classes — full board modeled as objects.

### Math Without Formulas

**Triangle (midsquestions)**
Given only a `MyPoint` class and asked to compute triangle area. Had to independently derive the coordinate geometry formula:

Area = |x_a(y_b - y_c) + x_b(y_c - y_a) + x_c(y_a - y_b)| / 2

Also implemented collinearity detection in the constructor to reject degenerate triangles.

**MyRectangle**
Geometry-based rectangle operations using `MyPoint` objects — area, perimeter, and point-based construction without a formula being provided.

---

## Packages

| Package | Classes | Concepts Covered |
|---|---|---|
| `AssignmentPractice` | `AssignmentBulb`, `Person` (interface), `Student`, `Teacher`, `Main`, `Main1` | Inheritance, interfaces, basic OOP |
| `BankAccountSystem` | `Sports` (interface), `AmateurTeam`, `ProfessionalTeam`, `YouthTeam` | Interface implementation, team hierarchy |
| `BankSystem` | `LoanAccount` (abstract), `SimpleLoan`, `CompoundLoan` | Abstract classes, loan calculation |
| `CarInternal` | `Car`, `Brakes`, `Gears` (enum), `PushStart` | Composition, enums |
| `Company` | `Department` (enum), `Employee` | Enums, employee modeling |
| `FinalHospital` | `Person` (abstract), `Doctor`, `Patient`, `Appointment`, `AppointmentStatus` (enum), `Department`, `MedicalRecord`, `Medicine`, `Specialization` (enum) | Full domain model, enums, relationships |
| `FitnessCenter` | `Member` (abstract), `BasicMember`, `PremiumMember` | Abstract classes, polymorphism |
| `GradingSystem` | `Grade` (enum), `Student` | Enums, grade logic |
| `HospitalManagementSystem` | `Person`, `Patient`, `InPatient`, `OutPatient`, `CriticalPatient`, `Emergency` | Deep inheritance hierarchy |
| `HospitalPatientSystem` | `Patient` (abstract), `InPatient`, `OutPatient`, `EmergencyPatient` | Abstract classes, patient types |
| `Lab12` | `Box`, `AnotherBox`, `GenericMethod` | Generics |
| `Lab12Task` | `Student`, `WildCardExample` | Wildcards in generics |
| `Lab13` | `Calculator` | Generic methods, bounded types |
| `LabTask13march` | `Library`, `Main1` | Static factory pattern, object limit enforcement |
| `LibrarySystem` | `Member` (abstract), `Student`, `LibraryStaff` | Abstract classes, static counters, casting |
| `midsquestions` | `MyPoint`, `Triangle` | Coordinate geometry, collinearity check |
| `Motor` | `Motor` | Basic class modeling |
| `OOPLastLecture` | `Multithreading1`, `MyTask` | Thread basics, `Runnable` |
| `PaySystem` | `Employee` (abstract), `FullTime`, `PartTime` | Polymorphic salary calculation |
| `PowerSupply` | — | Power supply modeling |
| `RideHandlingCompany` | `Trackable` (interface), `Vehicle`, `Bike`, `Cab` | Interface + inheritance combined |
| `ScholarshipLottery` | `Student` (abstract), `LotteryStudent` | Randomized selection logic |
| `ScholarshipSystem` | `Student` (abstract), `ScholarshipStudent`, `FinedStudent` | Abstract classes, student types |
| `SmartHome` | `Controllable` (interface), `Appliance`, `SmartAppliance` | Interface, smart device abstraction |
| `SnakesNLadder` | `BoardGame`, `SnakesAndLadders` | Inheritance-based game design |
| `SnakesNLadder1` | `SnLBoard`, `Cell`, `Snake`, `Ladder` | Full object-oriented board modeling |
| `SportsClub` | `ClubMember` (abstract), `ShootingMember` | Abstract classes, specialization |
| `Threading` | `Multithreading1`, `Multithreading2`, `Multithreading3`, `Multithreading4` | Thread lifecycle, `Runnable`, `Thread` |
| `ThreadingBMe` | `Threading1` through `Threading5` | Extended multithreading practice |
| `Transactions` | `PaymentMethod` (enum), `Order` | Enums, order processing |
| `VehicleSystem` | `Vehicle` (abstract), `Car`, `ElectricCar` | Inheritance, method overriding |
| `Zoo` | `Animal`, `Cage`, `Zoo` | Complex constraint logic, random distribution |
| `Main.java` (root) | `Customer` (abstract), `CommercialCustomer`, `ResidentialCustomer` | Standalone customer hierarchy |
| `MyRectangle.java` (root) | `MyPoint`, `MyRectangle` | Geometry, point-based construction |
| `Q9.java` (root) | `Person` (abstract), `Member`, `Librarian`, `Book`, `Loan`, `LoanStatus` (enum), `Department` (enum), `StorageBox` | Full library management system, complex relationships |

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
