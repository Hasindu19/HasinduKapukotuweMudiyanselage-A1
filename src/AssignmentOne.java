import java.util.ArrayList;

public class AssignmentOne {

    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Ali", "General Medicine", "Implanon Cosmetics");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Brown", "General Medicine", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. White", "General Medicine", "Geriatrics");

        Specialist sp1 = new Specialist(4, "Dr. Green", "Cardiology", "Heart Surgery");
        Specialist sp2 = new Specialist(5, "Dr. Blue", "Neurology", "Brain Surgery");

        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        sp1.printDetails();
        System.out.println("------------------------------");
        sp2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        createAppointment("John Doe", "1234567890", "08:00", gp1);
        createAppointment("Jane Smith", "0987654321", "10:00", gp2);
        createAppointment("Alice Brown", "1112223334", "14:30", sp1);
        createAppointment("Bob White", "4445556667", "16:00", sp2);

        printExistingAppointments();
        System.out.println("------------------------------");
        cancelBooking("1234567890");
        printExistingAppointments();
        System.out.println("------------------------------");

    }

    public static void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(newAppointment);
    }

    public static void printExistingAppointments(){
        if(appointments.isEmpty()){
            System.out.println("No appointments found");
        }else{
            for(Appointment appointment: appointments){
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    public static void cancelBooking(String patientMobile){
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                appointments.remove(appointment);
                System.out.println("Booking cancelled for mobile phone: " + patientMobile);
                return;
            }
        }
        System.out.println("No booking found for mobile phone: " + patientMobile);
    }

}
