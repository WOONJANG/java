public class Method13 {

	public static void main(String[] args) {
		//extends : inherit ( 상속 ) 
		/*
		 절대 부모 class에 construct 부분에 인수값을 적용하면
		 자식 class에서 로드를 못하는 상황이 발생함.
		 단, 자식 class에서 인수값을 적용하여 construct를 사용할 수는 있음.
		 
		 */
		mth1 m1 = new mth1();
		mth2 m2 = new mth2(50);

	}

}

class mth1 {
	public int no;
	public mth1() {
		this.no = 20;
		System.out.println("mth1");
	}
}
class mth2 extends mth1{
	public mth2(int z) {
	//	this.no =
		System.out.println("mth2");
		System.out.println(this.no);
	}
}