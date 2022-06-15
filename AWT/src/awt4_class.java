import java.awt.*;
import java.awt.event.*;


public class awt4_class {
//awt4.java와 연계
	public void view () {
		decorate deco = new decorate(); //awt4.java 자식 class 로드
		Frame fr = new Frame();
		fr.setBounds(200,200,300,300);
		fr.setVisible(true);
		fr.setLayout(null);
		
		TextField input = new TextField();	// 입력 창
		input.setBounds(50,50,100,25);
		Button cal_btn = new Button("계산"); // 계산 버튼
		cal_btn.setBounds(180,50,80,25);
		Button close_btn = new Button("닫기"); // 닫기 버튼
		close_btn.setBounds(50,200,80,25);
		
		TextArea lb = new TextArea(); 
		lb.setBounds(50,100,200,100);
		lb.setBackground(Color.gray);
		
		fr.add(input);
		fr.add(cal_btn);
		fr.add(close_btn);
		fr.add(lb);
		
		cal_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int c = Integer.parseInt(input.getText());
				deco.cal_btn_push(c);
					lb.setText(deco.calls());
				}catch(Exception err) {
					lb.setText("숫자만입력");
				}
			}

		});
		close_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
}
