
public class Class3 {

	public static void main(String[] args) {
		
		apink m = new apink();
		m.f_method("이보미");
		apink.cafe LA = m.new cafe();
		LA.call();
	}

}

abstract class father{	// 추상 class (abstract을 사용하면 추상)
	public String u_name;	// 전역 변수 (abstract이 없으므로 추상이 아님)
	public abstract void f_method(String name);	// 추상 method
}	
class apink extends father{
	
	@Override
	public void f_method(String name) {	// 추상 method를 실제 method로 전환
		this.u_name = name;	// 추상 method에 있는 전역변수로 값을 이관
	}
	
	class cafe {
		String msg = apink.this.u_name;	// 부모 class에 있는 전역변수를 자식 class 전역변수로 이관
		public void call() {
			String msg2 = this.msg + "님 짱 ! !";
			System.out.println(msg2);
		}
	}
}