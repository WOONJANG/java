package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop4 {
	ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
	aop_person ap = ac.getBean("person", aop_person.class);
	aop_class4 ap4 = this.ac.getBean("aop4", aop_class4.class);

	@RequestMapping("/aop4.do")
	public void aop4_data() {
		System.out.println(this.ap.getName());
		System.out.println(this.ap.getId());
		System.out.println(this.ap.getAge());

		System.out.println(this.ap4.getListdata().get(ap.getLevel()));
	}
}
