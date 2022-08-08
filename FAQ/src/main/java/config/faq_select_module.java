package config;

import java.io.NotActiveException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class faq_select_module {
	
	private String FIDX = null;
	private String FCATEGORY = null;
	private String FQ = null;
	private String FUSER = null;
	private String VIEW = null;
	private String TIME = null;
	dbconnection DC = null;
	Connection CT = null;
	PreparedStatement PS = null;
	public String getFIDX() {
		return this.FIDX;
	}
	public void setFIDX(String fIDX) {
		this.FIDX = fIDX;
	}
	public String getFCATEGORY() {
		return this.FCATEGORY;
	}
	public void setFCATEGORY(String fCATEGORY) {
		this.FCATEGORY = fCATEGORY;
	}
	public String getFQ() {
		return this.FQ;
	}
	public void setFQ(String fQ) {
		this.FQ = fQ;
	}
	public String getFUSER() {
		return this.FUSER;
	}
	public void setFUSER(String fUSER) {
		this.FUSER = fUSER;
	}
	public String getTIME() {
		return this.TIME;
	}
	public void setTIME(String tIME) {
		this.TIME = tIME;
	}
	public String getVIEW() {
		return this.VIEW;
	}
	public void setVIEW(String vIEW) {
		this.VIEW = vIEW;
	}
	
	public ArrayList<faq_select_module> viewdata () throws ClassNotFoundException, SQLException{
		
		ArrayList<faq_select_module> list = new ArrayList<faq_select_module>();
		
		
		this.DC = new dbconnection();
		this.CT = DC.DBCON();
		String sql = "select * from FAQ order by FINDATE desc;";
		this.PS = CT.prepareStatement(sql);
		ResultSet rs = this.PS.executeQuery();
		
		while(rs.next()) {
			faq_select_module ss = new faq_select_module();
			ss.setFIDX(rs.getString("FINDEX"));
			ss.setFCATEGORY(rs.getString("FCATEGORY"));
			ss.setFUSER(rs.getString("FUSER"));
			ss.setFQ(rs.getString("FQ"));
			ss.setVIEW(rs.getString("FPRINT"));
			ss.setTIME(rs.getString("FINDATE"));
			list.add(ss);
		}
		
		return list;
	}
}
