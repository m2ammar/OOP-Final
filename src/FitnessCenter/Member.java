package FitnessCenter;

public abstract class Member {
    String name;
    int hoursPerMonth;

    Member(String name, int hoursPerMonth) {
        // your code
        this.name=name;
        this.hoursPerMonth=hoursPerMonth;
    }

    abstract double calculateFee();

    String getSummary() {
        // your code

        return name+": "+calculateFee();
    }
}

