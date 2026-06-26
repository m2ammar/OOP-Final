package FinalHospital;

import java.util.ArrayList;

public class Appointment {

    protected Patient patient;
    protected ArrayList<Medicine> medicines;
    protected AppointmentStatus appointmentStatus;

    public Appointment(Patient patient, ArrayList<Medicine> medicine){
        this.patient = patient;
        this.medicines=medicine;
        this.appointmentStatus=AppointmentStatus.SCHEDULED;
    }

    public Appointment(Patient patient){
        this.patient=patient;
        this.medicines= new ArrayList<>();
        this.appointmentStatus=AppointmentStatus.SCHEDULED;
    }

    public void addMedicine(Medicine medicine){
        medicines.add(medicine);
    }

    public void addMedicine(Medicine medicine, int quantity){
        for(int i=0; i<quantity; i++){
            medicines.add(medicine);
        }
    }

    public void appointmentSummary(){
        System.out.println("Appointment Summary:");
        System.out.println("Status: "+appointmentStatus);
        for(Medicine records: medicines) {
            System.out.println("Medicine: " + records.getName() + " --- " + records.getPrice());
        }
    }

    public Patient getPatient(){
        return this.patient;
    }

    public ArrayList<Medicine> getMedicines(){
        return medicines;
    }

    public AppointmentStatus getAppointmentStatus(){
        return this.appointmentStatus;
    }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus){
        this.appointmentStatus = appointmentStatus;
    }
}
