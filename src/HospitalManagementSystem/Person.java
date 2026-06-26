package HospitalManagementSystem;

public class Person {

    private int id;
    private static int counter = 0;
    private String name;
    private int age;

    protected static int totalDoctors, totalNurses;

    public Person(String name, int age){
        this.id=++counter;
        this.name=name;
        this.age=age;
    }

    public static void addDoctor(){
        totalDoctors++;
    }

    public static void addNurse(){
         totalNurses++;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
