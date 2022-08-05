package configure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class dataload {

	
	private String RIDX;
	private String RNM;
	private String RPD;
	private String RVALUES;
	private String RTEXT;
	private String RDATE;
	private String IMGS;
		
	// servlet에서 입력시키는 파트
	public void setidx(String idx) {
		this.RIDX = idx;
	}
	public void setname(String name) {
		this.RNM = name;
	}
	public void setproduct(String product) {
		this.RPD = product;
	}
	public void setvalues(String values) {
		this.RVALUES = values;
	}
	public void settext(String text) {
		this.RTEXT = text;
	}
	public void setdate(String date) {
		this.RDATE = date;
	}
	public void setimg(String img) {
		this.IMGS = img;
	}
	
	// get JSP로 출력하기 위해서 사용
	public String getidx() {
		return this.RIDX;
	}
	public String getname() {
		return this.RNM;
	}
	public String getproduct() {
		return this.RPD ;
	}
	public String getvalues() {
		return this.RVALUES;
	}
	public String gettext() {
		return this.RTEXT;
	}
	public String getdate() {
		return this.RDATE;
	}
	public String getimg() {
		return this.IMGS;
	}
	
	public ArrayList<dataload> all_lists(){	// 배열 자료형에 메소드 형태
		ArrayList<dataload> list = new ArrayList<dataload>();	// 배열 자료형 생성
		try {
			dbconnection db = new dbconnection();
			Connection ct = db.dbcon();
			String sql = "select ridx,rnm,rpd,rvalues,rtext,rdate,imgs from pd_review";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				dataload dl = new dataload();
				dl.setidx(rs.getString("ridx"));
				dl.setname(rs.getString("rnm"));
				dl.setproduct(rs.getString("rpd"));
				dl.setvalues(rs.getString("rvalues"));
				dl.settext(rs.getString("rtext"));
				dl.setdate(rs.getString("rdate"));
				dl.setimg(rs.getString("imgs"));
				list.add(dl);	// 최종 DB값을 받아서 배열로 처리
			}
		}catch(Exception e) {
			
		}
		return list;	// 최종 DB 배열값을 return JSP에게 전달하기 위해서 사용
	}
	
}
