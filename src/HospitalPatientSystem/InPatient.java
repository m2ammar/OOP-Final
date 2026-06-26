package HospitalPatientSystem;

public class InPatient extends Patient {

    private int daysAdmitted;
    private int noOfSurgeries;


    public InPatient(int patientId, String patientName, int daysAdmitted, int noOfSurgeries){
        super(patientId, patientName);
        this.daysAdmitted=daysAdmitted;
        this.noOfSurgeries=noOfSurgeries;

    }

    @Override
    public void calc(){
        double cost=0;

        cost= (daysAdmitted * 500) + (noOfSurgeries* 2000);

        System.out.println("Total cost: "+cost);
    }

    public int getDaysAdmitted(){
        return this.daysAdmitted;
    }

    public int getNoOfSurgeries(){
        return noOfSurgeries;
    }
}
