package aopmaster;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop_controller {
	@Autowired
	private BasicDataSource dataConnect;
	public static long start = 0;
	@RequestMapping("/aop.do")
	public void aop(String idx) {	// String idx : GET POST로 넘어오는 값
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("aopmaster.xml");
		
		// interface를 사용시 해당 interface메소드 이름을 먼저 로드 해야 함
		// web에서는 implemnets를 실행하지 못 함. 객체지향 프로그램 형태이므로 interface를 로드해야함
		// aopmaster.xml에서 id로 연결된 class를 로드하게 됨
		aop_service as = ac.getBean("service_class", aop_service.class);
		
		// aop에서는 DB connect를 객체 프로그램에서 직접적으로 운영하기 힘듦 why? XML로드 하여 출력하기 때문에 다른 XML을 인식하지 못하는 상황이 발생
		try {
			System.out.println(idx);
			Connection con = dataConnect.getConnection();
//			String sql = as.insertdb("./review/aop.jpg");	// 해당 값을 주입 sql문법으로 return받음
//			PreparedStatement ps = con.prepareStatement(sql);	// 실행
//			ps.executeUpdate();	// DB입력
			
			//삭제파트
			String sql2 = as.deletedb(idx);	
			PreparedStatement ps2 = con.prepareStatement(sql2);	// 실행
			ps2.executeUpdate();	// DB입력
			
			as.register();	// aop_servicetmp 안에 메소드를 실행시키면 aop_daotmp가 작동이 된다.
			System.out.println("웹 프로그램 실행");
			as.modify();
			System.out.println("웹 프로그램 실행");
			
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}
}
