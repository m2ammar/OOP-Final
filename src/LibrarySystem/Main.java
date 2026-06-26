package LibrarySystem;

public class Main {
    public static void main(String[] args) {

        Member s1 = new Student("Ali");
        s1.displayInfo();
        System.out.println("=====");

        Member s2 = new Student("Sara", "sara@uni.edu", "CS");
        s2.displayInfo();
        System.out.println("=====");

        Member st1 = new LibraryStaff("Kamil", "kamil@lib.com", 120);
        st1.displayInfo();
        System.out.println("=====");

        ((LibraryStaff)st1).addBooks(-5);
        ((LibraryStaff)st1).addBooks(30);
        st1.displayInfo();

        System.out.printf("Students: %s\n", Member.noOfStudents);
        System.out.printf("Staff: %s", Member.noOfStaff);
    }
}