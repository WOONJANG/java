
public class Time3 {

	public static void main(String[] args) {
		/*
		try {
			System.out.println("���� ����");
			Thread.sleep(5000);
			System.out.println("���� ����");
		}catch(InterruptedException a){
			System.out.println(a);
			
		}
		 */
/*[���빮��]
 * �ܺ� class�� �ֽ��ϴ�
 * ��, main class���� �ش� �ܺ� class�� load�ϸ�
 * �ش� �޼ҵ忡�� �ﰢ������ 8�ʵ��� �ε��� �߻��Ѵ�.
 * �ε� 8�ʵ��� "ó�����Դϴ�. ��ø� ��ٷ� �ּ���" ���
 * 8�� ���Ŀ� return���� "�Ա��� ��� ó���Ǿ����ϴ�" ��� ���ڸ� �޵��� �Ͻʽÿ�.
 */	
		
		exam ex = new exam();
		ex.road();
		System.out.println(ex.end());
	}
}

class exam {
	String msg="";
	String k = ".";
	public void road() {
		try {
			String msg1 = "ó�����Դϴ�. ��ø� ��ٷ��ּ���.";

			System.out.println(msg1 +k);
			Thread.sleep(1000);
			System.out.println(msg1 + k + k);
			Thread.sleep(1000);
			System.out.println(msg1 + k+k+k);
			Thread.sleep(1000);
			System.out.println(msg1 + k+k+k+k);
			Thread.sleep(1000);
			
		}catch(InterruptedException a){
			System.out.println(a);
			
		}
	}
	public String end() {
		String out ="�Ա��� ��� ó���Ǿ����ϴ�";
	return out;
}
}
