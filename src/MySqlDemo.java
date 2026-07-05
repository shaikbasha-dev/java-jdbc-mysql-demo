import java.sql.*;

/**
 * Headline: MySqlDemo - Isolated Multi-Operation JDBC Broker
 * Description: Orchestrates standard schema creation and decoupled record 
 * entry processes using native JDBC database drivers.
 */

public class MySqlDemo {

    /**
     * Headline: Application Entry Point
     * Description: Safely passes checked exceptions up the stack trace while executing database operations.
     */
    
    public static void main(String[] args) throws Exception {
        // Step 1: Fire default data insertion routing verification
        connectMySql();
        
        // Step 2: Uncomment below lines sequentially to isolate and test specific schema mutations
        // createTable();
        // insertRow();
    }

    /**
     * Headline: Default MySQL Data Connectivity Verification
     * Description: Establishes a socket network session and attempts an automatic try-with-resources insert operation.
     */
    
    public static void connectMySql() throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "root";
        String sql = "INSERT INTO sample VALUES(999, 'Anusha')";

        // Use Try-With-Resources to guarantee safety against local execution memory leakage
        try (
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement()
        ) {
            int row = st.executeUpdate(sql);
            System.out.println("Rows Updated: " + row);
            System.out.println("Connection Successful: " + con);
        }
    }

    /**
     * Headline: Programmatic DDL Schema Creation Routine
     * Description: Generates a persistent structure named 'trainers' securely inside the targeted workspace.
     */
    
    public static void createTable() throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "root";
        String sql = "CREATE TABLE trainers(id INT, name VARCHAR(10))";

        try (
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement()
        ) {
            st.executeUpdate(sql);
            System.out.println("Table created successfully");
        }
    }

    /**
     * Headline: Standard DML Record Write Sequence
     * Description: Targets the newly provisioned 'trainers' dataset schema block to append static parameters.
     */
    
    public static void insertRow() throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "root";
        String sql = "INSERT INTO trainers VALUES(1,'DEEP')";

        try (
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement()
        ) {
            int row = st.executeUpdate(sql);
            System.out.println("Inserted rows : " + row);
        }
    }
}
