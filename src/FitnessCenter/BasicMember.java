package FitnessCenter;

public class BasicMember extends Member {
    BasicMember(String name, int hoursPerMonth) {
        // your code
        super(name, hoursPerMonth);
    }

    @Override
    public double calculateFee() {
        // your code
        double fee=0;

        fee=hoursPerMonth*50;

        if(hoursPerMonth>30){
           return fee += 500;
        }else {
            return fee;
        }
    }
}