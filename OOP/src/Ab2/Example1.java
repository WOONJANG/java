package Ab2;

public class Example1 {

	public static void main(String[] args) {
		
		home h [] = {new computer(), new monitor()};
		home2 h2 [] = {new phone()}; //extends로 home을 상속해서 가능
		h[0].broken(50);
		h[1].broken(0);
		h2[0].broken(0);


		
		
		
	}
}

class computer implements home {
	@Override
	public void poweron () {
		System.out.println("컴퓨터 전원 공급 중");
	}
	@Override
	public void poweroff () {
		System.out.println("컴퓨터 전원 중단");
	}
	@Override
	public void broken (int n) {
		if(this.bk <= n) {
			System.out.println("컴퓨터 고장");
		}
		else if (this.bk >= n && n >0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
}
//==========================================================

class monitor implements home {
	@Override
	public void poweron () {
		System.out.println("모니터 전원 공급 중");
	}
	@Override
	public void poweroff () {
		System.out.println("모니터 전원 중단");
	}
	@Override
	public void broken (int n) {
		if(this.bk <= n) {
			System.out.println("모니터 고장");
		}
		else if (this.bk >= n && n >0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
}
//==========================================================
// 휴대폰에 추가 기능이 필요합니다.
// 휴대폰 고장시 최소 전원 (20) -> 정상 작동은 40 이상 80 이상 고장
// 전원공급되지만 화면이 고장날 경우, (공급 O , 작동X) 20 ~ 39
// 전원공급시키지만 충전이 안될경우	(공급 X) 20 미만
class phone implements home2 {
	@Override
	public void poweron () {
		System.out.println("전화기 전원 공급 중");
	}	
	@Override
	public void poweroff () {
		System.out.println("전화기 전원 중단");
	}	
	@Override
	public void lcbroken() {
		System.out.println("전화기 화면 고장");
	}	
	@Override
	public void modualerror() {
		System.out.println("전화기 배터리고장");
	}
	@Override
	public void broken (int n) {
		if(this.bk <= n) { // 80 ~
			System.out.println("전화기 고장");
		}
		else if (n >= this.ok && n < this.bk){ // 40~ 79
			this.poweron();
		}
		else if (n < this.ok && n >= this.bt) { // 20 ~ 39
			this.lcbroken();
		}
		else if (n < this.bt && n > 0 ) { // 1 ~ 19
			this.modualerror();
		}
		else { // 0
			this.poweroff();
		}
	}
}
