// awt ȯ�漳��
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
		
		this.mid = new TextField(); // ����� �Է�
		this.mid.setBounds(25,150,150,25);
		this.overlap = new Button("�ߺ�üũ"); // �ߺ�
		this.overlap.setBounds(195,150,80,25);
		this.msg.setBackground(Color.LIGHT_GRAY); // ��
		this.msg.setBounds(25,200,250,25);
		this.close = new Button("�ݱ�"); // �ݱ� ��ư
		this.close.setBounds(200,400,80,25);
		
		fr.add(this.mid);
		fr.add(this.overlap);
		fr.add(this.msg);
		fr.add(this.close);
		
		this.click();	// awt������ �Ϸ� �� �ش� �ڵ鸵 �޼ҵ�� �̵�
	}
	
		public void click() {
		
		// �ߺ�Ȯ�� ����
		this.overlap.addActionListener(new ActionListener() { 
			
			@Override
			//setText(���) getText(�Է°� �ޱ�)
			public void actionPerformed(ActionEvent e) {

				String userid = awt5_abstract.this.mid.getText();
				if(userid.equals("")) {
					msg.setText("ID�� �Է��ϼ���.");
				}
				else {
					IDcheck(userid);
					String result = signok();
					if(result == null) {
						msg.setText("��밡���� ID �Դϴ�.");
					}
					else {
						msg.setText("�ٸ� ID�� �Է����ֽʽÿ�.");
					}
				}
				
			}
		});
		
		//��ư���� ����
		this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		}
}
