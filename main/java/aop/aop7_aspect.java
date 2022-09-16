package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 어노테이션 AOP 사용시 pom.xml에 aspectj, aspectjweaver, aspectjrt가 설치 되어 있어야 함


// AOP를 실행하는 class이며, 어노테이션으로 자동 구분 되도록 함
@Aspect	// xml에서 선언하지 않은 aspect 태그 대신 사용하는 구문
public class aop7_aspect {
	
	// Around는 무조건 return + throws를 사용해야 함 (안하면 로그만 실행이 됨)
	// Throwable : Exception과 동일한 예외처리이며, 예외처리 최상위 클래스
	@Around("within(aop.aop_class7)")	// 객체 프로그림이 실행 전, 후 모두 적용되게 하는 공통 메소드
	public Object aroundlog(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("AOP AROUND 실행");
		return jp.proceed();	// proceed 클래스는 Thread에서 run 처럼 작동하는 원리
	}

//	@Before("within(aop.aop_class7)")	// 객체 프로그램이 실행하기 전에 작동
//	public void beforelog() {
//		System.out.println("AOP BEFORE 실행");
//	}
	
//	@After("within(aop.aop_class7)")	// 객체 프로그램이 실행된 후에 작동
//	public void afterlog() {
//		System.out.println("AOP AFTER 로그 실행");
//	}
	
}
