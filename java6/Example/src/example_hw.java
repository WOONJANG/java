import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class example_hw {

	public static void main(String[] args) {
/* [���빮��]
 	Arraylist�� ������ �̿��Ͽ� ������� ��µǵ��� �մϴ�.
 	���õ����� = > { "red", "green", "blue", "pink", "orange", "black", "white", "hotpink", "gray" };
 	
 	�ش� ������ ���� 6�� �̸��� ������ ��� ���� �� ��� �迭 ������ �����Ͻÿ�.
 
 	������ ����ũ
 
 */
		String color_arr[] = { "red", "green", "blue", "pink", "orange", "black", "white", "hotpink", "gray" };
		ArrayList<String> six = new ArrayList<>(Arrays.asList(color_arr));
		ArrayList<String> em = new ArrayList<>();
		ArrayList<String> em2 = new ArrayList<String>(Arrays.asList(color_arr));

//==============================================
		
		for(int f = 0; f < six.size(); f++) {
			if(six.get(f).length() < 6) {
				six.remove(f);
				six.add(f,"0");
			}
		}
		for(int ff =0; ff <six.size(); ff++) {
			if(!six.get(ff).equals("0")) {
				em.add(six.get(ff));
			}
		}
		System.out.println(em);

//==============================================
		
		for (int f=0; f < six.size(); f++) {
			if (six.get(f).length() < 6) {
				em.remove(six.get(f));
		    }
		}
		System.out.println(em);
	}
}