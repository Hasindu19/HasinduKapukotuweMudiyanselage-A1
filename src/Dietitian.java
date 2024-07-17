public class Dietitian extends HealthProfessional {

    private String dietitianSpecialty;

    //Default Constructor
    public Dietitian() {
        super();
        this.dietitianSpecialty = "";
    }

    // Parameterized constructor
    public Dietitian(int id, String name, int yearsOfExperience, String dietitianSpecialty) {
        super(id, name, yearsOfExperience);
        this.dietitianSpecialty = dietitianSpecialty;
    }

    // Method to print details
    @Override
    public void printDetails() {
        System.out.println("The doctor details are:");
        super.printDetails();
        System.out.println("Health Professional Type: Dietitian");
        System.out.println("Dietitian Specialty: " + dietitianSpecialty);
    }

}
