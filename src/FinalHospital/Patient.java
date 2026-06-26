package FinalHospital;

public class Patient extends Person{

    protected int patientId;
    private static int count=1;
    public Patient(String name, String email){
        super(name, email);
        patientId=count++;
    }

    @Override
    public void displayRole(){
        System.out.println("Role: Patient");
    }

    public int getPatientId(){
        return this.patientId;
    }

}
