package java_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test2 {

	public static void main(String[] args){
/*[���빮��]
 {"���=2", "����=1", "����=1", "��=1", "��ġĵ=6", "���=8"}
 ������ ���� ������ �ֽ��ϴ�.
 �ش� ��ٱ��ϴ� ������ŭ ��ü ���� ����Ͽ� �� ������ �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 �� ���� ����
 ��� 250
 ���� 200
 ���� 700
 �� 2300
 ��ġĵ 1100
 ��� 850 
 
 ��� ���
 "���� �Ͻð��� �ϴ� �� ���� �ݾ��� 17100�� �Դϴ�.
 */
		basket b = new basket();
		b.basket_data();
		System.out.println("���� �Ͻð��� �ϴ� �� ���� �ݾ��� " + b.total + "�� �Դϴ�.");
	}
}

class basket extends test2_data{
	static int total = 0;
	public void basket_data() {
		String goods[] =  {"���=2", "����=1", "����=1", "��=1", "��ġĵ=6", "���=8"};

		for (int f = 0; f < goods.length; f++) {
			goods[f].split("=");
			System.out.println(goods[f]);
		}
	}
}