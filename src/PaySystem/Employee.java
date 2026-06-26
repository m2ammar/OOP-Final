package PaySystem;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public abstract double calculatePay();

    public void printPaySlip() {
        System.out.println("Employee: " + name
                + " | Pay: " + calculatePay());
    }
}