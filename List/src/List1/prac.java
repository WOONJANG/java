package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class prac {

	public static void main(String[] args) {
		
		String data[][]= {
				{"user1", "user2", "user3", "user4", "user5", "user6", "user7"},
				{"240", "350", "400", "450", "1", "50", "720"}
		};


		ArrayList<String> user = new ArrayList<String>(Arrays.asList(data[0]));
		ArrayList<String> day = new ArrayList<String>(Arrays.asList(data[1]));
		
//		System.out.println(day);
		
		for (int f=0; f < user.size();f++) {
			for (int ff=0; ff<day.size();ff++) {
				int day_num = Integer.parseInt(day);

			}
		}
		
			
		
	}

}
