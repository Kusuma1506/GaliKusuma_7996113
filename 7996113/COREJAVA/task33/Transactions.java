import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Transactions {

    static String url = "jdbc:mysql://localhost:3306/studentdb1";
    static String username = "root";
    static String password = "Kusuma@15";

    public static void transferMoney(int fromId, int toId, double amount) {

        Connection con = null;

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            con = DriverManager.getConnection(url, username, password);

            con.setAutoCommit(false);

            String debit =
                "UPDATE accounts SET balance = balance - ? WHERE id=?";

            PreparedStatement ps1 = con.prepareStatement(debit);

            ps1.setDouble(1, amount);
            ps1.setInt(2, fromId);

            ps1.executeUpdate();

            String credit =
                "UPDATE accounts SET balance = balance + ? WHERE id=?";

            PreparedStatement ps2 = con.prepareStatement(credit);

            ps2.setDouble(1, amount);
            ps2.setInt(2, toId);

            ps2.executeUpdate();

            con.commit();

            System.out.println("Transaction Successful");

        } catch (Exception e) {

            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }

            System.out.println("Transaction Failed");
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        transferMoney(1, 2, 2000);
    }
}