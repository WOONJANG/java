package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing3 {
	// �ݺ����� �̿��Ͽ� Ű ���� �� �迭���� split���� �и� �۾�
	public static void main(String[] args) {
		
		String data [] = {"ȫ�浿", "������", "�̼���", "������"};
		Map<String, String> m = new HashMap<>();
		//m.put("names", data[0]);
		//System.out.println(m);
		
		int dw = 0;
		do {
//		m.put("name"+dw, data[dw]);	// �ߺ����� �ʴ� Ű�� ���� + �ش� �迭�� �ִ� index ��ȣ // {names3=������, names2=�̼���, names1=������, names0=ȫ�浿}
//		m.put(String.valueOf(dw), data[dw]);	// {0=ȫ�浿, 1=������, 2=�̼���, 3=������}
		dw++;
		}while(dw < data.length);
//		System.out.println(m);
		
		Map<String, String> m2 = new HashMap<>();
		for(String names : data ) {
			m2.put(names, names);	// for each�� Ű, ���� �����ϰ� ������ �ȴ�.
		}
//		System.out.println(m2);
		
		String alldata[] = {"name = ȫ�浿", "age = 25", "email = test@gmail.com"};
		Map<String, String> m3 = new HashMap<>();
		for (int f = 0; f < alldata.length; f++) {
			String key[] = alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		System.out.println(m3);	// {email = test@gmail.com, age = 25, name = ȫ�浿}
		System.out.println(m3.get("name")); // ???
	}

}
