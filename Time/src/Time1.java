
public class Time1 {

	public static void main(String[] args) {
		/*try-catch�� : ����ó����� ����*/
		int re = 1;
		do {
			try {	// ���� �߻� �� �ڵ带 ����
				Thread.sleep(1000); // 1000 = 1��, 500 = 0.5��
				// Thread.sleep : �Ͻ����� ����
			}
			catch(/*Interrupted*/Exception d){
			// /*Interrupted*/Exception : �ش� ���� �߻��� �Ǿ��� ��� ó���ϱ� ���� ����
			}
			System.out.println(re);
			re++;
		}while(re <=10);
	}
}
