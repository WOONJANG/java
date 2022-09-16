package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop5 {
	ApplicationContext ac = new ClassPathXmlApplicationContext("bean3.xml");

	@RequestMapping("/aop5.do")
	public void aop5_method() {

		/* 계속 새로 만들어짐 */
		aop_class5 ac5 = new aop_class5();
		System.out.println(ac5);

		aop_class5 ac5_1 = new aop_class5();
		System.out.println(ac5_1);
		// -------------------------------------------------------
		
		/* bean id 같으면 같음(같은 class라고해도 id가 다르면 다름) */
		// test1 이라는 객체가 메모리에 등재
		aop_class5 a = ac.getBean("test1", aop_class5.class);
		// test2 이라는 객체가 메모리에 등재
		aop_class5 b = ac.getBean("test2", aop_class5.class);
		// test1 이라는 객체를 메모리에서 로드
		aop_class5 c = ac.getBean("test1", aop_class5.class);

		
		if(a == c) {
			System.out.println("a 와 c에 있는 인스턴스는 같습니다.");
		}
		
		if (a != b) {
			System.out.println("b의 인스턴스는 새로운 주소값 입니다. (a 와 b에 있는 인스턴스는 같지 않습니다.)");
		}
		else {
			System.out.println("a 와 b에 있는 인스턴스는 같습니다.");
		}
	}
}
