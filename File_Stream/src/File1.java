import java.io.FileReader;
import java.io.IOException;

public class File1 {
/*
 * I/O : inputStream, outputStream
 * �Է� ��Ʈ�� : ���α׷����� ������ ��Ʈ�� (inputStream : Ű����, ���콺, HDD)
 * ��� ��Ʈ�� : ���α׷����� ������ ������ ��Ʈ�� (outputStream : �����, HDD, ������)
 * Stream : input, output ����� ó�� 
 * JAVA.io (API)
 * File, FileReader (�Ϲ�) -> StreamAPI (FileinputStream)
 * FileWriter -> StreamAPI (FileOutputStream)
 * 
 */
	public static void main(String[] args) throws IOException, Exception {
		/* 
		 * FileReader :
		 * 1. ���� �����͸� ���Ϸκ��� �д� Ŭ����
		 * 2. ���� �̸��� ������ �μ���(�Ķ����, ex) String a)���� ����ؼ� FileReader��ü�� ����
		 * public void abc(String a){} 
		 */
		try {
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt");
		String a = "a1";
		test(a);
		}catch(IOException z) {	// IOException�� ���� ���� ó��
			System.out.println(z.getMessage());
		}
		catch(Exception z1) {	//�Ϲ� Exception�� ���� ���� ó�� 
			System.out.println(z1.getMessage());
		}
		
		
		

	}
	static public void test(String data) throws IOException, Exception {
		int k = Integer.parseInt(data);
		IOException ex = new IOException();
		throw ex;
		
	}

}