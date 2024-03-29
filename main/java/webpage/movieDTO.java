package webpage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("moviedto")	// 해당 class를 메모리에 등록
public class movieDTO {
	@Resource(name = "sqlTemp")	// sql 문법을 실행 할 수 있는 실행문
	private SqlSessionTemplate session;	// movie_api2에서 sqlFactory.opSession()에 대한 정보값

	public List<movieDAO> list (@Param("value1") String date1, @Param("value2") String date2){
		
		// 2개 이상의 인자값을 xml에 적용시 map을 이용하여 동일한 #{} 이름으로 키배열을 생성함
		Map map = new HashMap<>();
		map.put("value1", date1);
		map.put("value2", date2);
		// 키 배열값을 적용
		List<movieDAO> apidata = session.selectList("sql.select_api",map);
		
		return apidata;
	}
}
