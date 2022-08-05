package configure;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
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

public class fileuploadok extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public fileuploadok() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
//		/* [Stream 없이 사용하는 방식] */
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=utf-8");
//		Part filepart = request.getPart("file");	// 사용자 PC에 있는 이미지 경로를 저장
////		System.out.println(filepart);
//		String filename = filepart.getSubmittedFileName();	// 업로드 할 파일명을 가져 온다
////		System.out.println(filename);
//		// getServletContext() : 절대경로 사항을 체크하는 부분 (Servlet에 대한 환경설정 형태를 가져옴)
//		// getRealPath("") : application 실제 경로 출력 (서버 물리 경로)
//		// Servlet = Server + let
//		String paths = request.getServletContext().getRealPath("");   // + "upload/" ; //로 바로 써도 되는데 디렉토리가 변경될수있으므로 분리
////		System.out.println(paths);
//		
//		
//		String savepath = paths + "upload/";	// 저장할 공간
//		for(Part part:request.getParts()) {	// 여러개의 파일을 업로드시 모든 파일을 서버에 저장 되도록 하기 위함
//			// 해당 파일을 저장할 위치에 동일한 이름으로 복사
////			filepart.write("C:\\myhome\\review_nc\\src\\main\\webapp\\upload\\" + filename);
//			part.write(savepath + filename);
//		} 
//				response.getWriter().print("ok");
//	}
//		
		
		
//		/*	Stream이 있는 형태의 파일 업로드	*/
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=utf-8");
//		Part filepart = request.getPart("file");	// 사용자 PC에 있는 이미지 경로를 저장
//		String filename = filepart.getSubmittedFileName();	// 업로드 할 파일명을 가져 온다
//		String paths = request.getServletContext().getRealPath("");   // + "upload/" ; //로 바로 써도 되는데 디렉토리가 변경될수있으므로 분리
//		InputStream is = filepart.getInputStream(); // getInputStream() : servlet에만 존재
//		String savepath = paths + "upload/" + filename;	// 저장할 공간
//		FileOutputStream fo = new FileOutputStream(savepath);
//		
//		byte[] bf = new byte[1024];
//		int size = 0;
//		while((size = is.read(bf)) != -1) {
//			fo.write(bf,0,size);
//		}
//		fo.close();
//		is.close();
//		
//		
//		response.getWriter().print("ok");
//	

//		/*	[multiple 사용시] -JCF (Java Collection Framework	*/
//		
//		// Collection : 배열 형태 (Servlet에서 최상위 배열 선언문)
//		/*배열(Array) 데이터배열(Collection) 맵(Map)*/
//		Collection<Part> filepart = request.getParts();
//		// 일반배열 생성 - 파일몇 및 파일속성을 가져올려고 하는 형태
//		ArrayList<Part> result = new ArrayList<Part>(filepart.size());
//		for(Part part : filepart) {
//			result.add(part);	// 일반 배열값에 저장
//		}
//		String filenm = null;
//		String paths = request.getServletContext().getRealPath("");
//		String savepath = paths + "upload/";
//		int w = 0;
//		while(w < result.size()) {
//			filenm = result.get(w).getSubmittedFileName();
//			result.get(w).write(savepath + filenm);
//			response.getWriter().print(savepath + filenm + "<br>");;
//			w++;
//		}
		
	}		
}	

