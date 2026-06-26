package FitnessCenter;

public class PremiumMember extends Member {
    PremiumMember(String name, int hoursPerMonth) {
        // your code
        super(name, hoursPerMonth);
    }

    @Override
    public double calculateFee() {
        // your code
        double fee=0;

        fee=3000;

        if(hoursPerMonth<10){
            fee =1500;

        }else if(hoursPerMonth > 40){
            fee +=  100*(hoursPerMonth- 40);
        }

        return fee;
    }
}