package config;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class faq_view extends HttpServlet {
	dbconnection DC = null;
	Connection CT = null;
	PreparedStatement PS = null;
	PrintWriter PR = null;
	private static final long serialVersionUID = 1L;
       
    public faq_view() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			this.DC = new dbconnection();
			this.CT = DC.DBCON();
			String idx = request.getParameter("idx");
			
			String sql2 = "select count(*) from FAQ where FINDEX='"+ idx +"'";
			PreparedStatement PS2 = CT.prepareStatement(sql2);
			ResultSet rs2 = PS2.executeQuery(); 
			
			
			
			String sql = "select * from FAQ where FINDEX='"+ idx +"'";
			PreparedStatement PS = CT.prepareStatement(sql);
			ResultSet rs = PS.executeQuery();
			response.setContentType("text/html;charset=utf-8");
			this.PR = response.getWriter();
			// rs.next() : buffer와 동일하게 한번 사용하면 소멸함
			if(rs2.next() == false) { // count로 값을 확인, 단 select  에 대한 where 
				this.PR.write("<script>"
						+ "alert('올바른 접근이 아님')"
						+ "history.go(-1)"
						+ "</script>");
			}
			else {
				String INDEX = null;
				String CATEGORY = null;
				String USER = null;
				String FQ = null;
				String FA = null;
				String VIEW = null;
				
				while(rs.next()) {
					INDEX = rs.getString("FINDEX");	
					CATEGORY = rs.getString("FCATEGORY");	
					USER = rs.getString("FUSER");	
					FQ = rs.getString("FQ");	
					FA = rs.getString("FA");	
					VIEW = rs.getString("FPRINT");	
				}
				request.setAttribute("FINDEX", INDEX);
				request.setAttribute("FCATEGORY", CATEGORY);
				request.setAttribute("FUSER", USER);
				request.setAttribute("FQ", FQ);
				request.setAttribute("FA", FA);
				request.setAttribute("FPRINT", VIEW);
//				System.out.println(USER);
//				System.out.println(CATEGORY);
			}
		
		request.setCharacterEncoding("UTF-8");
		PrintWriter PR = response.getWriter();
		RequestDispatcher RD = request.getRequestDispatcher("/faq_view.html");
		RD.forward(request, response);
		
		response.setContentType("text/html;charset=utf-8");
		}catch(Exception e) {
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
