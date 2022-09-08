package webpage;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("dataRepo")
public class DATAREPO {
	
	@Resource(name = "sqlTemp") // testweb.java @Resource(name = "dataRepo") name값과 같은것을 씀
	private SqlSessionTemplate s;
	
	public dataDAO select_test(String mid) {
		dataDAO t = s.selectOne("sql.select_test",mid);
		return t;
	}
}
