/*	
 * test2라는 package에 admin이라는 package를 포함시킴
 * 	실제 view 파트와 동일한 디렉토리를 가지게 된다.
 * 	
*/
package test2.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class main_contro implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*	ModelAndView(로드 할 view 파일명 및 디렉토리를 설정) 이유 : class명과 view파일명이 서로 다를 경우 사용하는 방식	*/
		ModelAndView MV = new ModelAndView("/admin/main");
		return MV;
	}

}
