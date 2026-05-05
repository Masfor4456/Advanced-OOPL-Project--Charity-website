/**
 * Purpose: Represents a charity organization
 * Demonstrates inheritance, constructors, and abstraction
 */
public class Charity extends Organization {

    private String donationLink;

    // Default constructor
    public Charity() {
        super();
        this.donationLink = "No link available";
    }

    // Parameterized constructor
    public Charity(String name, String description, String donationLink) {
        super(name, description);
        this.donationLink = donationLink;
    }

    // Implementation of abstract method
    @Override
    public void displayInfo() {
        displayBasicInfo();
        System.out.println("Donate here: " + donationLink);
    }
}