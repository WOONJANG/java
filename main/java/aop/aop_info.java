package aop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// log 관련 class method에는 별도로 servlet관련 정보 및 인자값에 객체를 넣어버리면 aop 시작시 에러가 발생 하는 형태
// log 기록 class
public class aop_info {
	
	String dbdriver = "com.mysql.jdbc.Driver";
	String dburl = "jdbc:mysql://umj7-009.cafe24.com/jangwoon0518";
	String dbuser = "jangwoon0518";
	String dbpw = "boyun981124@";
	String uri = "";
	
	// 강제 setter 역할
	public void aop_info2(String uri) {
		this.uri = uri;
	}

	
	public void log_indata() {
		try {
			Class.forName(dbdriver);
			Connection con = DriverManager.getConnection(dburl,dbuser,dbpw);
			String sqls = "insert into logdata values ('0',?)";
			PreparedStatement ps = con.prepareStatement(sqls);
			ps.setString(1, this.uri);
			ps.executeUpdate();
			System.out.println(this.uri);
			System.out.println("로그 실행");
		}catch(Exception e) {
			
		}
	}
}
