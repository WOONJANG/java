package test;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Base64.Decoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class security extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public security() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// base 64 - decoder, encoder 두가지가 존재
		// 기초 암호화 부분이며, 역으로 암호를 해독 가능
		
		// 인코드
		String pw = "a12345";
		String sepw = Base64.getEncoder().encodeToString(pw.getBytes()); 
//		System.out.println(sepw);
		
		String pw2 = sepw; // ("YTEyMzQ1")
		
		// 디코드
		byte[] se2 = Base64.getDecoder().decode(pw2);
		String nsepw = new String(se2);
//		System.out.println(nsepw);
//		Decoder dc = Base64.getDecoder();
//		byte[] dctext = dc.decode(pw2);
//		System.out.println(new String(dctext));

		
		try {
			String p = "a1234";
			// MessageDigest : Hash 알고리즘(암호화)
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(p.getBytes("utf-8"));	// update -> Byte 단위로 변경
			byte[] md = md5.digest();	// 배열 기준으로 대입
			StringBuilder sb = new StringBuilder(); // StringBuilder : 문자 배열
			for(byte ck:md) {
				String recode = String.format("%02x", ck);
				// %02x : 16진수 변환
				sb.append(recode);
			}
//			System.out.println(sb);
		}catch(Exception e) {
		}
		
		
		//=======================================================================
		request.setCharacterEncoding("utf-8");
		String expw = request.getParameter("pw");
		String exsepw = Base64.getEncoder().encodeToString(expw.getBytes());
		
		byte[] exse2 = Base64.getDecoder().decode(exsepw);
		String exnsepw = new String(exse2);
		
		System.out.println("암호화" + exsepw + "//" + "해독" + exnsepw );
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
