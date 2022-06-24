package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class pay_program {

	public static void main(String[] args) {

		payroll py = new payroll();
		py.start();
		int[] result = py.check();
		System.out.println("총 이체금액은 " + result[0] + "이며, 총 잔고 금액은 " + result[1] + "입니다.");
	}
}

class payroll extends pay_abstract {

	String file_name = null;
	int total = 0;
	int all_money = this.money; // 통장에 있는 잔고금액

	// 입금 파트
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int c = 0; // 반복문
		int m_in = 0; // 재무과 담당자가 입력하는 급여
		while (c < this.em_name.size()) {
			System.out.println("이체를 시작합니다. [" + this.em_name.get(c) + "님]에게 이체하실 금액을 입력해주세요.");
			m_in = sc.nextInt();
			this.total += m_in; // 이체된 전체 금액
			this.all_money -= m_in;
			c++;
		}
		sc.close();
	}

	@Override
	public void start() {

		try {
			this.file_name = "C:\\javatest\\javatest\\src\\Java_test\\employee.txt";
			this.db();
			this.input_sc();
		} catch (Exception z) {
			System.out.println(z);
		}

	}

	@Override
	void db() throws IOException {
		this.em_name = new ArrayList<>();
		this.fr = new FileReader(this.file_name, Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
//		System.out.println(br.readLine());	// buffer는 한번쓰는순간 카운팅 조심
		String data = br.readLine();
		String user[] = data.split(",");
		int ea = user.length;

		int dw = 0;
		do {
			this.em_name.add(user[dw]);
			dw++;
		} while (dw < ea);
		br.close();
		fr.close();
//		System.out.println(this.fr.getEncoding());	// 인코더 형식
	}

	@Override
	public int[] check() {

		int aa = 10;
		int bb = 20;

		return new int[] { this.total, this.all_money };
	}
}