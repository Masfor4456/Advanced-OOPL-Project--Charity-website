import java.util.Scanner;

/**
 * Name: Mason Ford
 * Date: 04/07/2026
 * Assignment: Project Week 1
 * Description: Main application simulating a website-style navigation system
 */
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Sample data (instantiating objects)
        Charity redCross = new Charity(
                "Red Cross",
                "Provides emergency assistance and disaster relief.",
                "https://www.redcross.org/donate"
        );

        Charity unicef = new Charity(
                "UNICEF",
                "Supports children's rights and development.",
                "https://www.unicef.org/donate"
        );

        // Composition (Address inside Branch)
        Address vaAddress = new Address("Richmond", "VA");
        Branch vaBranch = new Branch(
                "Virginia Branch",
                "Local support branch.",
                vaAddress
        );

        boolean running = true;

        // Startup display
        System.out.println("=========================================");
        System.out.println(" Project Week 1 – Charity Portal");
        System.out.println(" By: Mason Ford");
        System.out.println("=========================================\n");

        System.out.println("Welcome!");
        System.out.println("Navigate using the menu below.\n");

        // Main loop (simulating hyperlinks)
        while (running) {

            System.out.println("\n--- Main Menu ---");
            System.out.println("1. About");
            System.out.println("2. View Branches");
            System.out.println("3. Donate");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- About Us ---");
                    System.out.println("This portal connects users with charities and company branches.");
                    break;

                case 2:
                    System.out.println("\n--- Branch Information ---");
                    vaBranch.displayInfo(); // inheritance + composition
                    break;

                case 3:
                    System.out.println("\n--- Donation Links ---");
                    redCross.displayInfo(); // inheritance
                    System.out.println();
                    unicef.displayInfo();
                    break;

                case 4:
                    System.out.println("\nThank you for visiting. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}