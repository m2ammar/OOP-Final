package ScholarshipSystem;

public class Main {
    public static void main(String[] args) {
        Student s1 = new ScholarshipStudent("Ammar", 3.28, 80);
        Student s2 = new ScholarshipStudent("Ali", 3.7, 70);
        Student s3 = new ScholarshipStudent("Bilal", 2.8, 90);
        Student s4 = new FinedStudent("Zara", 1.8, 55);
        Student s5 = new FinedStudent("Hamza", 2.5, 65);
        Student s6 = new FinedStudent("Sara", 1.5, 72);
        System.out.println(s1.getSummary());
        System.out.println(s2.getSummary());
        System.out.println(s3.getSummary());
        System.out.println(s4.getSummary());
        System.out.println(s5.getSummary());
        System.out.println(s6.getSummary());
    }
}
