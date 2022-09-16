package aop;

import org.aspectj.lang.annotation.Aspect;

// AOP 기본 어노테이션
@Aspect
public class aop_class1 {
	
	public String test() {
		String data = "Cosmosgang";
		return data;
	}
	
	public int testbox () {
		int data = 146;
		return data;
	}
}
