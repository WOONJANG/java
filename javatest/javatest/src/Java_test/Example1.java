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
		 * [응용문제] 사용자가 6개의 숫자를 입력하는 로또 프로그램 프로세서 시작시 "숫자를 입력해주세요" 총 6번의 숫자를 입력 받게 됩니다.
		 * lotto.txt 결과를 가진 파일을 로드하여 사용자가 입력한 값과 결과를 비교하여 몇개를 맞췄는지 검토하는 프로그램 코드를 작성하시오.
		 * 
		 * [결과 예시] 로또 결과 : 총 3개의 번호를 맞추셨습니다!
		 */
		calu ca = new calu();
		ca.setter();
		System.out.println("맞춘갯수 : " + ca.getter() + "개");
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
			System.out.println("숫자를 입력해주세요");
			int user_input = sc.nextInt();
			em.add(user_input);
		}
		System.out.println("사용자  : " + em); // 유저 입력 숫자 배열
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
			System.out.println("당첨번호 : " + data);
		} catch (Exception zz) {
			System.out.println(zz);
		}
	}
}