import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {
		/*[���빮��]
		 * data a = { "hong45", "lee90", "kang100", "park70", "kim72" };f
		 * �ش� �迭 ������ ���� main2��� �޼ҵ�� ���� �����ϴ�.
		 * �ش� ���� ���� �� ����ó���� ������ �߻� ���Ѿ� �ϸ�,
		 * ���ʰ��� ���� ���� �������� ������ �˴ϴ�.
		 * main2������ �ش� �迭 ���� ���� �� �ش� ������ ��� �ջ� �� ����� ���;��մϴ�
		 * ��, ���� ��ȯ�� ������ �߻��� ��� finally�� üũ �� main2 �޼ҵ�� ȣ���Ͽ� ���������� �����Ͱ� �������� �Ͻʽÿ�.
		 */
		String data[]  = { "hong45", "lee90", "kang100", "park70", "kim72" };
		Exception3 ex3 = new Exception3();
		try {
			ex3.main2(data);
		}catch(Exception ee) {
			System.out.println(ee);
		}finally {
			ArrayList<String> rdata = new ArrayList<String>();
			String modify;
			for (int f = 0; f <=data.length; f++) {
				modify = data[f].replaceAll("[a-zA-z]", "");
				rdata.add(modify);
			}
			String cdata[] = new String[rdata.size()];
			int qq= 0;
			do {
				cdata[qq]= rdata.get(qq);
				qq++;
			}while(qq<rdata.size());
			try {
				ex3.main2(cdata);
			}catch(Exception z) {
				// printStackTrace() : ������
				if(z.getMessage() == null)
				System.exit(0);
			}
		}
	}
	public void main2(String aa[]) throws Exception {
		
		int total = 0;
		for (int f =0; f < aa.length; f++) {
			String q = aa[f].replaceAll("[a-zA-z]", "");
			int w = Integer.parseInt(q);
			total += w;
		}
		System.out.println(total);
		Exception z = new Exception();
		throw z;
	}
}