package PaySystem;

public class FullTime extends Employee{

    private double baseSalary;
    private double bonusPercent;
    public FullTime(String name, double baseSalary, double bonusPercent){
        super(name);
        this.baseSalary=baseSalary;
        this.bonusPercent=bonusPercent;
    }

    @Override
    public double calculatePay(){
        double result;

        result = baseSalary + (baseSalary * bonusPercent)/100;
        return result;
    }

    @Override
    public void printPaySlip() {
        System.out.println("Employee: " + name+" | Type: Full-Time"+" | Base: "+baseSalary+" | Bonus: "+bonusPercent+"%"
                + " | Pay: " + calculatePay());
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double getBonusPercent(){
        return bonusPercent;
    }
}
