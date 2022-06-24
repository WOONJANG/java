package Java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {

	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 87000000;	// 총 잔고 금액
	
//	protected String security = "";
	public abstract void start();
	public void start(String a) { }	// 오버로딩
	abstract void db() throws IOException;	// 예외처리 사용하지 않음. (public 빼고 사용)
//	abstract void db2() throws IOException;
	public abstract int[] check();	// getter (return 2개 이상)
	
}
