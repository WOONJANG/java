package swing1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;

public class swingprac2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingprac2 frame = new swingprac2();
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
	public swingprac2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb3 = new JLabel("");
		lb3.setFont(new Font("����ü", Font.PLAIN, 12));
		lb3.setBackground(new Color(255, 255, 204));
		lb3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lb3.setBounds(10, 222, 418, 33);
		contentPane.add(lb3);
		
		JButton btn1 = new JButton("���� �ϱ�");
		btn1.setFont(new Font("����ü", Font.PLAIN, 12));
		btn1.setBounds(335, 42, 93, 83);
		contentPane.add(btn1);

		
		String timelist [] = {"1�ð� ��", "2�ð� ��", "3�ð� ��", "D+1", "D+2","D+3"};
		JComboBox cb1 = new JComboBox(timelist);
		cb1.setFont(new Font("����ü", Font.PLAIN, 12));
		cb1.setBounds(212, 65, 98, 36);
		contentPane.add(cb1);
		
		
		ButtonGroup gp1 = new ButtonGroup();
//		ButtonGroup gp2 = new ButtonGroup();
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(new LineBorder(Color.black,1),"ȸ�� & ��ȸ��"));
		panel1.setFont(new Font("����ü", Font.PLAIN, 12));
		panel1.setBounds(10, 42, 192, 80);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("ȸ��");
		rd1.setFont(new Font("����ü", Font.PLAIN, 12));
		rd1.setBounds(31, 28, 49, 23);
		panel1.add(rd1);
		gp1.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("��ȸ��");
		rd2.setFont(new Font("����ü", Font.PLAIN, 12));
		rd2.setBounds(101, 28, 61, 23);
		panel1.add(rd2);
		gp1.add(rd2);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(new LineBorder(Color.black,1),"���� ����"));
		panel2.setFont(new Font("����ü", Font.PLAIN, 12));
		panel2.setBounds(10, 132, 418, 83);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JCheckBox ccb1 = new JCheckBox("�ѽ�");
		ccb1.setFont(new Font("����ü", Font.PLAIN, 12));
		ccb1.setBounds(35, 34, 50, 23);
		panel2.add(ccb1);
		
		JCheckBox ccb2 = new JCheckBox("���");
		ccb2.setFont(new Font("����ü", Font.PLAIN, 12));
		ccb2.setBounds(135, 34, 50, 23);
		panel2.add(ccb2);
		
		JCheckBox ccb3 = new JCheckBox("�Ͻ�");
		ccb3.setFont(new Font("����ü", Font.PLAIN, 12));
		ccb3.setBounds(235, 34, 50, 23);
		panel2.add(ccb3);
		
		JCheckBox ccb4 = new JCheckBox("�߽�");
		ccb4.setFont(new Font("����ü", Font.PLAIN, 12));
		ccb4.setBounds(335, 34, 50, 23);
		panel2.add(ccb4);
		
		JLabel lblNewLabel = new JLabel("���� ���� �ý���");
		lblNewLabel.setFont(new Font("����ü", Font.BOLD, 12));
		lblNewLabel.setBounds(161, 10, 104, 24);
		contentPane.add(lblNewLabel);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String guest = "";
				String msg1="";
				if(rd1.isSelected() == true) {
					guest = rd1.getName();
//						System.out.println("ȸ��");
					msg1 = "ȸ��";
				}
				else {
					guest = rd2.getName();
//						System.out.println("��ȸ��");
					msg1 = "��ȸ��";
				}
// =================================================			
				int t = cb1.getSelectedIndex();
//					System.out.println(timelist[t]);
// =================================================
				String order = "";
				String msg2="";
				String ordermsg[]  = {"�ѽ�", "���", "�Ͻ�", "�߽�"};
				for (int f =0; f<ordermsg.length; f++) {
					
				
				if(ccb1.isSelected() == true) { 
					order = ccb1.getName();
//					System.out.println("�ѽ�");
//					msg2="�ѽ�";
				}
				else if (ccb2.isSelected() == true) { 
					order = ccb2.getName();
//					System.out.println("���");
//					msg2="���";
				}	
				else if (ccb3.isSelected() == true) { 
					order = ccb3.getName();
//					System.out.println("�Ͻ�");
//					msg2="�Ͻ�";
				}
				else if (ccb4.isSelected() == true) { 
					order = ccb4.getName();
//					System.out.println("�߽�");
//					msg2="�߽�";
					msg2 = ordermsg[f];
				}
				}
				SimpleDateFormat format1 = new SimpleDateFormat("yy.MM.dd HH:mm");
				Date time = new Date();
				String now = format1.format(time);

				lb3.setText("    " + msg1 + "�� "+ now +"�� ���� " + timelist[t] +"�� "+ msg2 + " ���� �Ǿ����ϴ�.");
			}
		});

		
	}
}
