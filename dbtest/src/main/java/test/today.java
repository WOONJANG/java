package test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class today extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public today() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		2022-08-01 14:41:32
		LocalDate ld = LocalDate.now();	// 년월일
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
		String today1 = ld.format(df1);
		
		LocalTime lt = LocalTime.now();	// 시분초
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("HH시mm분ss초");
		String today2 = lt.format(df2);
		
		LocalDateTime ldt = LocalDateTime.now();	// 년월일 시분초
		DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH시mm분ss초");
		String today3 = ldt.format(df3);
		
		System.out.println(today1 + " / " + today2 + " / "+ today3);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
