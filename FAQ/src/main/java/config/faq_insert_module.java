package config;

import java.sql.*;
import java.util.ArrayList;

public class faq_insert_module {
	
	dbconnection DC = null;
	Connection CT = null;
	PreparedStatement PS = null;
	static String callsign = null;

	//DB 저장
		public void insert_module(ArrayList<String> datas) {
		
			try {
				this.DC = new dbconnection();
				this.CT = DC.DBCON();
				
				time TODAY = new time();
				TODAY.today();
				
				
				String SQL = "insert into FAQ values ('0',?,?,?,?,?,?,'"+ "0000-00-00 00:00:00" +"')";
				
				this.PS = this.CT.prepareStatement(SQL);
				PS.setString(1, datas.get(0));	// 카테고리
				PS.setString(2, datas.get(1));	// 이름
				PS.setString(3, datas.get(2));	// 질문
				PS.setString(4, datas.get(3));	// 답변
				PS.setString(5, datas.get(4));	// 뷰
				PS.setString(6, datas.get(5));	// 작성시간
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
