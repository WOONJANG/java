package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JLabel msg;
	private JTextField tel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		msg = new JLabel("");
		msg.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBounds(30, 41, 373, 21);
		contentPane.add(msg);
		
		
		JButton btnNewButton = new JButton("인증번호 받기");
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(285, 9, 118, 23);
		contentPane.add(btnNewButton);
		
		tel = new JTextField();
		tel.addKeyListener(new KeyAdapter() {	// addKeyListener : 키를 누를 경우 적용되는 이벤트 class 
			// keyPressed : 키를 누를 때.
			// keyReleased : 키를 눌렀다가 up이 됐을 때.
			// keyTyped : 키 문자를 입력 받을 때.
			@Override
			public void keyTyped(KeyEvent k) {
				// 입력 값에 대한 자리수 한계치 설정
				int i = tel.getText().length();
				if(i > 11) {
					k.consume();
				}
				
			//	System.out.println(k.getKeyChar()); 
			//	System.out.println(k.getKeyCode());
				int n = Integer.valueOf(k.getKeyChar());	// 아스키 코드로 변경됨.
				System.out.println(n);
				if(n >= 48 && n <= 57) { // sysout에는 정상적인 문자 getKeyChar()로 보이지만 Integer.valueOf()로 변경시 아스키 코드로 변경된다. 0 = 48 ~ 9 = 57
					msg.setText("!!!");
				}
				else {
					if(!Character.isDigit(n)) {
//					msg.setText("숫자만 입력 하세요.");
					k.consume(); // keyTyped를 이용 consume는 해당 입력시 null로 간주함.
					return;
					}
				}
			}
		});
		tel.setBounds(30, 10, 245, 21);
		contentPane.add(tel);
		tel.setColumns(10);
	}

}
