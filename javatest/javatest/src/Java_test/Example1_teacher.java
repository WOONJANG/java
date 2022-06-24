package Java_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1_teacher {

	public static void main(String[] args) throws IOException {
		/*
		 * [응용문제] 사용자가 6개의 숫자를 입력하는 로또 프로그램 프로세서 시작시 "숫자를 입력해주세요" 총 6번의 숫자를 입력 받게 됩니다.
		 * lotto.txt 결과를 가진 파일을 로드하여 사용자가 입력한 값과 결과를 비교하여 몇개를 맞췄는지 검토하는 프로그램 코드를 작성하시오.
		 * 
		 * [결과 예시] 로또 결과 : 총 3개의 번호를 맞추셨습니다!
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
//			System.out.println(is.available()); // 전체크기
			byte[] temp = new byte[is.available()];
//			int ea = is.read(temp);
			String test = new String(temp);
			System.out.println(test);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}