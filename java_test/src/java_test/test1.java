package java_test;

import java.util.ArrayList;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		// 고점자만출력. abstract사용 1등 : Daniel(98)
		cal ca = new cal();
		ca.setter();
		System.out.println(ca.getter());
	}

}

abstract class data {
	String list[][] = null;
	ArrayList<Integer> ar1 = new ArrayList<>();
	String result = "";

	abstract public void setter();

	abstract String getter();

	abstract public void db();
}

class cal extends data {
	@Override
	public void setter() {
		db();
		int max = 0;
		for (int f = 0; f < ar1.size(); f++) {
			if (max < ar1.get(f)) {
				max = ar1.get(f);
			}

		}
//			System.out.println(max);

		String msg = "";
//			String two = ""; // 동점자 대비
		for (int f = 0; f < ar1.size(); f++) {
			if (max == ar1.get(f)) {
				msg = this.list[0][f];
			}
		}
		System.out.println("1등 : " + msg /* + two */ + "(" + max + ")");
	}

	@Override
	String getter() {

		return this.result;
	}

	@Override
	public void db() {
		this.list = new String[][] {
				{ "Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton" },
				{ "65", "74", "23", "75", "68", "96", "88", "98", "54" } };

		int ea = this.list.length;
		int ea2 = this.list[1].length;

		for (int f = 0; f < ea2; f++) {
			int aa = Integer.valueOf(this.list[1][f]);
			this.ar1.add(aa);
		}
//				System.out.println(ar1);
	}
}
