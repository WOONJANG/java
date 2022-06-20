package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.setBounds(10, 10, 418, 30);
		contentPane.add(panel);
		
		JRadioButton rd1 = new JRadioButton("�ſ�ī��");
		rd1.setName("CARD");	// setName�� ���� ���� ������, background���� �ش� �Ӽ��� ���������ϴ� ���� ���մϴ�.
		rd1.setSelected(true);
		rd1.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("������ü");
		rd2.setName("BANK");	// setName�� ���� ���� ������, background���� �ش� �Ӽ��� ���������ϴ� ���� ���մϴ�.
		rd2.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("�������Ա�");
		rd3.setName("NOBANK");	// setName�� ���� ���� ������, background���� �ش� �Ӽ��� ���������ϴ� ���� ���մϴ�.
		rd3.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd3);
		
		ButtonGroup gp = new ButtonGroup();	// radio ���� ButtonGroup�� �̿�.
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		
		JPanel mu = new JPanel();
		mu.setFont(new Font("����ü", Font.PLAIN, 12));
		mu.setVisible(false);
		mu.setBorder(null);
		mu.setToolTipText("");
		mu.setBounds(10, 145, 418, 110);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("������ �Ա�"));
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 20, 96, 21);
		textField.setFont(new Font("����ü", Font.PLAIN, 12));
		mu.add(textField);
		textField.setColumns(10);
		
		btn = new JButton("��������");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pay = "";
				
				
				if(rd1.isSelected() == true) { // �ſ�ī��
					pay = rd1.getName();
					System.out.println("�ſ�ī�� ����");
					mu.setVisible(false);
				}
				else if (rd2.isSelected() == true) { // ������ü
					pay = rd2.getName();
					System.out.println("������ü ����");
					mu.setVisible(false);
				}
				else { //������
					pay = rd3.getName();
					mu.setVisible(true);
				}
			}
		});
		btn.setFont(new Font("����ü", Font.PLAIN, 12));
		btn.setBounds(170, 62, 93, 23);
		contentPane.add(btn);
	}
}
