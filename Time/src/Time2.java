import java.util.Timer;
import java.util.TimerTask;

public class Time2 {

	
	public static void main(String[] args) {
		Timer timer = new Timer();
		Time2 t = new Time2(); // Timer util�� �̿��Ͽ�  �ð� �޼ҵ带 ����մϴ�.
//		timer.scheduleAtFixedRate(new gogo(), 0, 5000);
		// (������ �޼ҵ� & Ŭ����, �����ð�, �ݺ��ð�)
		// scheduleAtFixedRate : ���������� �ݺ� �۾��� �� ��� 
		TimerTask tk = new TimerTask() {
			int a = 0;
			String adata[] = {"ȫ�浿", "�̼���", "������", "������"};
			@Override
			public void run() {
				if(a >= 4) {
				System.exit(0);
				//	a = 0;
				}
				System.out.println(adata[a]);
				a++;
			}
		
		};
		timer.scheduleAtFixedRate(tk, 2000, 2000);
	}
}
//class gogo extends TimerTask{	// TimerTask : �ð�timer �۾�task 
//	public void run() { // task���� �����ϴ� �޼ҵ�
//	System.out.println("�ð� �Լ� �� �۵��� �ɱ��?");
//	}
//}