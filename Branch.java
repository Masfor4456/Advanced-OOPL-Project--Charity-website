/**
 * Child class representing a company branch
 * Demonstrates BOTH inheritance and composition
 *
 * Derived class demonstrating inheritance + composition
 */
public class Branch extends Organization {

    private Address address; // composition

    public Branch(String name, String description, Address address) {
        super(name, description);
        this.address = address;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        address.displayAddress();
    }
}