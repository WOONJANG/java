import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*[���빮��]
  �ش� ����ڰ� ��ȭ������ �˻��մϴ�.
  �ش� ��ȭ���� �´� �����Ͱ��� ���� ���
  ��ȭ ��ü�� ���� ������ ����ϰ� �˴ϴ�.
  ��Ʈ : Scanner ���
  "�˻� �� ��ȭ ������ �Է��ϼ���." ���˵���2
  [���˵���2] - ��õ5 2022�� 4�� ����
  
  "�˻� �� ��ȭ ������ �Է��ϼ���." �Ƿη�
  "�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�."
 */

public class Example1 {

	public static void main(String[] args) throws IOException {
		
//		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
//		
//		String msg = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�˻� �� ��ȭ ������ �Է��ϼ���.");
//		String input = sc.next().intern();
//
//		for(int f = 0; f < data.size(); f++) {
////			if(data.get(f).indexOf(input) != -1) {
//			if(data.get(f).contains(input)) {
//				msg = data.get(f);
//				break;
//			}
//			else {
//				msg ="�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.";
//			}
//		}
//		System.out.println(msg);
//		sc.close();
//===============================================================		
		
		try {	// ���� �ε� �� �޼ҵ� ����
			Scanner sc = new Scanner(System.in);
			System.out.println("1. ���� ��ȭ 2. ���� ���� ��ȭ");
			int user_input = sc.nextInt();
			if(user_input == 1) {
				movie m = new movie("movie_db.txt"); // ���� ��ȭ
//				System.out.println("�˻��� ��ȭ������ �Է��ϼ���.");
			}
			else if (user_input == 2) {
				System.out.println("�̱���");
				movie m = new movie("yet_movie_db.txt"); // ���� ���� ��ȭ
			}
			else {
				System.out.println("1 or 2");
			}
			sc.close();
		}catch(Exception z) {
			if(z.getMessage() != null) {
				System.out.println("DB ACCESS ERROR");
			}
		}
	}
}

class movie {
	
	private String path = "C:\\java5\\File_Stream\\src\\";
	private FileReader fr = null;
	private BufferedReader bf = null;
	private ArrayList<String> list = null;
	private Scanner sc = null;
	
	public movie(String file_name) throws IOException {
		try {
			this.fr = new FileReader(this.path + file_name,Charset.forName("UTF8"));
			this.custom();
			this.fr.close();
			this.bf.close();
			this.search();
		}catch(Exception zz) {
			System.out.println(zz);
		}
	}
	
	public void custom () throws IOException {
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
		String datas= this.bf.readLine();// do while ���� ""��� �����ϸ� ó���� ��
		do {
			this.list.add(datas);
		}while ((datas=this.bf.readLine())!=null);
	}

	public void search() throws IOException {
		this.sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ������ �Է����ּ���.");
		String user_search = sc.next().intern();
		boolean call = false;
		if(user_search == "����") {
			sc.close();
			System.exit(0);
		}
		for(String moviesb : this.list) {
//			if(moviesb.indexOf(user_search) != -1) {
			if(moviesb.contains(user_search)) {
				System.out.println(moviesb);
				call = true;
			}
		}
		if(call == false) {
			System.out.println("������ ����");
		}
		this.search();
	}
}