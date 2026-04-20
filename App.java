import java.util.ArrayList;

/**
 * Name: Mason Ford
 * Date: 2026
 * Purpose: Week 2 Application demonstrating interface + polymorphism
 */
public class App {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" Project Week 2 – Charity Portal");
        System.out.println(" By: Mason Ford");
        System.out.println("=========================================\n");

        System.out.println("Welcome! This application demonstrates interfaces and polymorphism.\n");

        // Create objects
        Charity redCross = new Charity(
                "Red Cross",
                "Provides disaster relief.",
                "https://www.redcross.org/donate"
        );

        Address vaAddress = new Address("Charlottesville", "VA");

        Branch vaBranch = new Branch(
                "Virginia Branch",
                "Local operations branch.",
                vaAddress
        );

        // POLYMORPHISM: storing different types in same list
        ArrayList<Displayable> items = new ArrayList<>();

        items.add(redCross);
        items.add(vaBranch);

        // POLYMORPHISM: same method call, different behavior
        for (Displayable item : items) {
            System.out.println("\n---------------------");
            item.displayInfo();
        }
    }
}