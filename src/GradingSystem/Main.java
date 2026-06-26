package GradingSystem;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Ali", 75.0);
        System.out.println(s.getGrade());
        System.out.println(s.getReport());
    }
}
