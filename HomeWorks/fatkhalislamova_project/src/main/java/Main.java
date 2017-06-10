import java.sql.*;

/**
 * Created by Регина on 09.06.2017.
 */
public class Main {
    //language=SQL
    private static final String SELECT_ALL_USERS =
            "SELECT * FROM Users";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/fatkhalislamova_project",
                    "postgres",
                    "postgres");

            Statement selectStatement
                    = connection.createStatement();

            ResultSet resultSet =
                    selectStatement.executeQuery(SELECT_ALL_USERS);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " +
                        resultSet.getString("name") + " " +
                        resultSet.getString("password"));
            }
        }



        catch (SQLException e) {
            throw new IllegalStateException(e);
            }
        }
}
