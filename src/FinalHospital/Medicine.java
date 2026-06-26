package FinalHospital;

public class Medicine {

    protected String name;
    protected double price;
    protected String description;

    public Medicine(String name, double price){
        this.name=name;
        this.price=price;
    }

    public Medicine(String name, double price, String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setDescription(String description){
        this.description=description;
    }
}
