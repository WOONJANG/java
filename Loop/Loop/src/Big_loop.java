import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*
		int a;
		int total = 0;
		for(a=1; a<=100; a++) {
			total += a; 
			}
		System.out.println(total);
		 */
		
		/*
		 * 1~100���� ���� �������?
		 */
		
		int f;
		// Biginteger : java���� ��� ������ ���� ���� �� �� �ִ� ������ �ڷ���.
		BigInteger b = new BigInteger("1"); //�հ迡 ��� �� �ڷ��� ���� 1�� ���ʰ����� ���� ��, " " ������ �����ؾ��Ѵ�.
		for (f=1; f<=100; f++) {
			 //multiply : ���ϱ⸦ �����.
			//add : ���ϱ� 
			//subtract : ���� 
			//divide : ������ 
			b = b.multiply(BigInteger.valueOf(f));
		}		
			System.out.println(b);

	
	
	
	
	
	
	
	
		}
		
	}

