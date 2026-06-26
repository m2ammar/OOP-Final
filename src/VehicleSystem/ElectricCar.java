package VehicleSystem;

public class ElectricCar extends Car {

    private int batteryRange;

    public ElectricCar(String brand, int year, int batteryRange){
        super(brand, year);
        this.batteryRange=batteryRange;
    }

    @Override
    public String fuelType(){
        return "Electric";
    }

    @Override
    public void describe(){

        System.out.println("Brand: " + getBrand() + " | Year: " + getYear()
                + " | Fuel: " + fuelType()+" | Battery Range: "+batteryRange+ " km");
    }

//    @Override
//    public void  describe(String ownerName){
//        System.out.println("Name: "+ownerName+" | Brand: " + getBrand() + " | Year: " + getYear()
//                + " | Fuel: " + fuelType()+" | Battery Range: "+batteryRange+ " km");
//    }
    public int getBatteryRange(){
        return this.batteryRange;
    }
}
