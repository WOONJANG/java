package Java_test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * [���빮��] ����ڰ� 6���� ���ڸ� �Է��ϴ� �ζ� ���α׷� ���μ��� ���۽� "���ڸ� �Է����ּ���" �� 6���� ���ڸ� �Է� �ް� �˴ϴ�.
		 * lotto.txt ����� ���� ������ �ε��Ͽ� ����ڰ� �Է��� ���� ����� ���Ͽ� ��� ������� �����ϴ� ���α׷� �ڵ带 �ۼ��Ͻÿ�.
		 * 
		 * [��� ����] �ζ� ��� : �� 3���� ��ȣ�� ���߼̽��ϴ�!
		 */
		calu ca = new calu();
		ca.setter();
		System.out.println("���᰹�� : " + ca.getter() + "��");
	}
}

abstract class lotto {
	String path = "C:\\javatest\\javatest\\src\\Java_test\\lotto.txt";
	FileReader fr = null;

	abstract public void setter();
	abstract public int getter();
	abstract public void db();

	ArrayList<Integer> em = new ArrayList<Integer>();
	List<String> data = null;
	int ct = 0;
	Scanner sc = new Scanner(System.in);
}

class calu extends lotto {
	@Override
	public void setter() {

		for (int f = 1; f <= 6; f++) {
			System.out.println("���ڸ� �Է����ּ���");
			int user_input = sc.nextInt();
			em.add(user_input);
		}
		System.out.println("�����  : " + em); // ���� �Է� ���� �迭
		db();

		for (int f = 0; f < em.size(); f++) {
			int aa = Integer.parseInt(this.data.get(f));
			for (int ff = 0; ff < em.size(); ff++) {
				if (this.em.get(ff) == aa) {
					ct++;
				}
			}
		}
	}

	@Override
	public int getter() {
		return this.ct;
	}

	@Override
	public void db() {
		try {
			this.data = Files.readAllLines(Paths.get(path));
			System.out.println("��÷��ȣ : " + data);
		} catch (Exception zz) {
			System.out.println(zz);
		}
	}
}