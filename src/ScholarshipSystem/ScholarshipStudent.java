package ScholarshipSystem;

public class ScholarshipStudent extends Student{

    public ScholarshipStudent(String name, double gpa, int attendance){
        super(name, gpa , attendance);
    }

    @Override
    public double calculateNetAmount(){
        double scholarship=50000;

        if(getGpa() >= 3.5){
            scholarship += 20000;
        }else if(getGpa() >= 3.0 ){
            scholarship += 10000;
        }

        if(getAttendance() < 75){
            scholarship -= 15000;
        }
        return scholarship;
    }
}
