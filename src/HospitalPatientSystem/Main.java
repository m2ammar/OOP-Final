package HospitalPatientSystem;

public class Main {
    public static void main(String[] args) {

        Patient p1 = new InPatient(1, "Ammar", 5, 2);
        Patient p2 = new OutPatient(2, "Hamza", 3, 4);
        Patient p3 = new EmergencyPatient(3, "Hadi", 2, 1);

        p1.calc();
        p2.calc();
        p3.calc();
    }
}
