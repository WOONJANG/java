package webpage;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testweb {

	@Inject
	private SqlSessionFactory sqlFactory;

	@Resource(name = "dataRepo")
	private DATAREPO repo;

	@RequestMapping("test.do")
	public String abc() {
		try {
			SqlSession s = sqlFactory.openSession();
//			System.out.println(sqlFactory.openSession());
			dataDAO dao = repo.select_test("Yi");
			System.out.println(dao.getMnm());
		} catch (Exception e) {
		}
		return "test";
	}

}
