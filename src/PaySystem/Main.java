package PaySystem;

public class Main {
    public static void main(String[] args) {
        FullTime f = new FullTime("Ahmed", 50000, 10);
        f.printPaySlip();

        PartTime p1 = new PartTime("Sara", 500, 35);
        p1.printPaySlip();

        PartTime p2 = new PartTime("Bilal", 500, 45);
        p2.printPaySlip();
    }
}
