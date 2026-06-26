package BankSystem;

public abstract class LoanAccount {

    String customerName;
    double principal;
    int years;

    LoanAccount(String customerName, double principal, int years) {
        // your code
        this.customerName=customerName;
        this.principal=principal;
        this.years=years;

    }

    abstract double calculateInterest();

    double totalRepayment() {
        // your code
        double result=0;
        result=principal+calculateInterest();
        return  result;
    }

    String getSummary() {
        // your code

        return customerName+ ": "+totalRepayment();
    }
}
