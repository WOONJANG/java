package Ab2;

public class Example1 {

	public static void main(String[] args) {
		
		home h [] = {new computer(), new monitor()};
		home2 h2 [] = {new phone()}; //extends�� home�� ����ؼ� ����
		h[0].broken(50);
		h[1].broken(0);
		h2[0].broken(0);


		
		
		
	}
}

class computer implements home {
	@Override
	public void poweron () {
		System.out.println("��ǻ�� ���� ���� ��");
	}
	@Override
	public void poweroff () {
		System.out.println("��ǻ�� ���� �ߴ�");
	}
	@Override
	public void broken (int n) {
		if(this.bk <= n) {
			System.out.println("��ǻ�� ����");
		}
		else if (this.bk >= n && n >0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
}
//==========================================================

class monitor implements home {
	@Override
	public void poweron () {
		System.out.println("����� ���� ���� ��");
	}
	@Override
	public void poweroff () {
		System.out.println("����� ���� �ߴ�");
	}
	@Override
	public void broken (int n) {
		if(this.bk <= n) {
			System.out.println("����� ����");
		}
		else if (this.bk >= n && n >0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
}
//==========================================================
// �޴����� �߰� ����� �ʿ��մϴ�.
// �޴��� ����� �ּ� ���� (20) -> ���� �۵��� 40 �̻� 80 �̻� ����
// �������޵����� ȭ���� ���峯 ���, (���� O , �۵�X) 20 ~ 39
// �������޽�Ű���� ������ �ȵɰ��	(���� X) 20 �̸�
class phone implements home2 {
	@Override
	public void poweron () {
		System.out.println("��ȭ�� ���� ���� ��");
	}	
	@Override
	public void poweroff () {
		System.out.println("��ȭ�� ���� �ߴ�");
	}	
	@Override
	public void lcbroken() {
		System.out.println("��ȭ�� ȭ�� ����");
	}	
	@Override
	public void modualerror() {
		System.out.println("��ȭ�� ���͸�����");
	}
	@Override
	public void broken (int n) {
		if(this.bk <= n) { // 80 ~
			System.out.println("��ȭ�� ����");
		}
		else if (n >= this.ok && n < this.bk){ // 40~ 79
			this.poweron();
		}
		else if (n < this.ok && n >= this.bt) { // 20 ~ 39
			this.lcbroken();
		}
		else if (n < this.bt && n > 0 ) { // 1 ~ 19
			this.modualerror();
		}
		else { // 0
			this.poweroff();
		}
	}
}
