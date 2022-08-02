package configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class joinok extends HttpServlet {
	String ID,PW,NAME,EMAIL,TEL,ZIPCODE,DORO,HOME;
	private static final long serialVersionUID = 1L;
       
    public joinok() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		this.ID = request.getParameter("user_id");
		this.PW = request.getParameter("user_pw");
		this.NAME = request.getParameter("user_name");
		this.EMAIL = request.getParameter("user_email");
		this.TEL = request.getParameter("user_tel");
		this.ZIPCODE = request.getParameter("zipcode");
		this.DORO = request.getParameter("doro_addr");
		this.HOME = request.getParameter("home_addr");
//		System.out.println(ID + " " + PW + " " + NAME + " " + EMAIL + " " + TEL + " " + ZIPCODE + " " + DORO + " " + HOME);
		
		join_module jm = new join_module();
		
		this.PW = jm.pass_sc(this.PW); // base64 변환
		ArrayList<String> list = new ArrayList<String>();
		list.add(this.ID);
		list.add(this.PW);
		list.add(this.NAME);
		list.add(this.EMAIL);
		list.add(this.TEL);
		list.add(this.ZIPCODE);
		list.add(this.DORO);
		list.add(this.HOME);
		jm.insert(list);
		
		String r = jm.join_msg().intern();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pr = response.getWriter();
		
		 if(r == "ok") {
	         pr.print("<script>"
	               + "alert('회원가입이 완료 되었습니다.');"
	               + "location.href='./index.html';"
	               +"</script>");
	      }
	      else {
	         pr.print("<script>"
	               + "alert('데이터가 올바르지 않습니다.');"
	               + "location.href='./join.html';"
	               +"</script>");
	      }
	}

}
