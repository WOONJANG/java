
public class Example1 {

	public static void main(String[] args) {
	/*	Abstract 응용문제
		1차 배열값이 있습니다
		해당 배열값을 모두 더한 값을 출력합니다
		단, abstract에 기본 void 이름은 sender 가지고 있습니다.
		최종값 출력은 sender에서 출력되도록 합니다.
		배열은 abstract에서 사용합니다.
		main은 호출만
		
		배열 데이터 : {6, 13, 22, 9, 12, 64, 32, 47, 39}
	*/
	
		bbb b1 = new bbb();
		b1.sender();	
		
		
	}

}

abstract class a {
		
		int arr[];
		int sum;
		
		public a() { 
		this.arr = new int[] {6, 13, 22, 9, 12, 64, 32, 47, 39};
		}
		
		abstract void sender();
		
		void call() {
			this.sender();
		}
}		
class bbb extends a{

	public void sender() {
		
		int arr_ea = arr.length; // 9
		
		int f;
		this.sum=0;
		for(f=0; f<arr_ea; f++) {
			sum += arr[f];
		}
		System.out.println(this.sum);
	}
}	
