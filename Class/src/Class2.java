
public class Class2 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 더블 class를 이용하여 자식 class에 결과값을 출력하는 프로세서 제작
		 * class는 2개
		 * 부모 class = mother
		 * 자식 class = child
		 * main 클래스에서 mother 클래스로 값을 전달
		 * 30 50 숫자값을 적용합니다
		 * child에서 부모 클래스에 있는 값을 받아
		 * 두개의 숫자를 곱한 결과 값을 출력하시오.
		 *  
		*/
		
		mother mom = new mother();
		mom.m(30, 50);
		mother.child mc = mom.new child();
		mc.ch();

	}

}

class mother{
	int aa, bb;
	public void m (int a, int b) {
		this.aa = a;
		this.bb = b;
		
	}

	class child{
		int aa = mother.this.aa;
		int bb = mother.this.bb;
		public void ch() {
			int cc = this.aa*this.bb;
			System.out.println(cc);
		}
	}
}