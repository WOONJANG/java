package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		
		Integer data1[] = {3, 6, 9, 12, 15};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(data1)); // Arraylist ���� ���� , ������ ����
		
//		System.out.println(ln);
		
		Scanner sc = new Scanner (System.in);
		LinkedList<Integer> list = new LinkedList<>();	// �� �迭
		String user;
		// for(;;) // ����loop
		while(true) {	// ����loop
			System.out.println("���ڸ� �Է��ϼ���.");
			user = sc.next();
			try {	// ����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
				int number = Integer.parseInt(user);
				list.add(number);
				int ea = list.size();
				if(ea >= 5) {	// 5������ �迭�� �ԷµǸ� ����loop�� ��������.
					break;
				}
//				System.out.println(list);
			}catch(Exception e){	// ������ �߻��Ͽ��� ��� �۵��Ǵ� ��Ʈ
				System.out.println("�ش� �Է»����� �����Դϴ�.");
			}
		}
		System.out.println(list);
	}

}

