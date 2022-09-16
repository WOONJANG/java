package aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Component
public class aop1 {
	@RequestMapping("/aop1.do")
	public String aop(Model m){
		// ApplicationContext : 스프링 컨테이너  
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//getBean : bean태그를 조회할 때 사용
		aop_class1 z = (aop_class1)ac.getBean("aa");
		
		//getBean(bean id명, 클래스명)
		String zresult = z.test() + z.testbox();
//		String zresult = z.test();
		m.addAttribute("result",zresult);
		return "aop1"; 	// views에 있는 jsp
	}
}
