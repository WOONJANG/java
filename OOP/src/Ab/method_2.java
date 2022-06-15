package Ab;
// abstract와 interface의 차이점 및 공통점
public class method_2 {
	//method_2inter + method_2inter2 interface와 연결
	public static void main(String[] args) {
		loadinter ld = new loadinter();
		ld.setbox("홍길동");
	}

}
//중요 abstract와 interface 모두 static은 사용 할 수 있음

abstract class test { // abstract는 default를 사용하지 않음 (public로 설정)
	//필등 자료형을 생성할 수 있음
	public String nn;
	
	public abstract void box();
	public void box2(String n) {
		this.nn = n;
		System.out.println(this.nn);
	}
}



class loadinter implements method_2re, method_2inter2 { // 다중 상속
	
	@Override
	public String names() {
		return null;
		
	}
}