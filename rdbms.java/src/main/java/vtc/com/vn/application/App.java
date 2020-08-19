package vtc.com.vn.application;


import java.sql.Connection;
import java.sql.SQLException;

import static vtc.com.vn.connection.JDBCConnection.getJDBConnection;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     * @throws UnsupportedEncodingException
     */
    public static void main(String[] args) throws SQLException {
        Connection connection = getJDBConnection();
        if (connection != null) {
            System.out.println("Kết Nối thành công ");
        } else {
            System.out.println("Lỗi kết nối");
        }
        Menu.ShowMenu();    
    }

}
