import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class example_hw {

	public static void main(String[] args) {
/* [응용문제]
 	Arraylist를 무조건 이용하여 결과값을 출력되도록 합니다.
 	원시데이터 = > { "red", "green", "blue", "pink", "orange", "black", "white", "hotpink", "gray" };
 	
 	해당 데이터 값중 6자 미만의 색상은 모두 삭제 후 결과 배열 값으로 생성하시오.
 
 	오렌지 핫핑크
 
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