package HospitalManagementSystem;

public class OutPatient extends  Patient{

    private String appointmentDate;
    private String doctorName;

    public OutPatient(String name, int age, String disease, String appointmentDate, String doctorName){
        super(name, age, disease);
        this.appointmentDate=appointmentDate;
        this.doctorName=doctorName;
    }

    public String getAppointmentDate(){
        return this.appointmentDate;
    }

    public String getDoctorName(){
        return this.doctorName;
    }
}
