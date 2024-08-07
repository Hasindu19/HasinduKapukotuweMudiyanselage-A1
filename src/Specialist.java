public class Specialist extends HealthProfessional {
    private String expertise;

    // Default constructor
    public Specialist() {
        super();
        this.expertise = "";
    }

    // Parameterized constructor
    public Specialist(int id, String name, int yearsOfExperience, String expertise) {
        super(id, name, yearsOfExperience);
        this.expertise = expertise;
    }

    // Method to print details

    @Override
    public void printDetails() {
        System.out.println("The doctor details are:");
        super.printDetails();
        System.out.println("Health Professional Type: Specialist");
        System.out.println("Expertise: " + expertise);
    }
}
