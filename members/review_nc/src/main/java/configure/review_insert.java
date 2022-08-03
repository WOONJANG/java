package configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class review_insert extends HttpServlet {
	
	String NAME, PRODUCT, VALUES, REVIEWTEXT;
	int VALUESn;
	
	private static final long serialVersionUID = 1L;
       
    public review_insert() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		this.NAME = request.getParameter("user_name");
		this.PRODUCT = request.getParameter("user_product");
		this.VALUES = request.getParameter("rd");
		this.REVIEWTEXT = request.getParameter("user_review_text");
		
		this.VALUESn = Integer.parseInt(this.VALUES);
		
		insert_module im = new insert_module();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(this.NAME);
		list.add(this.PRODUCT);
		list.add(this.VALUES);
		list.add(this.REVIEWTEXT);
		
		im.insert_module(list);
		
		String r = im.review_ok_msg().intern();
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pr = response.getWriter();
		
		 if(r == "ok") {
	         pr.print("<script>"
	               + "alert('리뷰 작성이 완료 되었습니다.');"
	               + "location.href='./review_write.html';"
	               +"</script>");
	      }
		 else {
	         pr.print("<script>"
	               + "alert('내부 시스템 오류로 인하여 리뷰 작성이 저장되지 않았습니다.');"
	               + "location.href='./review_write.html';"
	               +"</script>");
	      }
	}

}
