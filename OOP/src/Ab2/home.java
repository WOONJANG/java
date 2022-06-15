package Ab2;

public interface home {

	int bk = 80; // 80 이상 되면 고장으로 처리
	public void poweron ();	// 가동
	public void poweroff ();// 꺼짐
	public void broken (int n);	// 고장
}

