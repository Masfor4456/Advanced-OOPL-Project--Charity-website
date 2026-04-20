/**
 * Name: Mason Ford
 * Date:04/07/2026
 * Assignment: Project Week 1
 * Description: Base class representing a general organization
*
 * Base class representing an organization
 */
public class Organization implements Displayable {

    protected String name;
    protected String description;

    public Organization(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // This will be overridden (polymorphism)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }
}