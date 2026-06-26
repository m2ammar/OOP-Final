package Transactions;

public class Main {
    public static void main(String[] args) {
        Order o = new Order("Pizza", 200.0, PaymentMethod.CASH);
        System.out.println(o.getFinalPrice());
        System.out.println(o.getSummary());
        System.out.println(o.getFinalPrice());
    }
}
