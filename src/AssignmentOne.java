import java.util.ArrayList;

public class AssignmentOne {

    //Create a arraylist named appointment
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    //Main method
    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Ali", 10, "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Sergey", 25, "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Valerie", 5, "Geriatrics");

        Specialist sp1 = new Specialist(4, "Dr. Karen", 8, "Cardiology");
        Specialist sp2 = new Specialist(5, "Dr. Julianne", 4, "Neurology");

        /*
        I got these information from
        1. https://southportmetromedicalcentre.com.au
        2. https://www.emsdh.com.au/doctors?speciality=All&title=
        */

        //Print health professionals details
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

        //print existing appointments
        printExistingAppointments();
        System.out.println("------------------------------");

        //cancel a booking
        cancelBooking("1234567890");
        System.out.println("------------------------------");

        //print existing appointments
        printExistingAppointments();
        System.out.println("------------------------------");

    }

    //method to create an Appointment
    public static void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(newAppointment);
    }

    //method to print existing appointments
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

    //method to cancel a booking
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
