package HospitalPatientSystem;

public class OutPatient extends Patient {

    private int noOfConsultation;
    private int testConducted;


    public OutPatient(int patientId, String patientName, int noOfConsultation, int testConducted){
        super(patientId, patientName);
        this.noOfConsultation=noOfConsultation;
        this.testConducted=testConducted;

    }

    @Override
    public void calc(){
        double cost=0;

        cost= (noOfConsultation * 200) + (testConducted* 150);

        System.out.println("Total cost: "+cost);
    }
}
