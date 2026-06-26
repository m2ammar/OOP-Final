package ScholarshipSystem;

public class FinedStudent extends Student{

    public FinedStudent(String name, double gpa, int attendance){
        super(name, gpa , attendance);
    }

    @Override
    public double calculateNetAmount(){
        double fine=5000;

        if(getGpa() < 2.0 ){
            fine += 8000;
        }

        if(getAttendance() < 60){
            fine += 5000;
        }

        if( getGpa() < 2.0 && getAttendance() < 60 ){
            fine += 3000;
        }

        return -fine;
    }
}
