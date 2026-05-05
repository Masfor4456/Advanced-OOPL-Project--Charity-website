import java.sql.*;

/**
 * Name: Mason Ford
 * Date: 05/05/2026
 * Purpose: Handles SQLite database operations (CRUD)
 */
public class DatabaseManager {

    private static final String URL = "jdbc:sqlite:project.db";

    // Create table if it doesn't exist
    public static void initializeDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS organizations (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "description TEXT," +
                "type TEXT," +
                "extra TEXT" +
                ");";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // CREATE
    public static void addOrganization(String name, String description, String type, String extra) {
        String sql = "INSERT INTO organizations(name, description, type, extra) VALUES(?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, description);
            pstmt.setString(3, type);
            pstmt.setString(4, extra);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    // READ
    public static void viewAll() {
        String sql = "SELECT * FROM organizations";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("\n---------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Type: " + rs.getString("type"));
                System.out.println("Extra: " + rs.getString("extra"));
            }

        } catch (SQLException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }

    // UPDATE
    public static void updateOrganization(int id, String newName) {
        String sql = "UPDATE organizations SET name = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }

    // DELETE
    public static void deleteOrganization(int id) {
        String sql = "DELETE FROM organizations WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Delete error: " + e.getMessage());
        }
    }
}