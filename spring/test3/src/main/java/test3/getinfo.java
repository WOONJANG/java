package test3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/getinfo")
public class getinfo {
	/*	Mapping을 사용하는 이유는 컨트롤러를 통합하여 별도의 view가 필요 없이 사용할 때 이용
	 * view 1개 + 컨트롤러 1개 <= 다수의 class 파일들	*/
	// select insert update delete
	
//	@GetMapping("/data1")	// get 형태로 data를 받음
	@RequestMapping(value="/t1", method=RequestMethod.GET)
	public String test01_get() {
		return "getinfo/t1";
	}
	 
//	@PostMapping("/data2")	// post 형태로 data를 받음
	@RequestMapping(value="/t2", method=RequestMethod.POST)
	public String test02_post() {
		return "getinfo/t2";
	}
	
	
}
