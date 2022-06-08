import App.App1; // 다른 package를 로드시 import를 사용.
//외부 package에서 App1.java 파일 로드 및 기본 파일을 로드하여 사용합니다.
public class Method11 {

	public static void main(String[] args) {
		
		App1 b = new App1(); //main method를 load 하게 된다.
		b.abox();; // main method 안에서 abox라는 void method를 load 하는 부분.

	}

}


	