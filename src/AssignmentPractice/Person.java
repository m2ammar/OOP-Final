package AssignmentPractice;

public abstract class Person {

    protected int id;
    protected String name;
    protected  String contact;

    protected static int noOfStudents;
    protected static int noOfTeachers;

    public Person( String name, String contact){
        this.name=name;
        this.contact=contact;

    }



    public void setName(String name){
        this.name=name;
    }
    public void setContact(String contact){
        this.contact=contact;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getContact(){
        return this.contact;
    }

    public abstract void displayInfo();
}
