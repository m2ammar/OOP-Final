package FinalHospital;

public class Main {
    public static void main(String[] args) {

        Patient p1 = new Patient("Ali", "ali@example.com");
        System.out.println("Patient ID: " + p1.getPatientId());

        System.out.println("Patient name: " + p1.getName());
        Doctor d1 = new Doctor("Sara", "sara@example.com");
        System.out.println("Doctor specialization: " + d1.getSpecialization());
        Doctor d2 = new Doctor("Hana", "hana@example.com", Specialization.CARDIOLOGY);
        System.out.println("Doctor specialization: " + d2.getSpecialization());
    }
}
