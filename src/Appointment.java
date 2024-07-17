public class Appointment {

    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment(){
        // Default constructor
    }

    // Parameterized constructor
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    //Method to print details
    public void printDetails(){
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        doctor.printDetails();
    }

    //Method to get patient mobile number
    public Object getPatientMobile() {
        return patientMobile;
    }
}
