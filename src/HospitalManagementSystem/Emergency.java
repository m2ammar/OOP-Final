package HospitalManagementSystem;

public class Emergency extends OutPatient{

    private int emergencyLevel;
    private boolean ambulanceRequired;

    public Emergency(String name, int age, String disease, String appointmentDate,
                     String doctorName, int emergencyLevel, boolean ambulanceRequired){

        super( name, age, disease, appointmentDate, doctorName);
        this.emergencyLevel=emergencyLevel;
        this.ambulanceRequired=ambulanceRequired;

    }

    public void getEmergencyReport(){

        if(ambulanceRequired) {

            System.out.println("Emergency Level: " + emergencyLevel + " | Ambulance required: Yes");
        }else{

            System.out.println("Emergency Level: " + emergencyLevel + " | Ambulance required: No");
        }
    }

    public int getEmergencyLevel(){
        return emergencyLevel;
    }

    public boolean getAmbulanceRequired(){
        return this.ambulanceRequired;
    }
}
