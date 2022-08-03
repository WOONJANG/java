package configure;

import java.sql.*;

public class dbconfig {	//SQL 환경설정
	
	
		protected Connection dbcon() throws ClassNotFoundException,SQLException{
			/*	톰캣 버전	*/
//			String dbdriver = "com.mysql.jdbc.Driver";
//			String dburl = "jdbc:mysql://localhost:3306/webmail";
//			String dbuser = "hong";
//			String dbpw = "0000";
//			Class.forName(dbdriver);	// jdbc 클래스 로드명
//			Connection con = DriverManager.getConnection(dburl,dbuser,dbpw);
//			return con;
			
			
			/*	cafe24 버전	*/
			String dbdriver = "com.mysql.jdbc.Driver";
			String dburl = "jdbc:mysql://localhost:3306/jangwoon0518";
			String dbuser = "jangwoon0518";
			String dbpw = "boyun981124@";
			Class.forName(dbdriver);	// jdbc 클래스 로드명
			Connection con = DriverManager.getConnection(dburl,dbuser,dbpw);
			return con;
		}
	
	
}