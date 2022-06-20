package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing3 {
	// 반복문을 이용하여 키 생성 및 배열값을 split으로 분리 작업
	public static void main(String[] args) {
		
		String data [] = {"홍길동", "강감찬", "이순신", "유관순"};
		Map<String, String> m = new HashMap<>();
		//m.put("names", data[0]);
		//System.out.println(m);
		
		int dw = 0;
		do {
//		m.put("name"+dw, data[dw]);	// 중복되지 않는 키값 생성 + 해당 배열에 있는 index 번호 // {names3=유관순, names2=이순신, names1=강감찬, names0=홍길동}
//		m.put(String.valueOf(dw), data[dw]);	// {0=홍길동, 1=강감찬, 2=이순신, 3=유관순}
		dw++;
		}while(dw < data.length);
//		System.out.println(m);
		
		Map<String, String> m2 = new HashMap<>();
		for(String names : data ) {
			m2.put(names, names);	// for each로 키, 값이 동일하게 적용이 된다.
		}
//		System.out.println(m2);
		
		String alldata[] = {"name = 홍길동", "age = 25", "email = test@gmail.com"};
		Map<String, String> m3 = new HashMap<>();
		for (int f = 0; f < alldata.length; f++) {
			String key[] = alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		System.out.println(m3);	// {email = test@gmail.com, age = 25, name = 홍길동}
		System.out.println(m3.get("name")); // ???
	}

}
