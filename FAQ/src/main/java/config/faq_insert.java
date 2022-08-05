package config;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class faq_insert extends HttpServlet {
	
	String FCATEGORY, FUSER , FQ , FA , VIEW, URL, TIME;
	PrintWriter PR = null;
	private static final long serialVersionUID = 1L;
       
    public faq_insert() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		this.FCATEGORY =  request.getParameter("CATEGORY");
		this.FUSER = request.getParameter("USER_NAME");
		this.FQ = request.getParameter("USER_Q");
		this.FA = request.getParameter("USER_A");
		this.VIEW = request.getParameter("FVIEW");
		time today = new time();
		this.TIME = today.today();
		
		response.setContentType("text/html;charset=utf-8");
		this.PR = response.getWriter();
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(this.FCATEGORY);
		list.add(this.FUSER);
		list.add(this.FQ);
		list.add(this.FA);
		list.add(this.VIEW);
		list.add(this.TIME);
		
		faq_insert_module FIM = new faq_insert_module();
		FIM.insert_module(list);
		System.out.println(list);
		String RESULT = FIM.write_ok_msg().intern();
		 if(RESULT == "ok") {
	         this.PR.print("<script>"
	               + "alert('질문 작성이 완료 되었습니다.');"
	               + "location.href='./faq_list.html';"
	               +"</script>");
	      }
		 else {
			 this.PR.print("<script>"
	               + "alert('내부 시스템 오류로 인하여 저장되지 않았습니다.');"
//	               + "history.go(-1);"
	               +"</script>");
	      }
		
	}

}
