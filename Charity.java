/**
 * Child class demonstrating inheritance from Organization
 */
public class Charity extends Organization {

    private String donationLink;

    // Constructor
    public Charity(String name, String description, String donationLink) {
        super(name, description); // inheritance
        this.donationLink = donationLink;
    }

    // Override display method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Donate here: " + donationLink);
    }
}