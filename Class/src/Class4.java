
public class Class4 {

	public static void main(String[] args) {
		Member mb = new Member();	
		//��ü : Member
		//mb : �ν��Ͻ�
		//new Member : �޸𸮿� �ν��Ͻ� ���� �����Ͽ� ����� �� �ֵ��� ��.
		
		mb.user_age = 33;
		System.out.println(mb.user_age);
		int total = 6 * mb.user_age;
		System.out.println(total);
		
		final int agree = mb.user_agree;	//Member �ν��Ͻ��� load. -> agree��� �ʵ� ��������� ���� 
		mb.user_agree =80;	//�޸𸮿� ��ϵ� �ʵ�� �ش� �Ǵ� ���� ������.
		System.out.println(mb.user_agree);
		System.out.println(agree);	//final
		
		/*	�Ϲ� Ŭ���� �޼ҵ� �κ�	
		    �Ϲ� Ŭ���� �޼ҵ� ���� ������ ��ü �� �ν��Ͻ��� ���� �ʿ䰡 ����.
		    Why? static ��ü�� �޸� �ν��Ͻ��� ����Ѵٴ� ��.	*/
		//coupon.events();	//Ŭ������ ���� �޼ҵ带 �ٷ� ȣ�� ����. ��, events��� �޼ҵ忡 ���� �ʵ� �� ���� �ʵ尪�� Class�� �����ϰ� �Ǹ� ��ü +�ν��Ͻ��� �����Ͼָ� load�� �ȴ�.
		Member.member_events();
		mb.member_events();
	}

}

class Member { //Ŭ���� 
	String user_name;	//���� �ʵ���� ����
	int user_age;
	int user_level;
	int user_agree = 6;	//���� �ʵ��(user_name, age, level, agree)�� �ʵ尪(=1)�� ����.
	public static void member_events() {
		coupon.events();
		
	}
	
	
}

class coupon {
	
	public static void events() {
		int cp = 30;
		System.out.println(cp);
	}
}





/* '�ϳ�'�� Project �� ���� �ٸ� package�� �� �� ����� Class���� �ٸ� ������ ��� �Ұ�.  Class/src/Class4 + Loop/src/Class4�� ����
 */