package Java_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1_teacher {

	public static void main(String[] args) throws IOException {
		/*
		 * [���빮��] ����ڰ� 6���� ���ڸ� �Է��ϴ� �ζ� ���α׷� ���μ��� ���۽� "���ڸ� �Է����ּ���" �� 6���� ���ڸ� �Է� �ް� �˴ϴ�.
		 * lotto.txt ����� ���� ������ �ε��Ͽ� ����ڰ� �Է��� ���� ����� ���Ͽ� ��� ������� �����ϴ� ���α׷� �ڵ带 �ۼ��Ͻÿ�.
		 * 
		 * [��� ����] �ζ� ��� : �� 3���� ��ȣ�� ���߼̽��ϴ�!
		 */
		
		lottopro lt = new lottopro();
		lt.setter();
		
	}

}

class lottopro {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> ll = null;
	String url = "C:\\javatest\\javatest\\src\\Java_test\\lotto.txt";
	
	public void setter () {
		try {
		this.file_load();
		}catch(Exception ee) {
			
		}
	}
	public String getter() {
		
		return null;
	}
	public void file_load() throws IOException {
		try {
			FileInputStream is = new FileInputStream(this.url);
//			System.out.println(is.available()); // ��üũ��
			byte[] temp = new byte[is.available()];
//			int ea = is.read(temp);
			String test = new String(temp);
			System.out.println(test);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}