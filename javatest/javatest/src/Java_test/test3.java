package Java_test;

import java.awt.*;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;

public class test3 extends JFrame {

	private JPanel contentPane;
	private JTextField ad;
	private JTextField ch;
	private JTextField date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setFont(new Font("����ü", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("ķ���� ���� �ý���");
		title.setBounds(10, 24, 113, 15);
		contentPane.add(title);
		
		JLabel roadingmsg = new JLabel("��ø� ��ٷ� �ֽʽÿ�...");
		roadingmsg.setBounds(10, 417, 181, 15);
		contentPane.add(roadingmsg);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(10, 387, 302, 23);
		contentPane.add(progressBar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(Color.black,1),"Ȯ�� �� �Ա��Ͻ� �ݾ�"));
		panel_3.setVisible(false);
		panel_3.setBounds(10, 432, 468, 90);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel result = new JLabel("");
		result.setBounds(52, 23, 356, 57);
		panel_3.add(result);
		
		JButton ok_btn = new JButton("�����ϱ�");
		ok_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				TimerTask task = new TimerTask() {
					
					@Override
					public void run() {
						
						pstart();
					}
				};

				
			}
			
			public void pstart() {
				int w=0;
				try {
					while(w <= 100) {
						if (progressBar.getValue() == 100) {
							result.setText("���� �� ��� : ���� : %d û�ҳ� %d \n�� �Ա��Ͻ� �ݾ� %d");
						}
						}
					progressBar.setValue(w);
					w++;
					Thread.sleep(600);

				
				}catch(Exception k) {
					System.out.println("ERROR");
				}
			}
		});
		ok_btn.setBounds(385, 395, 93, 23);
		contentPane.add(ok_btn);
		
		JButton close_btn = new JButton("����");
		close_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		close_btn.setActionCommand("close_btn");
		close_btn.setBounds(385, 532, 93, 23);
		contentPane.add(close_btn);
		
		ButtonGroup gp1 = new ButtonGroup();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(Color.black,1),"ķ�� ��Ҹ� �������ּ���"));
		panel.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.setBounds(10, 49, 468, 83);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("������");
		rd1.getName();
		rd1.setBounds(39, 37, 115, 23);
		panel.add(rd1);
		gp1.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("�������");
		rd2.getName();
		rd2.setBounds(170, 37, 115, 23);
		panel.add(rd2);
		gp1.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("��õ");
		rd3.getName();
		rd3.setBounds(327, 37, 115, 23);
		panel.add(rd3);
		gp1.add(rd3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(Color.black,1),"�ο����� �Է��ϼ���"));
		panel_1.setBounds(10, 163, 468, 90);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lb1 = new JLabel("����");
		lb1.setBounds(33, 38, 37, 15);
		panel_1.add(lb1);
		
		JLabel lb2 = new JLabel("û�ҳ�(�� 10�� �̻�)");
		lb2.setBounds(198, 38, 137, 15);
		panel_1.add(lb2);
		
		ad = new JTextField();
		ad.setBounds(84, 35, 59, 21);
		panel_1.add(ad);
		ad.setColumns(10);
		
		ch = new JTextField();
		ch.setBounds(345, 35, 65, 21);
		panel_1.add(ch);
		ch.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(Color.black,1),"ķ�� ��¥ �Է�"));
		panel_2.setBounds(10, 295, 468, 90);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lb3 = new JLabel("ķ������");
		lb3.setBounds(39, 35, 50, 15);
		panel_2.add(lb3);
		
		date = new JTextField();
		date.setBounds(140, 32, 96, 21);
		panel_2.add(date);
		date.setColumns(10);
//		consume;
		
		JLabel lb4 = new JLabel("����) 2022-06-24");
		lb4.setBounds(265, 35, 109, 15);
		panel_2.add(lb4);
		

		

		

		

	}
}
