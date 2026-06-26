package AssignmentPractice;

public class Main1 {
    public static void main(String[] args) {

        Person t1 = new Teacher("Ammar", "a cdj cj", "OOP");
        t1.displayInfo();
        System.out.println("====================");

        Person t2 = new Teacher("Ali", "adcdc", "Phy");
        t2.displayInfo();
        System.out.println("====================");
        System.out.println("No of Teachers: "+ Person.noOfTeachers);
        System.out.println("====================");

        Person t3 = new Student("Hina", "hvxsz", "CS");
        t3.displayInfo();
        System.out.println("====================");

        Person t4 = new Student("Adil", "5ddcc", null);
        t4.displayInfo();
        System.out.println("====================");
        System.out.println("No of Students: "+ Person.noOfStudents);



    }
}
