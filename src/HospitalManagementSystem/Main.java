package HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {

        // Add doctors and nurses
        Person.addDoctor();
        Person.addDoctor();
        Person.addDoctor();
        Person.addNurse();
        Person.addNurse();
        Person.addNurse();
        Person.addNurse();
        Person.addNurse();

        System.out.println("Total Doctors: " + Person.totalDoctors);
        System.out.println("Total Nurses: " + Person.totalNurses);
        System.out.println();

        // InPatients
        InPatient ip1 = new InPatient("Ali", 30, "Fever", 5, "2024-01-10");
        InPatient ip2 = new InPatient("Sara", 25, "Fracture", 3, "2024-01-11");
        InPatient ip3 = new InPatient("Usman", 40, "Diabetes", 7, "2024-01-12");

        // CriticalPatients
        CriticalPatient cp1 = new CriticalPatient("Ahmed", 45, "Heart Failure", 5, "2024-01-10", 2, true);
        CriticalPatient cp2 = new CriticalPatient("Hina", 60, "Stroke", 4, "2024-01-13", 1, false);

        // OutPatients
        OutPatient op1 = new OutPatient("Fatima", 22, "Flu", "2024-01-15", "Dr. Khan");
        OutPatient op2 = new OutPatient("Bilal", 35, "Back Pain", "2024-01-16", "Dr. Rizwan");

        // Emergency
        Emergency e1 = new Emergency("Zara", 28, "Accident", "2024-01-17", "Dr. Saleem", 4, true);
        Emergency e2 = new Emergency("Kamran", 19, "Burns", "2024-01-18", "Dr. Ayesha", 5, true);

        System.out.println("--- All Patients ---");
        System.out.println("ID: " + ip1.getId() + " | " + ip1.getName() + " | Ward: " + ip1.getWardNumber() + " | Admitted: " + ip1.getAdmissionDate());
        System.out.println("ID: " + ip2.getId() + " | " + ip2.getName() + " | Ward: " + ip2.getWardNumber() + " | Admitted: " + ip2.getAdmissionDate());
        System.out.println("ID: " + ip3.getId() + " | " + ip3.getName() + " | Ward: " + ip3.getWardNumber() + " | Admitted: " + ip3.getAdmissionDate());
        System.out.println("ID: " + cp1.getId() + " | " + cp1.getName() + " | ICU: " + cp1.getIcuNumber() + " | Ventilator: " + cp1.getIsOnVentilator());
        System.out.println("ID: " + cp2.getId() + " | " + cp2.getName() + " | ICU: " + cp2.getIcuNumber() + " | Ventilator: " + cp2.getIsOnVentilator());
        System.out.println("ID: " + op1.getId() + " | " + op1.getName() + " | Appointment: " + op1.getAppointmentDate() + " | Doctor: " + op1.getDoctorName());
        System.out.println("ID: " + op2.getId() + " | " + op2.getName() + " | Appointment: " + op2.getAppointmentDate() + " | Doctor: " + op2.getDoctorName());
        System.out.println("ID: " + e1.getId() + " | " + e1.getName() + " | Level: " + e1.getEmergencyLevel() + " | Ambulance: " + e1.getAmbulanceRequired());
        System.out.println("ID: " + e2.getId() + " | " + e2.getName() + " | Level: " + e2.getEmergencyLevel() + " | Ambulance: " + e2.getAmbulanceRequired());

        System.out.println();
        System.out.println("--- Critical Patient Status ---");
        cp1.getStatus();
        cp2.getStatus();

        System.out.println();
        System.out.println("--- Emergency Reports ---");
        e1.getEmergencyReport();
        e2.getEmergencyReport();
    }
}