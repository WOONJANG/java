import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�ܺ� class�� awt ����
public class awt2 {

	public static void main(String[] args) {
		loginok lg = new loginok(); // �ε�
	}
}
//===========================ȭ�� ��ȯ===============================================
class loginok extends login{ 
	public loginok() {
		this.fr.setTitle("Login �� ������");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		this.fr.add(mid); //id �Է�â ���
		this.fr.add(mpw); //pw �Է�â ���
		this.fr.add(msg2);
		this.fr.add(msg1);
		this.fr.add(lg_btn);
		this.fr.add(ag_btn);
		this.fr.add(close_btn);
	}
}
//=======================================================================================
class login { // ������ > extends abstract �߻� class�� ���� �ε��Ͽ� field�� �����Ŵ.
	
	Frame fr = new Frame();
	Font font = new Font("����ü", Font.BOLD,20); // ("�۾�ü",Font.BOLD(����ü),����ũ��)
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Button lg_btn = new Button("�α���");
	Button ag_btn = new Button("ȸ������");
	Button close_btn = new Button("���α׷� ����");
	Label msg1 = new Label();
	Label msg2 = new Label();
// ============================= ���α׷� â ===============================	
	public login() {
//===========================��й�ȣ * ǥ��==============================		
		mpw.setEchoChar('*');
//=======================�Է�â ������ ====================================		
		this.mid.setFont(font);	//�����ϰ��� �ϴ� Object ����
		this.mid.setBounds(100, 60, 200, 40); // id �Է�â ������
		this.mpw.setFont(font);
		this.mpw.setBounds(100, 120, 200, 40); // pw �Է�â ������
//=======================�Է�â ���====================================		
//========================��ư ������======================================				
		this.lg_btn.setBounds(100, 180, 200, 40); //�α��� ��ư ������
		this.lg_btn.setBackground(Color.magenta); //�α��� ��ư ����
		this.ag_btn.setBounds(100, 240, 200, 40); // ȸ������ ������
		this.ag_btn.setBackground(Color.cyan); // ȸ������ ����
		this.close_btn.setBounds(100, 300, 200, 40); 
		this.close_btn.setBackground(Color.gray);
//============================��ư ���=====================================		
		this.msg1.setBounds(100, 100, 200, 20);
		this.msg1.setBackground(Color.red);
		this.msg2.setBounds(100, 160, 200, 20);
		this.msg2.setBackground(Color.pink);
//==========================�޼��� ������ �� ����=============================		

		this.clicks();
//============================�޼��� ���====================================			

	}
// ========================��ư �ڵ鸵 ===================================	
	public void clicks () { // Button�� ���� ��� �ڵ鸵 method ���ռ�
//================================�α��� ��ư �ڵ鸵 ===============================================================
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // SWING API ���ɼ� �ε�
			@Override
			public void actionPerformed(ActionEvent e) {
				// �α��� ��ư ���̵� �� �н����� ����
				String user_id = mid.getText(); // Object��.getText�� ����ڰ� �Է��� ���� �����ö� ����մϴ�.
				String user_pw = mpw.getText();
				if(user_id.equals("")) { // null ��� ���� => null ���� ���� �ִ� ����.
					msg1.setText("���̵� �Է��ϼ���.");
					alert.showMessageDialog(null, "���̵� �Է��ϼ���.","���",JOptionPane.ERROR_MESSAGE);
				}
				else {
					msg1.setText("");
					if(user_pw.equals("")){
						msg2.setText("��й�ȣ�� �Է��ϼ���.");
						alert.showMessageDialog(null, "�н����带 �Է��ϼ���.","���",JOptionPane.ERROR_MESSAGE);
					}
					else {
						msg2.setText("�α����� �����մϴ�.");
						alert.showMessageDialog(null, "�α��� �Ǿ����ϴ�.");
					}
				}
			}
		});
//=======================================ȸ������ ��ư �ڵ鸵===================================================		
		this.ag_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); // �ش������� ����
				loginok ok = new loginok(); // ���� ������ �ε�
			}
		});
//===========================���α׷� ���� ��ư �ڵ鸵===========================================================		
		this.close_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// "���α׷� ����" �̺�Ʈ �ڵ鸵 �޼ҵ�
				System.exit(0);
			}
		});
	}
}


