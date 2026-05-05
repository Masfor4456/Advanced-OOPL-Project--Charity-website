import java.util.Scanner;

/**
 * Name: Mason Ford
 * Date: 2026
 * Purpose: Week 4 application demonstrating database CRUD operations
 */
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DatabaseManager.initializeDatabase();

        System.out.println("=========================================");
        System.out.println(" Project Week 4 Charity Portal");
        System.out.println(" By: Mason Ford");
        System.out.println("=========================================\n");

        System.out.println("Welcome. This application demonstrates database interactions.\n");

        boolean running = true;

        while (running) {

            System.out.println("\n1. Add Organization");
            System.out.println("2. View All");
            System.out.println("3. Update Name");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Select option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // fix input issue

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Description: ");
                    String desc = scanner.nextLine();

                    System.out.print("Type (Charity/Branch): ");
                    String type = scanner.nextLine();

                    System.out.print("Extra (Donation link or location): ");
                    String extra = scanner.nextLine();

                    DatabaseManager.addOrganization(name, desc, type, extra);
                    break;

                case 2:
                    DatabaseManager.viewAll();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("New name: ");
                    String newName = scanner.nextLine();

                    DatabaseManager.updateOrganization(updateId, newName);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();

                    DatabaseManager.deleteOrganization(deleteId);
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}