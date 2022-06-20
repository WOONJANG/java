package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		// ArrayList, LinkedList (배열값) add, remove, get, size	
		// Map (배열키, 배열값) put, get, size, remove
		// Map은 배열키를 기반으로 하기 때문에 키를 통해서 데이터를 확인.(속도 최상급)
		// 같은 키를 사용시 마지막에 적용된 값으로 갱신.
		// 키 값을 절대 중복 시키지 않음.
		
		Map<String,String> m = new HashMap<>();
		// hong -> Hash function(HashMap) -> 0x21949CB (중복값이 발생하지 않음.)
		m.put("hong", "홍길동");
		m.put("hong", "강감찬");
		m.put("kang", "강감찬");
		System.out.println(m);		// {hong=강감찬, kang=강감찬}
		System.out.println(m.get("hong"));	// 강감찬
		/*
		 * int a = 40;
		 * a = 10; 
		 * 하면 a가 10이 되는것이랑 같음.
		 */
		System.out.println(m.get("kang"));	// 강감찬
		
		m.put("park", "");	// 키값은 있으나 값이 비여있을 경우는 사용됨.
		if (m.get("park").equals("")) { // 만약 park의 데이터가 비어 있을 경우
			m.put("park", "박"); // park에 "박" 이라는 데이터를 넣음.
		}
		System.out.println(m.get("park"));	// 박
		
		m.remove("hong"); // 홍길동 삭제 (키 값 사용)
		m.put("", "박혁거세");	// 비어있는 키를 사용은 할 수 있으나, Map의 원리에는 올바르지 않음.
		System.out.println(m.get(""));	// 박혁거세 
		System.out.println(m);		// {hong=강감찬, =박혁거세, kang=강감찬, park=박}
		
		// Map : 여러개의 자료형을 사용할 수 있음.
		Map<String, Integer> m2 = new HashMap<>();
		// Map<String, Object>
		m2.put("age", 32);
		m2.put("level", 5);
		System.out.println(m2);
		System.out.println(m2.get("age"));	// 32
		System.out.println(m2.get("level"));	// 5
		
		System.out.println(m2.keySet());	// 키만 출력[level, age]
		System.out.println(m2.values());	// 값만 출력 [5, 32]
		System.out.println(m2.containsKey("tel"));	// tel 이라는 키가 있는지 확인 = false (없음)
		System.out.println(m2.containsKey("age"));	// age라는 키 확인 = true (있음)
	}

}
