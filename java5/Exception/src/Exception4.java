import java.io.IOException;

public class Exception4 {

	public static void main(String[] args)  {
		
		try {
		ex e = new ex();
		e.loader("ok");
		//�ڱ��ڽ��� �ٷ� ���ܻ�Ȳ���� ����.
		Exception aaa = new Exception();
		throw aaa; //  �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ��� ȣ���� 
		}catch(Exception ee) {
			if (ee.getMessage() != null) {
				System.out.println(ee);
				
			}
		}
//		catch(IOException i) {
//		System.out.println(i);
//	}
		
	}

}

class ex {
	Exception ep = null;
//	IOException io = null;
	public void loader (String a) throws Exception { // throws try~catch�� �ޱ����� Ŭ������ �ε�
		/* �߸��� �������� (�ڽ��� ������ ���� main class�� ��� �����ϴ� ���*/
//		if(a == "ok") {
//			int keycode = Integer.valueOf(a); // ������������, loader class ��ü���� ������ �߻�
//			
//		}
//		else {
//			// �ش� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ��� 
//			try {
//			}catch(NumberFormatException n) {
//				
//				this.ep = new Exception();
//				throw this.ep;
////			this.io = new IOException();
//			}
//			
//		}
		try {
			if (a == "ok") {
				int keycode = Integer.valueOf(a);

			} else {
				System.out.println("test");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			this.ep = new Exception(); // �ڽ��� ���� ������ ���� �޾Ƽ� Ȯ��
			throw this.ep;
		}

	}
}