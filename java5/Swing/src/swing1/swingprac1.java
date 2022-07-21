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

public class swingprac1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingprac1 frame = new swingprac1();
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
	public swingprac1() {
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
		ButtonGroup gp2 = new ButtonGroup();
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(new LineBorder(Color.black,1),"ȸ�� & ��ȸ��"));
		panel1.setFont(new Font("����ü", Font.PLAIN, 12));
		panel1.setBounds(10, 42, 192, 80);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("ȸ��");
		rd1.setFont(new Font("����ü", Font.PLAIN, 12));
		rd1.setBounds(31, 28, 49, 23);
		gp1.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("��ȸ��");
		rd2.setFont(new Font("����ü", Font.PLAIN, 12));
		rd2.setBounds(101, 28, 61, 23);
		gp1.add(rd2);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(new LineBorder(Color.black,1),"���� ����"));
		panel2.setFont(new Font("����ü", Font.PLAIN, 12));
		panel2.setBounds(10, 132, 418, 83);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JRadioButton rd3 = new JRadioButton("�ѽ�");
		rd3.setFont(new Font("����ü", Font.PLAIN, 12));
		rd3.setBounds(35, 35, 50, 20);
		gp2.add(rd3);
		
		JRadioButton rd4 = new JRadioButton("���");
		rd4.setFont(new Font("����ü", Font.PLAIN, 12));
		rd4.setBounds(135, 35, 50, 20);
		gp2.add(rd4);
		
		JRadioButton rd5 = new JRadioButton("�Ͻ�");
		rd5.setFont(new Font("����ü", Font.PLAIN, 12));
		rd5.setBounds(235, 35, 50, 20);
		gp2.add(rd5);
		
		JRadioButton rd6 = new JRadioButton("�߽�");
		rd6.setFont(new Font("����ü", Font.PLAIN, 12));
		rd6.setBounds(335, 35, 50, 20);
		gp2.add(rd6);
		
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
				if(rd3.isSelected() == true) { 
					order = rd3.getName();
//					System.out.println("�ѽ�");
					msg2="�ѽ�";
				}
				else if (rd4.isSelected() == true) { 
					order = rd4.getName();
//					System.out.println("���");
					msg2="���";
				}	
				else if (rd5.isSelected() == true) { 
					order = rd5.getName();
//					System.out.println("�Ͻ�");
					msg2="�Ͻ�";
				}
				else if (rd6.isSelected() == true) { 
					order = rd6.getName();
//					System.out.println("�߽�");
					msg2="�߽�";
				}
				SimpleDateFormat format1 = new SimpleDateFormat("yy.MM.dd HH:mm");
				Date time = new Date();
				String now = format1.format(time);

				lb3.setText("    " + msg1 + "�� "+ now +"�� ���� " + timelist[t] +"�� "+ msg2 + " ���� �Ǿ����ϴ�.");
			}
		});

		
	}
}