import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) throws IOException {
		/*[���빮��]
		  �ش� ������ �� ������ �� ������Ȳ�� ������ �������Դϴ�.
		  �ش� �������� 100�̸��� ������ ���� �︸ 
		  20220623.txt ���Ϸ� ������ ���� �ǵ��� �Ͻÿ�.
		  
		  
		  ������, �Ǿϴ�, û���, ������������, �ȴ��, ��ź����
		  		  
		 */
		
		try {
			dam d = new dam("dam_info.txt");
			
			
		}catch(Exception z) {
			System.out.println(z);
		}
		
		
		
	}

}
class dam{
	private String path = "C:\\java5\\File_Stream\\src\\";
	private FileReader fr = null;
	private List<String> data = null;
	
	public dam(String file_name) throws IOException {
		this.data = Files.readAllLines(Paths.get(path + file_name));
//		System.out.println(this.data);
		cal();
	}
	
	public void cal() {
		String em[] = new String[50];
		ArrayList<String> ar1 = new ArrayList<String>();
		ArrayList<Double> ar2 = new ArrayList<Double>();
		
		String str = "";
		for(int f= 0; f < this.data.size(); f++) {
			str += data.get(f)+(",");
		}
//		System.out.println(str);
		
		
		
		
	}
	
}


/* 1. ���� �ҷ�����
 * 2. ���ø����� , ������
 * 3. 
*/
