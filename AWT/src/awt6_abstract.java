import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public abstract class awt6_abstract {
	/*
	[프로세서 작동 사항]
	닫기 버튼 클릭 : 프로그램종료
	인증번호 발송 클릭 : pc가 4자리 숫자 0~9까지 각각 한가지를 선택하게 됩니다.
	총 인증번호는 4자리 숫자이며, 해당 숫자는 console로 출력 시킵니다.
	[인증확인 버튼]
	사용자가 해당 값을 입력합니다.
	해당 인증값을 아무것도 입력하지 않을 경우
	메시지에 "인증번호 4자리를 입력하세요" 라고 출력합니다.
	해당 인증번호를 
*/
	int rannum;
	public abstract void bb();
	Frame fr = new Frame();
	TextField input = null;
	Button send_btn = null;
	Button sub_btn = null;
	Label msg = new Label();
	Button close = null;
	

public void awt() {
		
		this.fr.setBounds(850,300,350,180);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		
		this.send_btn = new Button("인증번호 발송");
		this.send_btn.setBounds(50,50,100,25);
		this.input = new TextField();
		this.input.setBounds(50,90,140,25);
		this.sub_btn = new Button("인증확인");
		this.sub_btn.setBounds(200,90,100,25);
		this.msg = new Label();
		this.msg.setBounds(50,130,250,25);
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.close = new Button("X");
		this.close.setBackground(Color.red);
		this.close.setBounds(270,50,30,25);;
		
		this.fr.add(send_btn);
		this.fr.add(input);
		this.fr.add(sub_btn);
		this.fr.add(msg);
		this.fr.add(close);
		
		this.clicks();
		
}	
		public void clicks() {
			// 인증번호 받기
			this.send_btn.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				String rrannum; 
				
				Random rd = new Random();
				int rannum2 = rd.nextInt();
				awt6_abstract.this.rannum = (rannum2>>>1)%(9999-1000)+1000;
				
				System.out.println(awt6_abstract.this.rannum);
			//	rrannum = Integer.toString(rannum);
			
				}
		});
			
			// 인증번호 전송
			this.sub_btn.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String userinput = awt6_abstract.this.input.getText();
				System.out.println(userinput);
				System.out.println(String.valueOf(awt6_abstract.this.rannum));
//				boolean b1 = false;
				if(userinput.equals("")) {
					msg.setText("인증번호 4자리를 입력하세요");
				}
				else if (userinput.equals(String.valueOf(awt6_abstract.this.rannum))) {
					msg.setText("인증 완료 되었습니다.");
				}
				else {
					msg.setText("인증번호를 다시 확인하시길 바랍니다.");
				}
				
			}
		});
						
			// 종료
			this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		}

}

