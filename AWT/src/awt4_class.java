import java.awt.*;
import java.awt.event.*;


public class awt4_class {
//awt4.java�� ����
	public void view () {
		decorate deco = new decorate(); //awt4.java �ڽ� class �ε�
		Frame fr = new Frame();
		fr.setBounds(200,200,300,300);
		fr.setVisible(true);
		fr.setLayout(null);
		
		TextField input = new TextField();	// �Է� â
		input.setBounds(50,50,100,25);
		Button cal_btn = new Button("���"); // ��� ��ư
		cal_btn.setBounds(180,50,80,25);
		Button close_btn = new Button("�ݱ�"); // �ݱ� ��ư
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
					lb.setText("���ڸ��Է�");
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
