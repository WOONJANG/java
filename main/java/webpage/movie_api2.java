package webpage;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class movie_api2 {
	String apikey = null;
	String apidate = null;
	PrintWriter out = null;
	@Inject
	private SqlSessionFactory sqlFactory;

	@Resource(name = "moviedto")
	private movieDTO dto;

	@RequestMapping(value = "/movie_api", produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
	public void api_data(String apikey, String apidate, HttpServletResponse resp) throws Exception{ // extends Httpservlet 사용시 HttpServletResponse 사용 안 함
		
		this.apikey = apikey;
		this.apidate = apidate;
		resp.setContentType("text/html;charset=UTF-8");
		try {
			out = resp.getWriter();
			if (this.apikey.equals("movie_146") && !this.apidate.equals("")) {
				String date1 = this.apidate + " 00:00:00";
				String date2 = this.apidate + " 23:59:59";
				
				SqlSession session = sqlFactory.openSession();
				
				
				List<movieDAO> apidata = dto.list(date1, date2);
				// api 키 배열 생성 및 출력 파트
				int w = 0;
				JSONArray ja = new JSONArray();
				while(w < apidata.size()) {
					JSONObject jo = new JSONObject();
					jo.put("arank", apidata.get(w).getArank());
					jo.put("arankpart", apidata.get(w).getArankpart());
					jo.put("aperson", apidata.get(w).getAperson());
					jo.put("anm", apidata.get(w).getAnm());
					jo.put("aindate", apidata.get(w).getAindate());
//					System.out.println(apidata.get(w).getAnm());
					ja.add(jo);
					w++;
				}
				out.write(ja.toString());
			} else {
				out.print("ERROR : 31"); // api key 및 날짜 오류
			}
		} catch (Exception e) {
			out.print("ERROR : 32");
		}
	}
}
