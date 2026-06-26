package ScholarshipLottery;

public class Main {
    public static void main(String[] args) {


        LotteryStudent s1 = new LotteryStudent("Ammar");
        LotteryStudent s2 = new LotteryStudent("Ali");
        LotteryStudent s3 = new LotteryStudent("Sara");

        s1.rollDice();
        s2.rollDice();
        s3.rollDice();

        System.out.println(s1.name + " | Score: " + s1.calculateScore() + " | " + s1.getScholarship());
        System.out.println(s2.name + " | Score: " + s2.calculateScore() + " | " + s2.getScholarship());
        System.out.println(s3.name + " | Score: " + s3.calculateScore() + " | " + s3.getScholarship());
        System.out.println("Total Evaluated: " + LotteryStudent.totalStudents);
    }
}
