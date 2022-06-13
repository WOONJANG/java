import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {


	public awt1() {
	}
	
	public static void main(String[] args) {
		//Frame > Bound > Object
		Frame fr = new Frame(); // 창
		
		fr.setTitle("AWT 기초 화면");
		fr.setVisible(true);
		fr.setLayout(null);	// 패널을 사용 안하기위해 null
		fr.setBounds(800, 300, 500, 500); // (x축, y축, 가로크기, 세로크기)
		
		Button bt = new Button("클릭");
		Button closebt = new Button("닫기");
		Label msg = new Label("");
		
		bt.setBounds(40, 40, 100, 30);
		bt.setBackground(Color.blue);
		closebt.setBounds(160, 40, 100, 30);
//		msg.setBackground(Color.red); // msg 출력 위치 확인 //setBackground(Color.색상)
		msg.setBounds(40, 100, 300, 30);
		
		// Object를 Frame에 적용
		fr.add(bt);
		fr.add(closebt);
		fr.add(msg);
		//addActionListener(버튼) : event method 단, this.사용 절대 안됨
		closebt.addActionListener(new ActionListener() { //new ActionListener() : Override 메소드 자동생성
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		bt.addActionListener(new ActionListener() {
			
			String a = "홍길동"; //addActionListener : event method field에 String을 생성
			@Override
			public void actionPerformed(ActionEvent e) {
//				msg.setText("AWT 처음이지?ㅇㅇ"); 
				msg.setText(this.a);	// this.를 이용하여 핸들링 가능함
				
			}
		});
		
		
	}

}
