
public class oop6 {

	public static void main(String[] args) {
		// 배열 형태의 생성자 객체추상 클래스 만들기
		
		box[] b = {new abox(), new abox2(), new abox3()};
/*
		b[0].dataload();
		b[1].dataload();
*/		
/*		
		// for each 단점 : 특정 class를 중지 하지는 못함.
		for(box z : b) {
			z.dataload();
		}
*/
		
		int w = 0;
		
		while(w < (b.length)) {
			if(w != 1) {	// index 1번 class는 사용하지 않음.
				b[w].dataload();
			}
				w++;
		}
	}
}

abstract class box {
	public abstract void dataload();
	
}

class abox extends box{
	@Override
	public void dataload() {
		System.out.println("test1");
	}
}

class abox2 extends box{
	@Override
	public void dataload() {
		System.out.println("tset2");
	}
}

class abox3 extends box{
	@Override
	public void dataload() {
		System.out.println("tset3");
	}
}

/*
 * OOP 객체지향 프로그래밍
 * 
 * [캡슐화 + 은닉화]
 * public
 * private
 * protected
 * getter, setter(간접적으로 접근)
 * 
 * [추상화(abstraction)]
 * 코드를 정형화
 * 개별적인 메소드를 막는 역할
 * 확장성(interface)
 * 추상 클래스 + interface
 * 
 * [다형성] overriding overloading
 * overriding - 부모의 메소드, 변수 상속
 * overloading - 자식 클래스에서 메소드를 상속은 받지만, 커스텀
 * 
 * [상속성, 재사용] extends(부모+자식), implement(부모 다수 + 자식)
 * 재사용 - 재귀함수 , interface를 다른 class에서도 재사용 가능
 * 
 * 
 * [Thread]
 * 
 * [Multi Thread] - Thread(2)
 * 
 * package 관련
 * 
 * Timeloop - try, catch
 * 
 * Arrays
 * 
 * 동기화, 비동기화
 */ 