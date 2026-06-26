package VehicleSystem;

public class Car extends Vehicle{

    public Car(String brand, int year){
        super(brand, year);
    }

    @Override
    public String fuelType(){
        return "Petrol";
    }

    @Override
    public void describe(){

        System.out.println("Brand: " + getBrand() + " | Year: " + getYear()
                + " | Fuel: " + fuelType());
    }

    @Override
    public void describe(String ownerName){
        System.out.println("Name: "+ownerName+" | Brand: " + getBrand() + " | Year: " + getYear()
                + " | Fuel: " + fuelType());
    }
}
