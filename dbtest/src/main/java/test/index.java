package test;

import java.io.Console;
import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public index() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	// Connection + 함수명(getConnection) : SQL에 연결되는 메소드 이름.
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		/*	DB 접속 정보	*/
		String dbconnect = "com.mysql.jdbc.Driver";
		// com.mysql.jdbc.Driver (ver 5.X) or com.mysql..cj.jdbc.Driver (ver 8.x) - Spring
		String dburl = "jdbc:mysql://localhost:3306/webmail";	
		// localhost (서버주소) : 3306(mysql prot)/데이터베이스이름 
		String dbuser ="hong";	// 사용자 DB 접속 아이디
		String dbpassword = "0000";	// 사용자 DB 접속 패스워드
		Class.forName(dbconnect);
		// 해당 정보를 Class로드 함
		
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpassword);
		// DriverManager.getConnection(연결주소,사용자아이디,사용자패스워드)
		return con;	// return 필수
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			Connection con = getConnection();
			System.out.println("연결성공");
			String sql = "select * from shopmember";
//			con.createStatement(); // 사용 안 함
			PreparedStatement ps = con.prepareStatement(sql);
			// PreparedStatement 를 핫용하는 이유는 데이터베이스 효율성을 높이기 위해서 사용하는 문법
			ResultSet rs = ps.executeQuery();
			// executeQuery : select 문 에서만 사용
			int w = 0;
			while(rs.next()) {	// next()  데이터베이스 전체 리스트값
			String user = rs.getString("suser"); // getString("컬럼명")
			String password = rs.getString("spassword"); // getString("컬럼명")
			System.out.println(user + "-" + password);
			}
			
			
		}catch(Exception e) {
			System.out.println("연결실패");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
