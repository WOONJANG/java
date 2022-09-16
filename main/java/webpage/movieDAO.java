package webpage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class movieDAO {
	private String aidx;
	private String arank;	// 랭크
	private String arankpart;	// OLD NEW
	private String aperson;	// 누적관객
	private String anm;	// 영화명
	private String aindate;	// 등록날짜
}
