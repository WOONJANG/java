package config;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class faq_delete extends HttpServlet {
	dbconnection DC = null;
	Connection CT = null;
	PreparedStatement PS = null;
	private static final long serialVersionUID = 1L;
       
    public faq_delete() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String idxs = request.getParameter("idx").intern();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter PR = response.getWriter();
		System.out.println(idxs);
		faq_delete_module ds = new faq_delete_module();
		String msg = ds.delete_module(idxs).intern();
		if(idxs == null || idxs == "") {
			PR.write("<script>"
					+ "alert('정상 삭제');"
					+ "./faq_list.html;"
					+ "</script>");
		}
		else {
			if(msg == "ok") {
				PR.write("<script>"
						+ "alert('올바른 접근이 아닙니다');"
						+ "history.go(-1);"
						+ "</script>");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
