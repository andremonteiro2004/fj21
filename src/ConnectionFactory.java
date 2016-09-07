import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory{

public  Connection getConnection() {
	try{
		return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "c0n3ctivid@d3");
		
	}catch (SQLException e){
		throw new RuntimeException (e);
	}
	
}
}
