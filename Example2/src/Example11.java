import java.util.Random;
import java.util.Scanner;

public class Example11 {

   public static void main(String[] args) {
      
	  Example22 ex = new Example22();   
      
      Scanner sc = new Scanner(System.in);
         
      Random rn = new Random(); //����


      int rd = rn.nextInt(10)+ 1;
      System.out.println(rd); //������
      String msg;
      int user_input;
      
      int re; // ��ȸ 
      for(re = 5; re > 0; re--) {
         msg = "�� ��ȸ�� "+ re +"�� ���ҽ��ϴ�. 1 ���� 10 ���� ��ȣ �� �Ѱ��� �Է����ּ���.";
         
         if (ex.bb == false && re > 0 ) {
            System.out.println(msg);
            user_input = sc.nextInt();
            ex.ex2(user_input, rd);
         }
         
         else if (ex.bb == false && re == 0) {
            msg = "����";
            System.out.println(msg);
         }
         
         else {
            
            System.exit(0);
         }
         
      
         System.gc();
         
      }
      sc.close();
      
      
      
      
      
   }

}