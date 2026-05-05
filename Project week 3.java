import java.util.ArrayList;

/**
 * Name: Mason Ford
 * Date: 05/05/2026
 * Purpose: Week 3 Application demonstrating abstraction, constructors, and access specifiers
 */
public class App {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" Project Week 3 Charity Portal");
        System.out.println(" By: Mason Ford");
        System.out.println("=========================================\n");

        System.out.println("Welcome! This application demonstrates abstraction, constructors, and access control.\n");

        // Instantiate objects using constructors
        Charity redCross = new Charity(
                "Red Cross",
                "Provides disaster relief.",
                "https://www.redcross.org/donate"
        );

        Branch vaBranch = new Branch(
                "Virginia Branch",
                "Local operations branch.",
                new Address("Charlottesville", "VA")
        );

        // Polymorphism still works with abstraction
        ArrayList<Displayable> items = new ArrayList<>();
        items.add(redCross);
        items.add(vaBranch);

        for (Displayable item : items) {
            System.out.println("\n---------------------");
            item.displayInfo();
        }
    }
}