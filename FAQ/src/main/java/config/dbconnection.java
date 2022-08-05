package config;

import java.sql.*;

public class dbconnection {
	static String DBDRIVER = null;
	static String DBURL = null;
	static String DBID = null;
	static String DBPW = null;
	protected Connection DBCON() throws ClassNotFoundException, SQLException{
		
		this.DBDRIVER = "com.mysql.jdbc.Driver";
//		this.DBURL = "jdbc:mysql://umj7-009.cafe24.com/jangwoon0518";
		this.DBURL = "jdbc:mysql://localhost:3306/jangwoon0518";
		this.DBID = "jangwoon0518";
		this.DBPW = "boyun981124@";
		Class.forName(DBDRIVER);
		Connection CON = DriverManager.getConnection(this.DBURL,this.DBID,this.DBPW);
		
		return CON;
	}
}
