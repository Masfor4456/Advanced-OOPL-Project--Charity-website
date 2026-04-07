/**
 * Child class representing a company branch
 * Demonstrates BOTH inheritance and composition
 */
public class Branch extends Organization {

    private Address address; // composition (HAS-A relationship)

    public Branch(String name, String description, Address address) {
        super(name, description); // inheritance
        this.address = address;
    }

    public void displayInfo() {
        super.displayInfo();
        address.displayAddress(); // composition usage
    }
}