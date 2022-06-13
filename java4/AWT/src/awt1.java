import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {


	public awt1() {
	}
	
	public static void main(String[] args) {
		//Frame > Bound > Object
		Frame fr = new Frame(); // â
		
		fr.setTitle("AWT ���� ȭ��");
		fr.setVisible(true);
		fr.setLayout(null);	// �г��� ��� ���ϱ����� null
		fr.setBounds(800, 300, 500, 500); // (x��, y��, ����ũ��, ����ũ��)
		
		Button bt = new Button("Ŭ��");
		Button closebt = new Button("�ݱ�");
		Label msg = new Label("");
		
		bt.setBounds(40, 40, 100, 30);
		bt.setBackground(Color.blue);
		closebt.setBounds(160, 40, 100, 30);
//		msg.setBackground(Color.red); // msg ��� ��ġ Ȯ�� //setBackground(Color.����)
		msg.setBounds(40, 100, 300, 30);
		
		// Object�� Frame�� ����
		fr.add(bt);
		fr.add(closebt);
		fr.add(msg);
		//addActionListener(��ư) : event method ��, this.��� ���� �ȵ�
		closebt.addActionListener(new ActionListener() { //new ActionListener() : Override �޼ҵ� �ڵ�����
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		bt.addActionListener(new ActionListener() {
			
			String a = "ȫ�浿"; //addActionListener : event method field�� String�� ����
			@Override
			public void actionPerformed(ActionEvent e) {
//				msg.setText("AWT ó������?����"); 
				msg.setText(this.a);	// this.�� �̿��Ͽ� �ڵ鸵 ������
				
			}
		});
		
		
	}

}
