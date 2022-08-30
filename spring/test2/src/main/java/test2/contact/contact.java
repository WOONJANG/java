package test2.contact;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class contact implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// . 사용 이유는 tiles.xml과 연동 해야하므로
		// 그 외에는 / 사용
		ModelAndView MV = new ModelAndView("contact.contact");
		
		return MV;
	}
}
