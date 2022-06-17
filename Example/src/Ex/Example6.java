package Ex;

public class Example6 {

	public static void main(String[] args) {
		/*
		 *abstract을 이용하여 구구단 8단 결과를 모두 더한 결과값을 return 받아 메인에서 출력 되도록합니다. 
		 */	
		cal ca = new cal();
		System.out.println(ca.cal8());
			
	}

}

abstract class gugu8{
	abstract public int cal8();
	
}

class cal extends gugu8{
	int total=0;
	
	public int cal8() {
		int re;
		int e = 8;
		int aa;
		for(re=1; re<=9; re++) {
			aa = e*re;
			total += aa;
		}
		return total;
	}
}