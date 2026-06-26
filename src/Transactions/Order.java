package Transactions;

public class Order {
    private String itemName;
    private double price;
    private PaymentMethod paymentMethod;

    public Order(String itemName, double price, PaymentMethod paymentMethod){
        this.itemName=itemName;
        this.price=price;
        this.paymentMethod=paymentMethod;
    }

    public double getFinalPrice(){
        double temp = price;

        if(paymentMethod == PaymentMethod.CASH){
            temp= temp - (temp * 0.1);
        }else if(paymentMethod == PaymentMethod.CARD){
            temp = temp - (temp * 0.05);
        }else{
            temp = temp - (temp * 0.15);
        }
        return temp;
    }

    public String getSummary(){

        return "Item: "+itemName+" | Method: "+paymentMethod+" | Price: "+price;
    }

    public String getItemName(){
        return this.itemName;
    }

    public double getPrice(){
        return this.price;
    }

    public PaymentMethod getPaymentMethod(){
        return this.paymentMethod;
    }
}
