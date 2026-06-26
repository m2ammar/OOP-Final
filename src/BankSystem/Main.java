package BankSystem;

public class Main {
    public static void main(String[] args) {
        LoanAccount a1 = new SimpleLoan("Ammar", 100000, 4);
        LoanAccount a2 = new CompoundLoan("Ali", 30000, 3);
        System.out.println(a1.getSummary());
        System.out.println(a2.getSummary());
    }
}
