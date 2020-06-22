package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import connectionData.ConnectionData; 

public class DBTest extends ConnectionData{
	
	public static void main(String[] args) throws Throwable {
		
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, user, pass);
	Statement statement = connection.createStatement();		
	ResultSet rs = statement.executeQuery(query);
	
	while (rs.next()){
		for(int i=1; i<5; i++)
	        System.out.print(rs.getString(i) + " ");
	    System.out.println();
	}
	
	}
}
