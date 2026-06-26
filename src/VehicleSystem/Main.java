package VehicleSystem;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 2022);
        c.describe();
        c.describe("Ahmed");

        ElectricCar e = new ElectricCar("Tesla", 2024, 500);
        e.describe();
        e.describe("Sara");
    }
}