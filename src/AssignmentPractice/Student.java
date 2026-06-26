package AssignmentPractice;

public class Student extends Person{

    private String program;

    public Student(String name, String contact, String program){
        super(name, contact);
        this.program=program;
        ++noOfStudents;
        id=noOfStudents;
    }

    public Student(String name, String contact){
        super(name, contact);
        ++noOfStudents;
        id=noOfStudents;
    }

    @Override
    public void displayInfo(){

        System.out.println("Student Id: "+id+"\nStudent Name: "+name+"\nStudent contact: "+contact+"\nStudent Program: "+program);
    }

    public String getProgram(){
        return this.program;
    }

    public void setProgram(String program){
        this.program=program;
    }
}
