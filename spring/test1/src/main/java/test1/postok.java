package test1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class postok implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String mid = request.getParameter("mid");
		System.out.println(mid);
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",mid);
		return mv;
	}
	
	public void abc() {
		
	}
	
}
