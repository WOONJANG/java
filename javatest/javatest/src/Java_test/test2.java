package Java_test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		cal ca = new cal();
		ca.test2();
		System.out.println("�� ��ü�� �ݾ��� " + ca.total + "�̸�, �� �ܰ�ݾ��� " + ca.endmoney + "�Դϴ�.");
	}
}
class cal implements test2_interface{
	int total = 0;
	int endmoney = (this.money-this.total);
	
	@Override
	public void test2() {
		Scanner sc =  new Scanner(System.in);
		for(int f = 0; f < this.user.length; f++) {
			System.out.println("��ü�� �����մϴ�. "+ user[f] +"�Կ��� ��ü�Ͻ� �ݾ��� �Է����ּ���.");
			int input_money = sc.nextInt();
			this.total += input_money;
			this.endmoney = this.money - this.total;
		}
		sc.close();
	}
}