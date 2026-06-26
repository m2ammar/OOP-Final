package FinalHospital;

import java.util.ArrayList;

public class Department {

    protected String name;
    protected ArrayList<Doctor> doctors;

    public Department(String name){
        this.name=name;
        doctors= new ArrayList<> ();
    }

    public Department(String name, ArrayList<Doctor> doctor){
        this.name=name;
        this.doctors=doctor;
    }

    public void addDoctors(Doctor doctor){
        doctors.add(doctor);
    }

    public void removeDoctor(Doctor doctor){
        doctors.remove(doctor);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public ArrayList<Doctor> getDoctors(){
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors){
        this.doctors=doctors;
    }
}
