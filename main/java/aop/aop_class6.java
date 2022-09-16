package aop;

public class aop_class6 {
	aop_log al = new aop_log();
	public void memberin() {
		System.out.println("회원가입 메소드");
	}
	
	public void memberinfo() {
		System.out.println("회원 개인정보 메소드");
	}
	
	public void memberlogin() {
		System.out.println("회원 로그인 메소드");
	}
	
	public void memberupdate() {
		System.out.println("회원 개인정보 수정 메소드");
	}
	
	public void memberdelete() {
		System.out.println("회원 개인정보 삭제 메소드");
	}
}
