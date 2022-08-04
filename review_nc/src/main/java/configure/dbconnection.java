package configure;
import java.sql.*;
public class dbconnection {
	
	
	
	protected Connection dbcon() throws ClassNotFoundException,SQLException{
		
		/*	cafe24 버전	*/
		String dbdriver = "com.mysql.jdbc.Driver";
		String dburl = "jdbc:mysql://localhost:3306/jangwoon0518";
		String dbuser = "jangwoon0518";
		String dbpw = "boyun981124@";
		Class.forName(dbdriver);
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpw);
		return con;
	}


}
	

