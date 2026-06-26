package RideHandlingCompany;

public class Bike extends Vehicle implements Trackable {

    private String riderName;
    private int deliveries;


    public Bike(String vehicleId,String model,int year, String riderName){
        super(vehicleId, model, year);
        this.riderName=riderName;
        this.deliveries=0;
    }

    public void trackLocation(){
        System.out.println("Rider name: "+this.riderName+"\nModel: "+this.model);
    }

    public boolean isAvailable(){
        return true;
    }

    public void addDelivery(){
        this.deliveries++;
    }

    @Override
    public void displayInfo(){

        System.out.println("Vehicle Id: "+this.vehicleId+"\nModel: "+this.model+"\nYear: "
                +this.year+"\nRider: "+this.riderName+"\nDeliveries: "+this.deliveries);

    }

    public String getRiderName(){
        return this.riderName;
    }

    public int getDeliveries(){
        return this.deliveries;
    }
}
