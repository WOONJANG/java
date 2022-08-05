package configure;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(	// 파일 업로드 기능 처리시 사용되는 어노테이션 속성

		 fileSizeThreshold = 1024 * 1024 * 1,	// 1MB (파일 업로드시 사용되는 메모리 임시크기 용량)
		 maxFileSize = 1024 * 1024 * 2,		// 2MB (업로드 파일 최대 크기값)
		 maxRequestSize = 1024 * 1024 * 2	// 2MB (전송에 따른 최대 크기값)
)

public class review_insert extends HttpServlet {
	
	String NAME, PRODUCT, VALUES, REVIEWTEXT, IMG, URL;
	int VALUESn;
	
	private static final long serialVersionUID = 1L;
       
    public review_insert() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// URLDecoder.decode : Multipart/form-data 역 해석
		this.NAME = URLDecoder.decode(request.getParameter("user_name"),"UTF-8");
		this.PRODUCT = URLDecoder.decode(request.getParameter("user_product"),"UTF-8");
		this.VALUES = URLDecoder.decode(request.getParameter("rd"),"UTF-8");
		this.REVIEWTEXT = URLDecoder.decode(request.getParameter("user_review_text"),"UTF-8");
		
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
		String today = time.format(dtf);
		
		this.VALUESn = Integer.parseInt(this.VALUES);
		
		
		/*	Stream이 있는 형태의 파일 업로드	*/
		
		
		
		response.setContentType("text/html;charset=utf-8");
		ArrayList<String> list = new ArrayList<String>();
		Part filepart = request.getPart("file");
		String filename = filepart.getSubmittedFileName().intern();	
		if(filename != "") {
		String paths = request.getServletContext().getRealPath("");  
		InputStream is = filepart.getInputStream(); 
		String savepath = paths + "upload/" + today + "_" + filename;	
		FileOutputStream fo = new FileOutputStream(savepath);
		
		this.URL = savepath.replace("/jangwoon0518/tomcat/webapps", ".");
		
		byte[] bf = new byte[1024];
		int size = 0;
		while((size = is.read(bf)) != -1) {
			fo.write(bf,0,size);
		}
		fo.close();
		is.close();
		
		
		response.getWriter().print("ok");
		
		
			list.add(this.NAME);
			list.add(this.PRODUCT);
			list.add(this.VALUES);
			list.add(this.REVIEWTEXT);
			list.add(this.URL);
		}
		else {
			list.add(this.NAME);
			list.add(this.PRODUCT);
			list.add(this.VALUES);
			list.add(this.REVIEWTEXT);
			list.add(null);
		}
		
		insert_module im = new insert_module();
		filedb fd = new filedb();
		
		im.insert_module(list);
		
		try {
			fd.file_insert(this.URL);
		} catch (ClassNotFoundException | SQLException e) {
		}
		String r = im.review_ok_msg().intern();
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pr = response.getWriter();
		
		 if(r == "ok") {
	         pr.print("<script>"
	               + "alert('리뷰 작성이 완료 되었습니다.');"
	               + "location.href='./index.do';"
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
