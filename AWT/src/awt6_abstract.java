import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public abstract class awt6_abstract {
	/*
	[���μ��� �۵� ����]
	�ݱ� ��ư Ŭ�� : ���α׷�����
	������ȣ �߼� Ŭ�� : pc�� 4�ڸ� ���� 0~9���� ���� �Ѱ����� �����ϰ� �˴ϴ�.
	�� ������ȣ�� 4�ڸ� �����̸�, �ش� ���ڴ� console�� ��� ��ŵ�ϴ�.
	[����Ȯ�� ��ư]
	����ڰ� �ش� ���� �Է��մϴ�.
	�ش� �������� �ƹ��͵� �Է����� ���� ���
	�޽����� "������ȣ 4�ڸ��� �Է��ϼ���" ��� ����մϴ�.
	�ش� ������ȣ�� 
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
		
		
		this.send_btn = new Button("������ȣ �߼�");
		this.send_btn.setBounds(50,50,100,25);
		this.input = new TextField();
		this.input.setBounds(50,90,140,25);
		this.sub_btn = new Button("����Ȯ��");
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
			// ������ȣ �ޱ�
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
			
			// ������ȣ ����
			this.sub_btn.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String userinput = awt6_abstract.this.input.getText();
				System.out.println(userinput);
				System.out.println(String.valueOf(awt6_abstract.this.rannum));
//				boolean b1 = false;
				if(userinput.equals("")) {
					msg.setText("������ȣ 4�ڸ��� �Է��ϼ���");
				}
				else if (userinput.equals(String.valueOf(awt6_abstract.this.rannum))) {
					msg.setText("���� �Ϸ� �Ǿ����ϴ�.");
				}
				else {
					msg.setText("������ȣ�� �ٽ� Ȯ���Ͻñ� �ٶ��ϴ�.");
				}
				
			}
		});
						
			// ����
			this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		}

}

