import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Scanner�� �̿��� ���� ���� ���� (input)
public class File6 {

	public static void main(String[] args) throws IOException {

		try {
		FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\db.txt", true); // true ���������� �̾ ��
		Scanner sc = new Scanner(System.in);	
		System.out.println("������ �Է��ϼ���.");
		for(int a = 0; a < 3; a++) {	// 3�� �ݺ�
		String notice = sc.nextLine() + "\n";
		fw.write(notice);	// �ش� �Է»����� db.txt�� ����
		}
		sc.close();
		fw.close();
		}catch(Exception z) {
			System.out.println(z);
		}
	}
}
