package AssignmentPractice;

public class Teacher extends Person{

    protected String course;

    public Teacher(String name, String contact){
        super(name, contact);
        ++noOfTeachers;
        this.id = noOfTeachers;

    }

    public Teacher(String name, String contact, String course){
        super(name, contact);
        this.course=course;
        ++noOfTeachers;
        id=noOfTeachers;
    }

    @Override
    public void displayInfo(){

        System.out.println("Teacher Id: "+id+"\nTeacher Name: "+name+"\nTeacher contact: "+contact+"\nTeacher course: "+course);
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course=course;
    }
}
