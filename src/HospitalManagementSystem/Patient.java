package HospitalManagementSystem;

public class Patient extends Person{

    private String patientType;
    private String disease;


    public Patient(String name, int age, String disease){
        super(name, age);
        this.disease=disease;
    }

    public String getPatientType(){
        return this.patientType;
    }

    public String getDisease(){
        return this.disease;
    }
}
