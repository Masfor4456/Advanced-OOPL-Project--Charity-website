/**
 * Name: Mason Ford
 * Date:04/07/2026
 * Assignment: Project Week 1
 * Description: Base class representing a general organization
 */
public class Organization {

    protected String name;
    protected String description;

    // Constructor
    public Organization(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Method to display basic info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }
}