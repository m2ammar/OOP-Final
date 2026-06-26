package FitnessCenter;

public class Main {
    public static void main(String[] args) {
        Member m1 = new BasicMember("Ammar", 35);
        Member m2 = new BasicMember("Bilal", 20);
        Member m3 = new BasicMember("Hamza", 30);
        Member m4 = new PremiumMember("Ali", 45);
        Member m5 = new PremiumMember("Sara", 7);
        Member m6 = new PremiumMember("Zara", 38);
        System.out.println(m1.getSummary());
        System.out.println(m2.getSummary());
        System.out.println(m3.getSummary());
        System.out.println(m4.getSummary());
        System.out.println(m5.getSummary());
        System.out.println(m6.getSummary());
    }
}
