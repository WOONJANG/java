package aop;

// 각종 query
public class aop_query {

	
	// setter, getter
	aop_info info = new aop_info();
	
	// 회원 가입
	public void insert() throws Exception {
		info.aop_info2("insert");
		
	}
	
	// 회원 삭제
	public void delete() {
		// 해당값을 주입받음
		this.info.aop_info2("delete");
		System.out.println("사용자삭제");
	}
}
