package App;

public class App1 {

	public static void main(String[] args) {
		//Method11���� �ε��� ��� �ش� �ܺ� blue class �� �ε��Ͽ� ��½��� Method11�� �ε� �� �� �ֵ��� ��.
		
		blue b = new blue();
		System.out.println(b.box());
	}	
	public void abox() {
		System.out.println("Test import");
		}


	}


//blue�� ������ �ܺ� class�̸� Method11���� �������� �ڵ鸵 �Ұ���.
class blue{
	private String msg;
	
	public String box() {
		this.msg = "ȯ���մϴ�.";
		return this.msg;
	}
}