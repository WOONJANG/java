
public class Example2 {

	private int user_input;
	private int pc_num;

	
	public void setter(int user_input, int pc_num) {
		this.user_input = user_input;
		this.pc_num = pc_num;
		int re;

		for(re = 5; re > 0; re--) {
		System.out.printf("�ѱ�ȸ�� %s �� ���ҽ��ϴ�. 1 ~ 10���� ��ȣ �� ���� ��ȣ�� �Է����ּ���.\n", re);

			if( pc_num == user_input) {
				System.out.println("����");
				break;
			}
			else if( pc_num < user_input) {
				System.out.printf("DOWN \n", re-1);
			}
			else if( pc_num  > user_input) {
				System.out.printf("UP \n", re-1);
			}
			if (re == 1) {
				System.out.println("\n���� ������ " + this.pc_num);
				break;
			}
		}
	}
	public void getter () {
		
	}
}

