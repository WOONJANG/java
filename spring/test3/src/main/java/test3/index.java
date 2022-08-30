package test3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class index implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView MV = new ModelAndView();
		dbservice ds = new dbservice("Yi", "a333356", "이순신", "01016435678", "32");
		listdb ld = new listdb();
		String msg = ld.insert(ds);
		MV.addObject("msg", msg);
		MV.setViewName("/index.jsp");
		return MV;
	}

}
