package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;
import java.sql.*;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.Response;

public class index3 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	protected PrintWriter pr = null;
	protected Connection con = null;
	protected LocalDateTime now = null;
	String mname,mid,mpw,memail;
//	@Override
//	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/html;charset=utf-8");
//		this.pr = resp.getWriter();
//				
//		try {
//			dbconnect db = new dbconnect();
//			this.con = db.ct();
//			this.pr.write("<script>console.log('DB접속 성공')</script>");
//		}catch(Exception e) {
//			this.pr.write("<script>console.log('DB접속 오류')</script>");
//			e.getMessage();
//		}
//	} 
	
    public index3(){
		try {
		dbconnect db = new dbconnect();
			this.con = db.ct();
		}catch(Exception e) {
			e.getMessage();
		}
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.mname = request.getParameter("join_nm");
		this.mid = request.getParameter("join_id");
		this.mpw = request.getParameter("join_pw");
		this.memail = request.getParameter("join_email");
		
		/*	datetime으로 하는경우	*/
		this.now = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String today = this.now.format(df);
//		System.out.println(this.mname + this.mid + this.mpw + this.memail + this.now);
		
		int point = 1000;
		/*	auto_increment 값 반드시 적어야함	*/
		String sql = "insert into joinmember (join_idx,join_nm,join_id,join_pw,join_email,join_point,join_date) values ('0','" + this.mname + "','" + this.mid + "','" + this.mpw + "' ,'"+this.memail+"','"+point+"','"+today+"')";
		/*	? 로 표시 할 경우 무조건 1부터 시작	*/
		System.out.println(sql);
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			int oksign = 0;
			// executeUpdate : insert update delete에서 만 사용
			oksign = ps.executeUpdate();
			// 정확하게 저장될 경우 oksign은 무조건 +1이 작동
			// 오류 발생시 0으로 계속 진행
			response.setContentType("text/html;charset=utf-8");
			this.pr = response.getWriter();
			if(oksign > 0) {
				this.pr.write("회원가입이 정상적으로 진행 되었습니다.");
			}
			else {
				this.pr.write("DB 컬럼에 문제가 발생하였습니다.");
			}
		}catch(Exception e) {
		}
		
		
	}

}
