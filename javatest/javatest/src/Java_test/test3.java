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
		contentPane.setFont(new Font("돋움체", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("캠핑장 예약 시스템");
		title.setBounds(10, 24, 113, 15);
		contentPane.add(title);
		
		JLabel roadingmsg = new JLabel("잠시만 기다려 주십시오...");
		roadingmsg.setBounds(10, 417, 181, 15);
		contentPane.add(roadingmsg);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(10, 387, 302, 23);
		contentPane.add(progressBar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(Color.black,1),"확인 및 입금하실 금액"));
		panel_3.setVisible(false);
		panel_3.setBounds(10, 432, 468, 90);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel result = new JLabel("");
		result.setBounds(52, 23, 356, 57);
		panel_3.add(result);
		
		JButton ok_btn = new JButton("예약하기");
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
							result.setText("일자 및 장소 : 성인 : %d 청소년 %d \n총 입금하실 금액 %d");
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
		
		JButton close_btn = new JButton("종료");
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
		panel.setBorder(new TitledBorder(new LineBorder(Color.black,1),"캠핑 장소를 선택해주세요"));
		panel.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.setBounds(10, 49, 468, 83);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("남양주");
		rd1.getName();
		rd1.setBounds(39, 37, 115, 23);
		panel.add(rd1);
		gp1.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("충북음성");
		rd2.getName();
		rd2.setBounds(170, 37, 115, 23);
		panel.add(rd2);
		gp1.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("춘천");
		rd3.getName();
		rd3.setBounds(327, 37, 115, 23);
		panel.add(rd3);
		gp1.add(rd3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(Color.black,1),"인원수를 입력하세요"));
		panel_1.setBounds(10, 163, 468, 90);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lb1 = new JLabel("성인");
		lb1.setBounds(33, 38, 37, 15);
		panel_1.add(lb1);
		
		JLabel lb2 = new JLabel("청소년(만 10세 이상)");
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
		panel_2.setBorder(new TitledBorder(new LineBorder(Color.black,1),"캠핑 날짜 입력"));
		panel_2.setBounds(10, 295, 468, 90);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lb3 = new JLabel("캠핑일자");
		lb3.setBounds(39, 35, 50, 15);
		panel_2.add(lb3);
		
		date = new JTextField();
		date.setBounds(140, 32, 96, 21);
		panel_2.add(date);
		date.setColumns(10);
//		consume;
		
		JLabel lb4 = new JLabel("예시) 2022-06-24");
		lb4.setBounds(265, 35, 109, 15);
		panel_2.add(lb4);
		

		

		

		

	}
}
