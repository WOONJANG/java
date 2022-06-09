
public class Example2 {

	private int user_input;
	private int pc_num;

	
	public void setter(int user_input, int pc_num) {
		this.user_input = user_input;
		this.pc_num = pc_num;
		int re;

		for(re = 5; re > 0; re--) {
		System.out.printf("총기회가 %s 번 남았습니다. 1 ~ 10까지 번호 중 한의 번호를 입력해주세요.\n", re);

			if( pc_num == user_input) {
				System.out.println("정답");
				break;
			}
			else if( pc_num < user_input) {
				System.out.printf("DOWN \n", re-1);
			}
			else if( pc_num  > user_input) {
				System.out.printf("UP \n", re-1);
			}
			if (re == 1) {
				System.out.println("\n실패 정답은 " + this.pc_num);
				break;
			}
		}
	}
	public void getter () {
		
	}
}

