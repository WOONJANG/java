package aop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop_test {
	
	@RequestMapping("/aop_test.do")
	public void test_aop() {
		System.out.println("test");
	}
	
	
}
