// awt 환경설정
// awt5.java
import java.awt.*;
import java.awt.event.*;


public abstract class awt5_abstract {

	public abstract void IDcheck(String id);	// setter
	public abstract String signok();	// getter
	public abstract void dataload();	// DATABASE
	Frame fr = new Frame();
	TextField mid = null;
	Button overlap = null;
	Label msg = new Label();
	Button close = null;
	public void disign() {
		
		fr.setBounds(850,300,300,450);
		fr.setVisible(true);
		fr.setLayout(null);
		
		this.mid = new TextField(); // 사용자 입력
		this.mid.setBounds(25,150,150,25);
		this.overlap = new Button("중복체크"); // 중복
		this.overlap.setBounds(195,150,80,25);
		this.msg.setBackground(Color.LIGHT_GRAY); // 라벨
		this.msg.setBounds(25,200,250,25);
		this.close = new Button("닫기"); // 닫기 버튼
		this.close.setBounds(200,400,80,25);
		
		fr.add(this.mid);
		fr.add(this.overlap);
		fr.add(this.msg);
		fr.add(this.close);
		
		this.click();	// awt디자인 완료 후 해당 핸들링 메소드로 이동
	}
	
		public void click() {
		
		// 중복확인 섹터
		this.overlap.addActionListener(new ActionListener() { 
			
			@Override
			//setText(출력) getText(입력값 받기)
			public void actionPerformed(ActionEvent e) {

				String userid = awt5_abstract.this.mid.getText();
				if(userid.equals("")) {
					msg.setText("ID를 입력하세요.");
				}
				else {
					IDcheck(userid);
					String result = signok();
					if(result == null) {
						msg.setText("사용가능한 ID 입니다.");
					}
					else {
						msg.setText("다른 ID를 입력해주십시오.");
					}
				}
				
			}
		});
		
		//버튼으로 종료
		this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		}
}
