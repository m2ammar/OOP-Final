package VehicleSystem;

public abstract class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public int getYear()     { return year; }

    public String fuelType() {
        return "Unknown";
    }

    public void describe() {
        System.out.println("Brand: " + brand + " | Year: " + year
                + " | Fuel: " + fuelType());
    }

    public abstract void describe(String ownerName);
}