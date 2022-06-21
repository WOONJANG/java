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
		lb3.setFont(new Font("돋움체", Font.PLAIN, 12));
		lb3.setBackground(new Color(255, 255, 204));
		lb3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lb3.setBounds(10, 222, 418, 33);
		contentPane.add(lb3);
		
		JButton btn1 = new JButton("예약 하기");
		btn1.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn1.setBounds(335, 42, 93, 83);
		contentPane.add(btn1);

		
		String timelist [] = {"1시간 후", "2시간 후", "3시간 후", "D+1", "D+2","D+3"};
		JComboBox cb1 = new JComboBox(timelist);
		cb1.setFont(new Font("돋움체", Font.PLAIN, 12));
		cb1.setBounds(212, 65, 98, 36);
		contentPane.add(cb1);
		
		
		ButtonGroup gp1 = new ButtonGroup();
//		ButtonGroup gp2 = new ButtonGroup();
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(new LineBorder(Color.black,1),"회원 & 비회원"));
		panel1.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel1.setBounds(10, 42, 192, 80);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("회원");
		rd1.setFont(new Font("돋움체", Font.PLAIN, 12));
		rd1.setBounds(31, 28, 49, 23);
		panel1.add(rd1);
		gp1.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("비회원");
		rd2.setFont(new Font("돋움체", Font.PLAIN, 12));
		rd2.setBounds(101, 28, 61, 23);
		panel1.add(rd2);
		gp1.add(rd2);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(new LineBorder(Color.black,1),"음식 선택"));
		panel2.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel2.setBounds(10, 132, 418, 83);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JCheckBox ccb1 = new JCheckBox("한식");
		ccb1.setFont(new Font("돋움체", Font.PLAIN, 12));
		ccb1.setBounds(35, 34, 50, 23);
		panel2.add(ccb1);
		
		JCheckBox ccb2 = new JCheckBox("양식");
		ccb2.setFont(new Font("돋움체", Font.PLAIN, 12));
		ccb2.setBounds(135, 34, 50, 23);
		panel2.add(ccb2);
		
		JCheckBox ccb3 = new JCheckBox("일식");
		ccb3.setFont(new Font("돋움체", Font.PLAIN, 12));
		ccb3.setBounds(235, 34, 50, 23);
		panel2.add(ccb3);
		
		JCheckBox ccb4 = new JCheckBox("중식");
		ccb4.setFont(new Font("돋움체", Font.PLAIN, 12));
		ccb4.setBounds(335, 34, 50, 23);
		panel2.add(ccb4);
		
		JLabel lblNewLabel = new JLabel("음식 예약 시스템");
		lblNewLabel.setFont(new Font("돋움체", Font.BOLD, 12));
		lblNewLabel.setBounds(161, 10, 104, 24);
		contentPane.add(lblNewLabel);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String guest = "";
				String msg1="";
				if(rd1.isSelected() == true) {
					guest = rd1.getName();
//						System.out.println("회원");
					msg1 = "회원";
				}
				else {
					guest = rd2.getName();
//						System.out.println("비회원");
					msg1 = "비회원";
				}
// =================================================			
				int t = cb1.getSelectedIndex();
//					System.out.println(timelist[t]);
// =================================================
				String order = "";
				String msg2="";
				String ordermsg[]  = {"한식", "양식", "일식", "중식"};
				for (int f =0; f<ordermsg.length; f++) {
					
				
				if(ccb1.isSelected() == true) { 
					order = ccb1.getName();
//					System.out.println("한식");
//					msg2="한식";
				}
				else if (ccb2.isSelected() == true) { 
					order = ccb2.getName();
//					System.out.println("양식");
//					msg2="양식";
				}	
				else if (ccb3.isSelected() == true) { 
					order = ccb3.getName();
//					System.out.println("일식");
//					msg2="일식";
				}
				else if (ccb4.isSelected() == true) { 
					order = ccb4.getName();
//					System.out.println("중식");
//					msg2="중식";
					msg2 = ordermsg[f];
				}
				}
				SimpleDateFormat format1 = new SimpleDateFormat("yy.MM.dd HH:mm");
				Date time = new Date();
				String now = format1.format(time);

				lb3.setText("    " + msg1 + "님 "+ now +"로 부터 " + timelist[t] +"에 "+ msg2 + " 예약 되었습니다.");
			}
		});

		
	}
}
