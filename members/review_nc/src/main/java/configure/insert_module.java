package configure;

import java.sql.*;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class insert_module {
	static String callsign = null;


//DB 저장
	public void insert_module(ArrayList<String> datas) {
	
		try {
			LocalDateTime time = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
			String today = time.format(dtf);
		
			dbconnection dc = new dbconnection();
			Connection ct = dc.dbcon();
		
			String sql = "insert into pd_review values('0',?,?,?,?,'" + today + "')";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, datas.get(0));
			ps.setString(2, datas.get(1));
			ps.setString(3, datas.get(2));
			ps.setString(4, datas.get(3));
		
			int n = 0;
			n = ps.executeUpdate();
			if(n > 0) {
				this.callsign = "ok";
			}
			else {
				throw new Exception("ERROR");
			}
		
		}catch(Exception e) {
			this.callsign ="no";
		}
	
	}
	public String review_ok_msg() {
	
		return this.callsign;
	}
}
