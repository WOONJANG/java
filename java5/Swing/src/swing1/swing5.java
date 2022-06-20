package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class swing5 extends JFrame { 

	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
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
	public swing5() {
		/* Frame을 absolute 형태로 layer를 변경 합니다.*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		mid = new JTextField();
		mid.setFont(new Font("돋움체", Font.PLAIN, 12));
		mid.setBounds(169, 29, 96, 30);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(30, 131, 381, 21);
		contentPane.add(msg);
		
		JButton btnNewButton = new JButton("아이디 체크");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btnNewButton.setBounds(169, 69, 96, 30);
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.black);
		contentPane.add(btnNewButton);
		/* 핸들링 class가 object 보다 상위 코드에 있으면 해당 오브젝트를 load하지 못한다. */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mid.getText().equals("")) {
					msg.setText("아이디를 입력하세요");
				}
				else {
					int lg = mid.getText().length();	// 입력 문자 갯수
					if(lg < 5) {
						msg.setText("ID는 5자 이상만 사용 가능합니다.");
					}
					else {
						msg.setText("ID 검토 중 입니다...");
					}
						
				}
			}
		});
	}
}
