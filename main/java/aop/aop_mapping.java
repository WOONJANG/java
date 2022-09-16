package aop;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

// web 실행부분
@Controller
public class aop_mapping {
	ApplicationContext ac = new ClassPathXmlApplicationContext("aop_log.xml");
	@Autowired
	BasicDataSource dataConnect;
	Connection con = null;
	PreparedStatement ps = null;
	
	@RequestMapping("/memberin.do")
	public void memberin() {
		try {
			this.con = dataConnect.getConnection();
			String mid = "jung";
			String pass = "a123456";
			// MD5로 해당 값을 암호화
			String pass2 =  DigestUtils.md5DigestAsHex(pass.getBytes());
			String mnm = "정경호";
			String mtel = "01023456789";
			String mage = "37";
			String sqls = "insert into test3 values ('0',?,?,?,?,?)";
			this.ps = con.prepareStatement(sqls);
			
			ps.setString(1, mid);
			ps.setString(2, pass2);
			ps.setString(3, mnm);
			ps.setString(4, mtel);
			ps.setString(5, mage);
			
			System.out.println(this.ps);
			int n = 0;
			n = ps.executeUpdate();
			
			if(n > 0) {
				System.out.println("입력 완료");
			}
			else {
				System.out.println("입력 실패");
			}
			aop_query aq = ac.getBean("querys", aop_query.class);
			aq.insert();
		}catch(Exception e) {
			
		}
	}

	@RequestMapping("/memberdel.do")
	public void memberdel() {
		try {
			// query 클래스에 delete 메소드 호출
			aop_query aq = ac.getBean("querys", aop_query.class);
			aq.delete();
		}catch(Exception e) {
			
		}
	}

}
