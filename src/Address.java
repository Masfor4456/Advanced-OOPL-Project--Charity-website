/**
 * Purpose: Stores address information (composition)
 */
public class Address {

    private String city;
    private String state;

    // Constructor
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public void displayAddress() {
        System.out.println("Location: " + city + ", " + state);
    }
}