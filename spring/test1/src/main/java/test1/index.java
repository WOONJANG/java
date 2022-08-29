package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class index implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","TTSTTSTTSWT");
		mv.addObject("data1","홍길동 ");
		// setView : URL이 이동되면서 완전 다른 화면으로 이동할 때
		// setViewName : URL 변화가 없고 해당 화면을 자신의 페이지에서 출력 및 request가 가능함 
//		mv.setViewName("/WEB-INF/views/index.jsp");
		// view는 실제 디렉토리 바탕으로 제작해야 함
		String aaa = "hong";
		request.setAttribute("id", aaa);
		
		return mv;
	}
}
