package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example9 {

	public static void main(String[] args) {
/*[응용문제]
 다음 결과처럼 각각의 배열로 나누어 진것을 다음과같이 배열로 정렬해 주시길 바랍니다.
 ["홍길동=55", "김유신=60", "강감찬=80", "유관순95"] 
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
