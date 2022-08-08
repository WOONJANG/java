package config;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class faq_update extends HttpServlet {
	dbconnection DC = null;
	Connection CT = null;
	PreparedStatement PS = null;
	PrintWriter PR = null;
	private static final long serialVersionUID = 1L;
       
    public faq_update() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		this.PR = response.getWriter();
		try {
			this.DC = new dbconnection();
			this.CT = DC.DBCON();
			String idx = request.getParameter("FINDEX");
			String category =request.getParameter("FCATEGORY");
			String fq = request.getParameter("FQ");
			String fa = request.getParameter("FA");
			String sql = "update FAQ set FCATEGORY='"+ category +"',FQ='"+ fq +"',FA='"+ fa +"'where FINDEX='"+ idx +"'";
			this.PS = this.CT.prepareStatement(sql);
			
			int n = 0;
			n = this.PS.executeUpdate();
			if(n > 0) {
				this.PR.print("<script>"
						+ "alert('수정완료')"
						+ "location.href='./faq_list.html'"
						+ "</script>");
			}
			else {
				throw new Exception("ERROR");
			}
		}catch(Exception e) {
			this.PR.print("<script>"
					+ "alert('올바른 접근이 아님')"
					+ "history.go(-1)"
					+ "</script>");
		}
	}

}
