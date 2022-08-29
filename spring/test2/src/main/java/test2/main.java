package test2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class main implements Controller {

	// spring MBC Controller 에서 사용하는 기본 객체 메소드
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView MV = new ModelAndView();
		MV.addObject("number1",50);
		MV.addObject("number2",80);
		MV.setViewName("/WEB-INF/view/main.jsp");
		return MV;
	}

	
	
}
