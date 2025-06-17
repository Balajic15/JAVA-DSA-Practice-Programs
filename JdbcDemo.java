import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        Statement st = con.createStatement();

        st.execute("CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, name VARCHAR(50))");
        st.execute("INSERT INTO users VALUES (1, 'Alice'), (2, 'Bob')");
        st.execute("DELETE FROM users WHERE id = 2");

        ResultSet rs = st.executeQuery("SELECT * FROM users");
        while (rs.next()) System.out.println(rs.getInt("id") + " " + rs.getString("name"));

        con.close();
    }
}
