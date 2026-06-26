package PaySystem;

public class PartTime extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public PartTime(String name, double hourlyRate, int hoursWorked){

        super(name);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double calculatePay(){
        if (hoursWorked > 40) {
            double regular = hourlyRate * 40;
            double overtime = hourlyRate * (hoursWorked - 40) * 1.5;
            return regular + overtime;
        }
        return hourlyRate * hoursWorked;
    }

    @Override
    public void printPaySlip() {
        System.out.println("Employee: " + name+" | Type: Part-Time"+" | Hours: "+hoursWorked+ " | Rate: "+hourlyRate
                + " | Pay: " + calculatePay());
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }
}
