import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//외부 class로 awt 생성
public class awt2 {

	public static void main(String[] args) {
		loginok lg = new loginok(); // 로드
	}
}
//===========================화면 전환===============================================
class loginok extends login{ 
	public loginok() {
		this.fr.setTitle("Login 후 페이지");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		this.fr.add(mid); //id 입력창 출력
		this.fr.add(mpw); //pw 입력창 출력
		this.fr.add(msg2);
		this.fr.add(msg1);
		this.fr.add(lg_btn);
		this.fr.add(ag_btn);
		this.fr.add(close_btn);
	}
}
//=======================================================================================
class login { // 연습용 > extends abstract 추상 class를 먼저 로드하여 field에 적용시킴.
	
	Frame fr = new Frame();
	Font font = new Font("돋움체", Font.BOLD,20); // ("글씨체",Font.BOLD(볼드체),글자크기)
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Button lg_btn = new Button("로그인");
	Button ag_btn = new Button("회원가입");
	Button close_btn = new Button("프로그램 종료");
	Label msg1 = new Label();
	Label msg2 = new Label();
// ============================= 프로그램 창 ===============================	
	public login() {
//===========================비밀번호 * 표기==============================		
		mpw.setEchoChar('*');
//=======================입력창 사이즈 ====================================		
		this.mid.setFont(font);	//적용하고자 하는 Object 선택
		this.mid.setBounds(100, 60, 200, 40); // id 입력창 사이즈
		this.mpw.setFont(font);
		this.mpw.setBounds(100, 120, 200, 40); // pw 입력창 사이즈
//=======================입력창 출력====================================		
//========================버튼 사이즈======================================				
		this.lg_btn.setBounds(100, 180, 200, 40); //로그인 버튼 사이즈
		this.lg_btn.setBackground(Color.magenta); //로그인 버튼 색상
		this.ag_btn.setBounds(100, 240, 200, 40); // 회원가입 사이즈
		this.ag_btn.setBackground(Color.cyan); // 회원가입 색상
		this.close_btn.setBounds(100, 300, 200, 40); 
		this.close_btn.setBackground(Color.gray);
//============================버튼 출력=====================================		
		this.msg1.setBounds(100, 100, 200, 20);
		this.msg1.setBackground(Color.red);
		this.msg2.setBounds(100, 160, 200, 20);
		this.msg2.setBackground(Color.pink);
//==========================메세지 사이즈 및 색상=============================		

		this.clicks();
//============================메세지 출력====================================			

	}
// ========================버튼 핸들링 ===================================	
	public void clicks () { // Button에 관한 모든 핸들링 method 집합소
//================================로그인 버튼 핸들링 ===============================================================
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // SWING API 경고옵션 로드
			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 버튼 아이디 및 패스워드 검토
				String user_id = mid.getText(); // Object명.getText는 사용자가 입력한 값을 가져올때 사용합니다.
				String user_pw = mpw.getText();
				if(user_id.equals("")) { // null 사용 금지 => null 또한 값이 있는 상태.
					msg1.setText("아이디를 입력하세요.");
					alert.showMessageDialog(null, "아이디를 입력하세요.","경고",JOptionPane.ERROR_MESSAGE);
				}
				else {
					msg1.setText("");
					if(user_pw.equals("")){
						msg2.setText("비밀번호를 입력하세요.");
						alert.showMessageDialog(null, "패스워드를 입력하세요.","경고",JOptionPane.ERROR_MESSAGE);
					}
					else {
						msg2.setText("로그인을 진행합니다.");
						alert.showMessageDialog(null, "로그인 되었습니다.");
					}
				}
			}
		});
//=======================================회원가입 버튼 핸들링===================================================		
		this.ag_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); // 해당프레임 종료
				loginok ok = new loginok(); // 다음 프레임 로드
			}
		});
//===========================프로그램 종료 버튼 핸들링===========================================================		
		this.close_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// "프로그램 종료" 이벤트 핸들링 메소드
				System.exit(0);
			}
		});
	}
}


