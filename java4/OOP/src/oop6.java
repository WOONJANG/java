
public class oop6 {

	public static void main(String[] args) {
		// 배열 형태의 생성자 객체추상 클래스 만들기
		
		box[] b = {new abox(), new abox2(), new abox3()};
/*
		b[0].dataload();
		b[1].dataload();
*/		
/*		
		// for each 단점 : 특정 class를 중지 하지는 못함.
		for(box z : b) {
			z.dataload();
		}
*/
		
		int w = 0;
		
		while(w < (b.length)) {
			if(w != 1) {	// index 1번 class는 사용하지 않음.
				b[w].dataload();
			}
				w++;
		}
	}
}

abstract class box {
	public abstract void dataload();
	
}

class abox extends box{
	@Override
	public void dataload() {
		System.out.println("test1");
	}
}

class abox2 extends box{
	@Override
	public void dataload() {
		System.out.println("tset2");
	}
}

class abox3 extends box{
	@Override
	public void dataload() {
		System.out.println("tset3");
	}
}