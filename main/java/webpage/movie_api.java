package webpage;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp.BasicDataSource;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class movie_api {
	private String apikey = null;
	private String apidate = null;
	private String result = null;
	protected String json_parsing = null;

	// method = RequestMethod.GET : Front에서 전송된 data를 get으로만 통신 하겠다는 뜻
	// @GetMapping @PostMapping @PutMapping @DeleteMapping : method 속성을 사용하지 않음

	@Autowired
	BasicDataSource dataConnect;

	@RequestMapping(value = "/movie", produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
	public String apiserver(String apikey, String apidate) {
		try {
			this.apikey = apikey;
			this.apidate = apidate;
			if (!this.apikey.equals("null") || !this.apikey.equals("") || !this.apikey.equals(null)) {
				if (this.apikey.equals("movie_146") && !this.apidate.equals("") && !this.apidate.equals(null)) {
					// DB호출

					Connection con = dataConnect.getConnection();
					String sdate =  this.apidate + " 00:00:00";
					String edate =  this.apidate + " 23:59:59";
					String sql = "select * from apimovie where aindate >= ? and aindate <= ? ";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, sdate);
					ps.setString(2, edate);
					System.out.println(ps);
					ResultSet rs = ps.executeQuery();
					JSONArray ja = new JSONArray();
					while(rs.next()) {
						JSONObject jb = new JSONObject();
						
						jb.put("aidx", rs.getString("aidx"));
						jb.put("arank", rs.getString("arank"));
						jb.put("arankpart", rs.getString("arankpart"));
						jb.put("aperson", rs.getString("aperson"));
						jb.put("anm", rs.getString("anm"));
						jb.put("aindate", rs.getString("aindate"));
						
						ja.add(jb);
						json_parsing = jb.toString();
					}
					
					result = ja.toString();
				} else {
					result = "error : 32 (api key error)";
				}
			}
		} catch (Exception e) {
			result = "error : 31 (Exception error)";
		}
		return result;
	}
}
