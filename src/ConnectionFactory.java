import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

    private static Connection connection = null;

    private ConnectionFactory(){
    }

    public static Connection getConnection() throws SQLException {
        if(connection == null){
            ResourceBundle resourceBundle = ResourceBundle.getBundle("dbConfig");
            String url = resourceBundle.getString("url");
            String username = resourceBundle.getString("username");
            String password = resourceBundle.getString("password");

            try{
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException throwable){
                throwable.printStackTrace();
            }
        }
        return connection;
    }
}
