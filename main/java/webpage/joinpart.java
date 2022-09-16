package webpage;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class joinpart {

	Connection con = null;
	PreparedStatement ps = null;
	String sql1 = "insert into ";
	String sql2 = " values ('0',?,?,?)";
	
	@Autowired
	BasicDataSource dataConnect;
	
	
	// 자회사몰 회원가입 페이지(FRONT)
	@RequestMapping("/join.do")
	public String join() {
		
		return "join";
	}
	// 자회사몰 회원등록 페이지(BACK)
	@RequestMapping("/joinok.do")
	public String joinok(Model m ,String userid, String username, String useremail) {
		try {
			con = dataConnect.getConnection();
			String sql = sql1 + "mall" + sql2;
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, username);
			ps.setString(3, useremail);
			
			int n = 0;
			n = ps.executeUpdate();
			if(n > 0) {
				m.addAttribute("result","회원 등록 완료");
			}
		}catch(Exception e) {
			m.addAttribute("result", e);
		}
		
		
		return "joinok";
	}
	
	
	// 카카오 회원가입 및 로그인 체크
	@RequestMapping("/kakaojoin.do")
	public String kakao(Model m, String userid, String username, String useremail) {
		try {
			con = dataConnect.getConnection();
			String sql = sql1 + "kakao_mall" + sql2;
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, username);
			ps.setString(3, useremail);
			System.out.println(ps);
			
			int n = 0;
			n = ps.executeUpdate();
			if(n > 0) {
				m.addAttribute("result","회원 등록 완료");
			}
		}catch(Exception e) {
			m.addAttribute("result", e);
		}
		return "kakao";
	}
	
}
