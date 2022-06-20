package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import javax.swing.JLabel;

public class swing8 extends JFrame {
	public JProgressBar installbar = null;
	public JLabel lb = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
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
	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.installbar = new JProgressBar();
		this.installbar.setForeground(Color.MAGENTA);
		this.installbar.setStringPainted(true);
		this.installbar.setFont(new Font("����ü", Font.PLAIN, 12));
		this.installbar.setBounds(10, 36, 418, 25);
		contentPane.add(installbar);
		
		this.lb = new JLabel("\uB2E4\uC6B4\uB85C\uB4DC \uC644\uB8CC");
		this.lb.setFont(new Font("����ü", Font.PLAIN, 12));
		this.lb.setBounds(179, 71, 78, 15);
		contentPane.add(lb);
		
		// swing program�� �۵� �� �ش� method�� 1�� ��(64line) ���� �ǵ��� ������
		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				
				pstart();
				

			}
		};
		t.schedule(task, 1000);
		
	}
	
	public void pstart() {
		int w=0;
		try {
			while(w <= 100) {
				if (this.installbar.getValue() == 100) {
					this.lb.setText("�ٿ�ε� �Ϸ�");
				}
				}
			this.installbar.setValue(w); // setValue : �ش� �⺻���� ����
			w++;
			Thread.sleep(300);

		
		}catch(Exception k) {
			System.out.println("ERROR");
		}
		
		
}


	}












