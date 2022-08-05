package config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time {
	public String DATETIME = null;
	public String TODAY = null;
	public String today() {
		
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
		this.TODAY = time.format(dtf);
		
		return TODAY;
		
	}
	   public String dayTime() {//날짜
		      LocalDateTime time = LocalDateTime.now();
		      DateTimeFormatter drf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		      this.DATETIME = time.format(drf);
		      
		      return DATETIME;
		   }

}
