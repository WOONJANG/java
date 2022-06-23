import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) throws IOException {
		/*[응용문제]
		  해당 정보는 각 지점별 댐 수위현황을 적용한 데이터입니다.
		  해당 데이터중 100미만의 수위를 가진 댐만 
		  20220623.txt 파일로 내용이 저장 되도록 하시오.
		  
		  
		  군남댐, 의암댐, 청평댐, 충주조정지댐, 팔당댐, 한탄강댐
		  		  
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


/* 1. 파일 불러오기
 * 2. 스플릿으로 , 나누기
 * 3. 
*/
