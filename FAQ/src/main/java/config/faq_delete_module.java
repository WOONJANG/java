package config;

import java.sql.*;

public class faq_delete_module {
	
	dbconnection DC = null;
	Connection CT = null;
	PreparedStatement PS = null;
	static String callsign = null;

	//DB 저장
		public String delete_module(String idx) {
			String msg = null;
			try {
				this.DC = new dbconnection();
				this.CT = DC.DBCON();
				String sql = "delete from FAQ where FINDEX='" + idx + "'";
				this.PS = CT.prepareStatement(sql);
				int n = 0;
				n = this.PS.executeUpdate();
				if(n > 0) {
					msg = "ok";
				}
				else {
					throw new Exception("ERROR");
				}
			}catch(Exception e) {
				msg = "no";
			
			}finally {
				try {
					this.CT.close();
				}catch(Exception e) {
					
				}
			}
			return msg;
		}
}