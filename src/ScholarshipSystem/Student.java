package ScholarshipSystem;

public abstract class Student {
    private String name;
    private double gpa;
    private int attendance;

    public Student(String name, double gpa, int attendance){
        this.name=name;
        this.gpa=gpa;
        this.attendance=attendance;
    }

    public abstract double calculateNetAmount();

    public String getSummary(){
        return name+ ": "+calculateNetAmount();
    }

    public String getName(){
        return this.name;
    }

    public double getGpa(){
        return this.gpa;
    }

    public int getAttendance(){
        return this.attendance;
    }
}
