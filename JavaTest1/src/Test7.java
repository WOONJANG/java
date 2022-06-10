import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번역하고 색상을 한글로 표기 하십시오?\n[적용대상]\n빨강, 주황, 노랑, 초록");
		String color = sc.next();
		String msg = "";
		switch (color) {
		case "빨강" -> {
			msg = "red";
		break;
		}
		case "주황" ->{
			msg = "orange";
		break;
		}
		case "노랑" ->{
			msg = "yellow";
		break;
				}
		case "초록" ->{
			msg = "green";
		break;
		}
		default  -> {
			msg = "해당 단어는 번역이 되지 않습니다.";
		break;
		}
		}
		System.out.println(msg);
		sc.close();
	}
}
