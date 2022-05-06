package dbFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionManager {
   // private static Connection connection;
    private static Connection connection;

    public ConnectionManager(){

    }

    public static Connection getConnection() {

        if(connection == null){

            try {
                ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
                String url = bundle.getString("url");
                String username = bundle.getString("username");
                String password = bundle.getString("password");

                connection = DriverManager.getConnection(url, username, password);
            }catch (SQLException e){
                e.printStackTrace();
            }

        }
        return connection;

    }
}
