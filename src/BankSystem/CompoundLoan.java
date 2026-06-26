package BankSystem;

public class CompoundLoan extends  LoanAccount{

    CompoundLoan(String customerName, double principal, int years) {
        // your code
        super(customerName , principal , years);
    }

    @Override
    public double calculateInterest() {
        // your code
        double interestCal=0;

        interestCal= principal*Math.pow((1+ 0.1),years)- principal;
        if(interestCal < 5000){
            return 5000;
        }else{
            return interestCal;
        }
    }
}
