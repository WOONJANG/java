package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing4 {

	public static void main(String[] args) {
		
		String [][] data = {
				{"d1", "123456"},
				{"d1", "456789"},
				{"d2", "ȫ�浿"},
				{"d2", "�̼���"},
				{"d3", "hong@naver.com"}
		};
//		Map<String, String> m = new HashMap<>(); // ����, ����
		HashMap m = new HashMap<>(); // ������ �ڷ����� �������
		System.out.println(data[0][0]);	// Ű
		System.out.println(data[0][1]);		// data
		
		for(int a=0; a<data.length; a++) {
			if(!m.containsKey(data[a][0])) {
				m.put(data[a][0], data[a][1]);
			}
			else {
				m.put(data[a][0]+a, data[a][1]);
			}
		}
	
		System.out.println(m);
		
		
		
	}

}