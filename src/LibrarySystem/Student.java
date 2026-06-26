package LibrarySystem;

public class Student extends Member{

    private String program;

    public Student(String name, String email, String program){
        super(++noOfStudents ,name, email);
        this.program=program;
    }

    public Student(String name){
        super(++noOfStudents, name);

    }

    public void displayInfo(){

        System.out.println("Student Id: "+this.getId()+"\nStudent Name: "+this.getName()+"\nStudent Email: "+this.getEmail()+
                "\nStudent Program: "+this.getProgram());
    }

    public String getProgram(){
        return this.program;
    }

    public void setProgram(String program){
        this.program=program;
    }

}
