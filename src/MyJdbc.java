import java.sql.*;

public class MyJdbc {

    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/practicejdbc";
        String user = "root";
        String password = "jehovahh";

        String query = "SELECT * FROM users";

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)
        ) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
