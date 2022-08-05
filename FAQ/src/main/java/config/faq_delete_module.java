package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class faq_delete_module {
	
	dbconnection DC = null;
	Connection CT = null;
	PreparedStatement PS = null;
	static String callsign = null;

	//DB 저장
		public void delete_module(ArrayList<String> datas) {
		
			try {
				this.DC = new dbconnection();
				this.CT = DC.DBCON();
				
				time TODAY = new time();
				TODAY.today();
				
				
				String SQL = "delete from FAQ where "+ xx +" ;";
				
				this.PS = this.CT.prepareStatement(SQL);
				PS.setString(1, datas.get(0));
				PS.setString(2, datas.get(1));
				PS.setString(3, datas.get(2));
				PS.setString(4, datas.get(3));
//				PS.setString(5, datas.get(4));
				
				int n = 0;
				n = PS.executeUpdate();
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
		public String write_ok_msg() {
		
			return this.callsign;
		}
	}