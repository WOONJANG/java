import java.util.ArrayList;
import java.util.Arrays;

// awt5_abstract.java
// �ߺ� ���̵� üũ �ý��� ����� 
// ȸ�� ������ { "hong", "lee", "park"}; 
public class awt5 {

	public static void main(String[] args) {
		
		handel hd = new handel();
		hd.disign();
	}
}

class handel extends awt5_abstract {
	private String uid; // awt���� �Ѿ�� �μ����� Ŭ�������� Ȱ��
	private String return_id;	
	// awt�� �ٽ� ���� �����ϴ� ��������, null�� ��� id ��밡��, 
	// id���� ���� : �ش� ���̵�� ����� �� ����
	
	ArrayList<String> db = null;
	@Override
	public void IDcheck(String id) {	// setter
		this.return_id = null;	// awt���� �ߺ� ��ư�� Ŭ���� �ش� ������ ���������� �ʱ�ȭ �ϴ� �ֺ�
		this.uid = id;
		this.dataload();	// ���������� �����Ͱ� �Ѿ���� ��� �ش� �޼ҵ带 �ε��Ͽ� Ȯ��
		int ea = this.db.size();
		int dw = 0;
		do {
			if(this.uid.equals(this.db.get(dw))) {
				this.return_id = this.db.get(dw);
				break;
			}
			dw++;
		}while(dw < ea);
		
	}
	
	@Override
	public String signok() {

		return this.return_id;
	}
	
	@Override
	public void dataload() {
		String ori[] = { "hong", "lee", "park", "jeong", "kim", "seo"};
		this.db = new ArrayList<>(Arrays.asList(ori));
		
	}
}