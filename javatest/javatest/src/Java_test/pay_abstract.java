package Java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {

	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 87000000;	// �� �ܰ� �ݾ�
	
//	protected String security = "";
	public abstract void start();
	public void start(String a) { }	// �����ε�
	abstract void db() throws IOException;	// ����ó�� ������� ����. (public ���� ���)
//	abstract void db2() throws IOException;
	public abstract int[] check();	// getter (return 2�� �̻�)
	
}
