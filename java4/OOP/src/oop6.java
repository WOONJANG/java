
public class oop6 {

	public static void main(String[] args) {
		// �迭 ������ ������ ��ü�߻� Ŭ���� �����
		
		box[] b = {new abox(), new abox2(), new abox3()};
/*
		b[0].dataload();
		b[1].dataload();
*/		
/*		
		// for each ���� : Ư�� class�� ���� ������ ����.
		for(box z : b) {
			z.dataload();
		}
*/
		
		int w = 0;
		
		while(w < (b.length)) {
			if(w != 1) {	// index 1�� class�� ������� ����.
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