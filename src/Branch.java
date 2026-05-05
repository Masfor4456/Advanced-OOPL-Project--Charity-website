/**
 * Purpose: Represents a company branch
 * Demonstrates inheritance + composition + abstraction
 */
public class Branch extends Organization {

    private Address address;

    // Default constructor
    public Branch() {
        super();
        this.address = new Address("Unknown", "Unknown");
    }

    // Parameterized constructor
    public Branch(String name, String description, Address address) {
        super(name, description);
        this.address = address;
    }

    // Implementation of abstract method
    @Override
    public void displayInfo() {
        displayBasicInfo();
        address.displayAddress();
    }
}