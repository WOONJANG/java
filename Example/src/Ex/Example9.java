package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example9 {

	public static void main(String[] args) {
/*[���빮��]
 ���� ���ó�� ������ �迭�� ������ ������ ���������� �迭�� ������ �ֽñ� �ٶ��ϴ�.
 ["ȫ�浿=55", "������=60", "������=80", "������95"] 
  */
	box2 bx = new box2();
	
	bx.setter();
	System.out.println(bx.getter());
	}

}

class box2 implements interface9, interface9_1{
	ArrayList<String> nm = new ArrayList<String>();
	@Override
	public void setter() {
//		System.out.println(Arrays.toString(this.user));
//		System.out.println(Arrays.toString(this.stratnumber));
		
		for(int f=0; f < this.user.length; f++) {
//			System.out.println(this.stratnumber[f]);

			
			this.nm.add(this.user[f]+"="+this.stratnumber[f]);
			
			
		}
//		System.out.println(nm);
	
	}
	
	@Override
	public ArrayList<String> getter() {
			
		
		return this.nm;
	}

	@Override
	public void db() {
		
	}
}
