package HospitalPatientSystem;

public class EmergencyPatient extends Patient {

    private int emergencyProcedures;
    private int ambulancesCall;


    public EmergencyPatient(int patientId, String patientName, int emergencyProcedures, int ambulancesCall){
        super(patientId, patientName);
        this.emergencyProcedures=emergencyProcedures;
        this.ambulancesCall=ambulancesCall;

    }

    @Override
    public void calc(){
        double cost=0;

        cost= (emergencyProcedures * 1000) + (ambulancesCall* 300);

        System.out.println("Total cost: "+cost);
    }


}
