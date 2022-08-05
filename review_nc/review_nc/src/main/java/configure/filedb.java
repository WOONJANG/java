package configure;

import java.sql.*;
import java.util.ArrayList;

public class filedb {
	dbconnection db = null;
	Connection ct = null;
	PreparedStatement ps = null;
	public filedb() {
		try {
			
			this.db = new dbconnection();
			this.ct = this.db.dbcon();
			
		}catch(Exception e) {
			
		}
	}
	
	public void file_insert(String imgdata) throws ClassNotFoundException,SQLException {
		String sql = "insert into imgs (iidx,iurl) values ('0',?)";
		this.ps = this.ct.prepareStatement(sql);
		ps.setString(1, imgdata);
		int n = 0;
		n = ps.executeUpdate();
		
		
		
	}
}
 