package webpage;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class nice {
	
	private String username = null;
	private String usertel = null;
	
//	@RequestMapping(value = "/nice_joinok.do", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
	@PostMapping(value = "/nice_joinok.do", produces = "text/html;charset=UTF-8")
	// username, usertel (front에서 넘어오는 값) 
	public String nice_method(Model m, String username, String usertel, HttpServletResponse resp, HttpServletRequest req) throws Exception {
		
		this.username = username;
		this.usertel = usertel;
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		m.addAttribute("username", this.username);
		m.addAttribute("usertel", this.usertel);
		
		return "nice_check";
	}
}
