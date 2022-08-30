package test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;


//DB접속 출력 
public class listdb {
	
	public String DRIVER = "com.mysql.jdbc.Driver";
	public String URL = "jdbc:mysql://umj7-009.cafe24.com/jangwoon0518";
	public String ID = "jangwoon0518";
	public String PW = "boyun981124@";
	public Connection CON = null;
	public listdb() {
	}
	
	public String insert(dbservice dbservice) throws SQLException,ClassNotFoundException {
		String result = "error";
		String mid = dbservice.mid;
		String mpw = dbservice.mpw;
		String usernm = dbservice.usernm;
		String tel = dbservice.tel;
		String age = dbservice.age;
		String sql = "insert into test3(midx, mid, mpw, mnm, mtel, mage) values ('0',?,?,?,?,?)";
		Class.forName(DRIVER);
		CON = DriverManager.getConnection(URL,ID,PW);
		
		PreparedStatement PS = CON.prepareStatement(sql);
		
		PS.setString(1, mid);
		PS.setString(2, mpw);
		PS.setString(3, usernm);
		PS.setString(4, tel);
		PS.setString(5, age);
		
		int n = PS.executeUpdate();
		if(n > 0) {
			result = "ok";
		}
			PS.close();
			CON.close();
			return result;
		
		
	}
}
