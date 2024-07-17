public class HealthProfessional {

    private int id;
    private String name;
    private int yearsOfExperience;

    // Default constructor
    public HealthProfessional() {

        this.id = 0;
        this.name = "";
        this.yearsOfExperience = 0;

    }

    // Parameterized constructor
    public HealthProfessional(int id, String name, int yearsOfExperience) {
        this.id = id;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    //Method to print details
    public void printDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Years Of Experience: " + yearsOfExperience);
    }

}
