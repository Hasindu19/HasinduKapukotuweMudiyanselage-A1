public class GeneralPractitioner extends HealthProfessional{

    private String interest;

    // Default constructor
    public GeneralPractitioner(){
        super();
        this.interest = "";
    }

    // Parameterized constructor
    public GeneralPractitioner(int id, String name, String department, String interest){
        super(id, name, department);
        this.interest = interest;
    }

    // Method to print details
    @Override
    public void printDetails() {
        System.out.println("The doctor details are: ");
        super.printDetails();
        System.out.println("Health Professional Type: General Practitioner");
        System.out.println("Interest: " + interest);
    }
}
