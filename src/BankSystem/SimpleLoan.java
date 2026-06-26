package BankSystem;

public class SimpleLoan extends LoanAccount {


    SimpleLoan(String customerName, double principal, int years) {
        // your code
        super(customerName, principal, years);
    }

    @Override
    public double calculateInterest() {
        // your code
        double result=0;

        if(years <= 2){
            result = principal * 0.05 * years;
        }else if(years <= 5){
            result = principal * 0.08 * years;
        }else{
            result = principal * 0.12 * years;
        }

        return result;
    }
}
