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

/*[응용문제]
  해당 사용자가 영화제목을 검색합니다.
  해당 영화제목에 맞는 데이터값이 있을 경우
  영화 전체에 대한 정보를 출력하게 됩니다.
  힌트 : Scanner 사용
  "검색 할 영화 제목을 입력하세요." 범죄도시2
  [범죄도시2] - 추천5 2022년 4월 개봉
  
  "검색 할 영화 제목을 입력하세요." 뽀로로
  "검색한 영화는 확인되지 않습니다."
 */

public class Example1 {

	public static void main(String[] args) throws IOException {
		
//		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
//		
//		String msg = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("검색 할 영화 제목을 입력하세요.");
//		String input = sc.next().intern();
//
//		for(int f = 0; f < data.size(); f++) {
////			if(data.get(f).indexOf(input) != -1) {
//			if(data.get(f).contains(input)) {
//				msg = data.get(f);
//				break;
//			}
//			else {
//				msg ="검색한 영화는 확인되지 않습니다.";
//			}
//		}
//		System.out.println(msg);
//		sc.close();
//===============================================================		
		
		try {	// 파일 로드 및 메소드 전달
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 개봉 영화 2. 개봉 예정 영화");
			int user_input = sc.nextInt();
			if(user_input == 1) {
				movie m = new movie("movie_db.txt"); // 개봉 영화
//				System.out.println("검색할 영화제목을 입력하세요.");
			}
			else if (user_input == 2) {
				System.out.println("미구현");
				movie m = new movie("yet_movie_db.txt"); // 개봉 예정 영화
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
		String datas= this.bf.readLine();// do while 문은 ""라고 선언하면 처음이 빔
		do {
			this.list.add(datas);
		}while ((datas=this.bf.readLine())!=null);
	}

	public void search() throws IOException {
		this.sc = new Scanner(System.in);
		System.out.println("검색할 영화 제목을 입력해주세요.");
		String user_search = sc.next().intern();
		boolean call = false;
		if(user_search == "종료") {
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
			System.out.println("데이터 없음");
		}
		this.search();
	}
}