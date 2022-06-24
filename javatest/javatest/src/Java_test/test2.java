package Java_test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		cal ca = new cal();
		ca.test2();
		System.out.println("총 이체한 금액은 " + ca.total + "이며, 총 잔고금액은 " + ca.endmoney + "입니다.");
	}
}
class cal implements test2_interface{
	int total = 0;
	int endmoney = (this.money-this.total);
	
	@Override
	public void test2() {
		Scanner sc =  new Scanner(System.in);
		for(int f = 0; f < this.user.length; f++) {
			System.out.println("이체를 시작합니다. "+ user[f] +"님에게 이체하실 금액을 입력해주세요.");
			int input_money = sc.nextInt();
			this.total += input_money;
			this.endmoney = this.money - this.total;
		}
		sc.close();
	}
}