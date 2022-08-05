package configure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
@MultipartConfig(	// 파일 업로드 기능 처리시 사용되는 어노테이션 속성

		 fileSizeThreshold = 1024 * 1024 * 1,	// 1MB (파일 업로드시 사용되는 메모리 임시크기 용량)
		 maxFileSize = 1024 * 1024 * 2,		// 2MB (업로드 파일 최대 크기값)
		 maxRequestSize = 1024 * 1024 * 2	// 2MB (전송에 따른 최대 크기값)
)
public class fileok extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public fileok() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
//		String url = "/jangwoon0518/tomcat/webapps/review_nc/upload/lion1.jpg";
//		String url2 = url.replace("/jangwoon0518/tomcat/webapps", ".");
//		System.out.println(url2);
		
		Collection<Part> parts = request.getParts();
		ArrayList<Part> result = new ArrayList<Part>(parts.size());
		System.out.println(parts.size());
		for(Part p : parts) {
			result.add(p);
		}
		int w = 0;
		String filenm = null;
		String path = request.getServletContext().getRealPath("");
		String upfile = path + "upload/";
		filedb fdb = new filedb();
		
		String url = null;
		String url2 = null;
		
		while(w < result.size()) {
			filenm = result.get(w).getSubmittedFileName();
			result.get(w).write(upfile + filenm);
			try {
				url = upfile + filenm;
				url2 = url.replace("/jangwoon0518/tomcat/webapps", ".");
				fdb.file_insert(url2);
			}catch(Exception e) {
			}
			w++;
		}
	}
}
