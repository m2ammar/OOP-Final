package RideHandlingCompany;

public class Cab extends Vehicle implements Trackable{

    private String driverName;
    private boolean onTrip;

    public Cab(String vehicleId, String model, int year, String driverName){
        super(vehicleId,model,year);
        System.out.println("Tracking...");
        this.driverName=driverName;
        this.onTrip=false;
    }

    public void trackLocation(){

        System.out.println("Driver name: "+this.driverName+"\nModel: "+this.model);
    }

    public boolean isAvailable(){

        if(!this.onTrip){
            return true;
        }else{
            return false;
        }
    }

    public void startTrip(){

        if(this.onTrip){
            System.out.println(model + " is already on a trip");
        }else{
            this.onTrip=true;
            System.out.println(model+" trip started");
        }
    }

    public void endTrip(){

        if(!onTrip){
            System.out.println(model+" has no active trip");
        }else{
            this.onTrip=false;
        }
    }

    @Override
    public void displayInfo(){

        System.out.println("Vehicle Id: "+this.vehicleId+"\nModel: "+this.model+"\nYear: "
                +this.year+"\nDriver name: "+this.driverName+"\nStatus: "+this.onTrip);

    }

    public String getDriverName(){
        return this.driverName;
    }

    public boolean isOnTrip(){
        return this.onTrip;
    }
}
