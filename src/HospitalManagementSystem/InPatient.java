package HospitalManagementSystem;

public class InPatient extends Patient{

    private int wardNumber;
    private String admissionDate;

    public InPatient(String name, int age, String disease, int wardNumber, String admissionDate){
        super(name, age, disease);
        this.wardNumber=wardNumber;
        this.admissionDate=admissionDate;

    }

    public int getWardNumber(){
        return this.wardNumber;
    }

    public String getAdmissionDate(){
        return this.admissionDate;
    }
}
