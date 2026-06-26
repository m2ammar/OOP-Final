package RideHandlingCompany;

public class Main {
    public static void main(String[] args) {


        Vehicle c1 = new Cab("C001", "Corolla", 2020, "Usman");
        ((Cab)c1).startTrip();
        ((Cab)c1).startTrip();
        ((Trackable)c1).trackLocation();
        System.out.println("=====");


        System.out.println(((Trackable)c1).isAvailable());
        System.out.println("=====");

        Vehicle b1 = new Bike("B001", "Honda 70", 2022, "Bilal");

        ((Bike)b1).addDelivery();
        ((Bike)b1).addDelivery();
        b1.displayInfo();

    }
}
