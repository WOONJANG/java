
public class Method3 {

	public static void main(String[] args) {
		/*[���빮��]
		 * �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �Ѵ�,
		 * ���� ��갪�� �޾Ƽ� ����Ͻÿ�.
		 * 157, 45
		 * 157 * 45
		 * ���� ����� ��� : 7065
		 */
		
		data cal = new data();
		int result = cal.a(157, 45);
		System.out.println(result); //7065
		cal.m2();
		cal.a();
		
		/*[���빮��]=================================================
 			���� ���� �ϳ��� �ش� �޼ҵ�� ���� �ϰ� �˴ϴ�.
 			�ش� �޼ҵ忡���� ������ ���� ó���մϴ�.
 			���� 3�� �����ϸ� 3 * 1 ~ 3 * 9 ������ ��� ������� ���Ͽ� ��� �Ͻÿ�.
 		*/
				
		int result2 = cal.ex(3);
		System.out.println(result2);
		//========================================================
		String ck = cal.exex("hong");
		System.out.println(ck);
		
		
	}

}
class data {
	
	public int a (int a, int b) {
		int c = a*b;
		return c;
	}
	public void a () { //	���� �̸��̶� �μ����� �� �� ���̷� �Ǳ��ϳ� �ǰ������ʴ´�. (�򰥸�)
		System.out.println("�����Դϴ�."); //	�����Դϴ�.
	}
	public void m2() {
		int z = a(100, 200);
		System.out.println(z); // 20000
	}
	
	//���빮��===========================
	
	public int ex (int aa) {
		
		int re;
		int total = 0;
		
		for(re=1; re<=9; re++) {
			total += aa * re;
		}
		return total; // �ݺ��� �ȿ��� return ���� �Ұ�, ���� ���ǹ��̶� ����� return ��� �Ұ�.
	}
	//================================
	public String exex (String mid) {
		String msg = "";
		String msg2 = "ȫ�浿";
		if (mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancle";
		}
		return msg; // �ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return ��Ŵ.
	}


}
