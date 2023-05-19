
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DBconnection {
	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "Newdata";
	String user = "postgres";
	String pass = "root";
	Connection conn;
	Statement st;
	
public DBconnection() throws SQLException {
	conn = DriverManager.getConnection(url+dbName,user,pass);
	st = conn.createStatement();
	System.out.println("db connnesso");
	
	
}

}
