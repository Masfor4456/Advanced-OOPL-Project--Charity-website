/**
 * Name: Mason Ford
 * Date: 05/05/2026
 * Purpose: Abstract base class demonstrating abstraction
 */
public abstract class Organization implements Displayable {

    // private = better encapsulation
    private String name;
    private String description;

    // Default constructor
    public Organization() {
        this.name = "Unknown";
        this.description = "No description available";
    }

    // Parameterized constructor
    public Organization(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters (controlled access)
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Shared method
    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }

    // ABSTRACT METHOD (forces subclasses to define behavior)
    public abstract void displayInfo();
}