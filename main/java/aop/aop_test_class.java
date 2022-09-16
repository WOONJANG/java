package aop;

public class aop_test_class {
	private String name;
	private String point;
	
	public String message(String name, String point) {
		
		this.name = name;
		this.point = point;
		
		String msg = this.name + "님 포인트는 " + this.point + " 입니다."; 
		
		return msg;
	}
}
