
public class Example1 {

	public static void main(String[] args) {
	/*	Abstract ���빮��
		1�� �迭���� �ֽ��ϴ�
		�ش� �迭���� ��� ���� ���� ����մϴ�
		��, abstract�� �⺻ void �̸��� sender ������ �ֽ��ϴ�.
		������ ����� sender���� ��µǵ��� �մϴ�.
		�迭�� abstract���� ����մϴ�.
		main�� ȣ�⸸
		
		�迭 ������ : {6, 13, 22, 9, 12, 64, 32, 47, 39}
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
