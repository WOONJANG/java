package Ab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//method_1a.java
public class method_1 extends ide_meth1 { 
	//package ab2���� import �Ҽ��ֵ����ϸ� �ܺ� class�� �����ϰ� ��� ����������
	
	public void recall() { //Ab ��Ű���� �������� �޼ҵ�
		System.out.println("test");
	}
	protected static void name() { // protected�� static ���� �ؾ��� Ab2 ��Ű���� ������ ��
		System.out.println("ȫ�浿");
	}
	
	public static void main(String[] args) {
		
		// Arrays.sort : �迭 �������� ���� (����, �ѱ�,����)
		// ��, ������ ��� �빮�ڰ� ���� ���� ������������ ���� �˴ϴ�.
		
//		int number_data[] = {5, 7, 1, 4, 9, 2};
//		Arrays.sort(number_data); // ��������
//		System.out.println(Arrays.toString(number_data));
//		
//		String user_data[] = {"ȫ�浿", "�̼���", "�庸��", "������"};
//		Arrays.sort(user_data);
//		System.out.println(Arrays.toString(user_data));
//		
//		String eng_data[] = {"apple", "Canada", "Apple", "banana"};
//		Arrays.sort(eng_data);
//		System.out.println(Arrays.toString(eng_data));
		
		/*
		 * ���� 2���� �����ؼ� �ϳ��� ����, �ϳ��� ����
		 * ���� ���Ե� ������� ���̵� Ȯ�� �� �ش� ����Ʈ�� �����ǵ��� �մϴ�.
		 * ��, ���� ����Ʈ + ������ ����Ʈ�� ���� ����� ����ϼž� �մϴ�.
		 * ����� main class���� �����.
		 * user_membership[][] = {
		 * 		{"kim", "park", "seo", "oh", "lee", "jang","jeong","cho","ha","wang"},
		 * 		{"1500", "800", "2000", "1000", "4200", "2200","3000","500","1000","1800"}
		 * };
		 */
		String unm = "jang";
		int upt = 1000;
	//	String c = "����";

		ide_meth1 ide = new ide_meth1();
		ide.setter(unm, upt);
		ide.getter();
		System.out.println(ide.getter());
	}

}




class ide_meth1 extends mth1{
	
	
	private String name;
	private int f;
	private int sum=0;
	private String ssum;

	String user_membership[][] = {
			{"kim", "park", "seo", "oh", "lee", "jang","jeong","cho","ha","wang"},
			{"1500", "800", "2000", "1000", "4200", "2200","3000","500","1000","1800"}
	};
	
	@Override
	public void setter(String data1, int data2) { // �ݺ���
		
		name = data1;
		point = data2;
		
		for(this.f = 0;this.f < this.user_membership[0].length; this.f++) {
			if(this.user_membership[0][f].equals(this.name)) {// �迭 �̸��� �ݺ��� name�϶�,
				this.sum = data2 + Integer.parseInt(this.user_membership[1][f]); // sum = point + string�� int�� �ٲ� �迭 1���� �ݺ�
			}
		}
//		System.out.println(this.sum);
		this.ssum = Integer.toString(this.sum); // ssum�� �ٽ� string����
	
	};

	@Override
	public void setter(int data3[]) {
		
	};
	
	@Override
	public String getter() {
		String print = this.name + "�� ����Ʈ�� " + this.ssum + " ���� �Ǿ����ϴ�.";
		return print;
	};
	
}
