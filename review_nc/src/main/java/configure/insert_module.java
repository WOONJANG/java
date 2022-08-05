package configure;

import java.sql.*;

import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.annotation.MultipartConfig;

@MultipartConfig(	// 파일 업로드 기능 처리시 사용되는 어노테이션 속성

		 fileSizeThreshold = 1024 * 1024 * 1,	// 1MB (파일 업로드시 사용되는 메모리 임시크기 용량)
		 maxFileSize = 1024 * 1024 * 2,		// 2MB (업로드 파일 최대 크기값)
		 maxRequestSize = 1024 * 1024 * 2	// 2MB (전송에 따른 최대 크기값)
)
public class insert_module {
	static String callsign = null;


//DB 저장
	public void insert_module(ArrayList<String> datas) {
	
		try {
			LocalDateTime time = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
			String today = time.format(dtf);
		
			dbconnection dc = new dbconnection();
			Connection ct = dc.dbcon();
		
			String sql = "insert into pd_review values('0',?,?,?,?,'" + today + "',?)";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, datas.get(0));
			ps.setString(2, datas.get(1));
			ps.setString(3, datas.get(2));
			ps.setString(4, datas.get(3));
			ps.setString(5, datas.get(4));
			
//			if(datas.get(5).intern()==null) {
//				
//			}
			int n = 0;
			n = ps.executeUpdate();
			if(n > 0) {
				this.callsign = "ok";
			}
			else {
				throw new Exception("ERROR");
			}
		
		}catch(Exception e) {
			this.callsign ="no";
		}
	
	}
	public String review_ok_msg() {
	
		return this.callsign;
	}
}
