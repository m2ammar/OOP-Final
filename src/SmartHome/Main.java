package SmartHome;

public class Main {
    public static void main(String[] args) {

    }
}
 interface Controllable{

    public void turnOn();
    public void turnOff();
 }
 class Appliance{

    protected String brand;
    protected String model;
    protected boolean powerStatus;

    public Appliance(String brand, String model){
        this.brand=brand;
        this.model=model;
        this.powerStatus=false;
    }

    public void displayInfo(){

    }
 }
 class SmartAppliance extends Appliance implements Controllable{

    public SmartAppliance(String brand, String model){
        super(brand,model);
    }

    @Override
     public void turnOn(){

        this.powerStatus=true;
        System.out.println(model+" is turned ON");
    }

    @Override
     public void turnOff(){

        this.powerStatus=false;
        System.out.println(model+" is turned OFF");
    }

    public void configureSettings(String setting, int settingValue){

        System.out.println("Configuring: "+model+"\nSetting: "+setting+"\nsettingValue: "+settingValue);
    }

     public void configureSettings(String setting){
         System.out.println("Configuring: " + model);
         System.out.println("Setting: " + setting);
     }

    @Override
     public void displayInfo(){
        System.out.println("Appliance Brand: "+brand+"\nAppliance Model: "+model+"\nPower Status: "+ (powerStatus ? "On" : "Off"));
    }
 }