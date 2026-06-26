package SportsClub;

public class Main {
    public static void main(String[] args) {


        ShootingMember m1 = new ShootingMember("Ammar");
        ShootingMember m2 = new ShootingMember("Ali");
        ShootingMember m3 = new ShootingMember("Sara");

        m1.shootRounds();
        m2.shootRounds();
        m3.shootRounds();

        System.out.println(m1.memberId + " | " + m1.name + " | Avg: " + m1.calculateAverage() + " | " + m1.getRating());
        System.out.println(m2.memberId + " | " + m2.name + " | Avg: " + m2.calculateAverage() + " | " + m2.getRating());
        System.out.println(m3.memberId + " | " + m3.name + " | Avg: " + m3.calculateAverage() + " | " + m3.getRating());
        System.out.println("Total Members: " + ShootingMember.totalMembers);
    }
}
