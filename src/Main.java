public class Main {

    public static void main(String[] args) {


    }
}

abstract class Customer {

    protected String name;
    protected double unitsConsumed;

    public Customer(String name, double unitsConsumed) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill() {
        return 0;
    }

    public String getBillSummary() {
        return "Customer: " + name + " | Amount Due: " + calculateBill();
    }
}

class ResidentialCustomer extends Customer {

    public ResidentialCustomer(String name, double unitsConsumed) {
        super(name, unitsConsumed);
    }

    @Override
    public double calculateBill() {
        // you write slab logic here
        double result=0;

        if(unitsConsumed <=100){
            result= unitsConsumed * 5;
        }else if(unitsConsumed <=300){
            result= (100*5) + ((unitsConsumed - 100) * 7);
        }else{
            result=  (100*5) + ((unitsConsumed - 100) * 7) + ((unitsConsumed -300) * 10);
        }
        return result;
    }
}

class CommercialCustomer extends Customer {

    public CommercialCustomer(String name, double unitsConsumed) {
        super(name, unitsConsumed);
    }

    @Override
    public double calculateBill() {
        // you write flat rate + minimum bill logic here
        double result=0;

        result= unitsConsumed * 12;

        if(result<1000){
            return result= 1000;
        }

        return result;
    }
}