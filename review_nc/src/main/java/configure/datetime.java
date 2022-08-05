package configure;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class datetime {
	protected LocalDateTime now = null;
	
	protected String nowtimer() {
		this.now  = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
		String today = this.now.format(dtf);
		return today;
	}
	
	protected String insert(ArrayList<String>data) {	// insert만 사용되는 메소드
		String sql = "insert into pd_review values();";
		
		return null;
	}
}
