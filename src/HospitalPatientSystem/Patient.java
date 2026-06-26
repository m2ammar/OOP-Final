package HospitalPatientSystem;

public abstract class Patient {

    private int patientId;
    private String patientName;

    public Patient(int patientId, String patientName){
        this.patientId=patientId;
        this.patientName=patientName;
    }

    public abstract void calc();

    public String getPatientName(){
        return this.patientName;
    }

    public int getPatientId(){
        return this.patientId;
    }
}
