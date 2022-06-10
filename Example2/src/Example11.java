import java.util.Random;
import java.util.Scanner;

public class Example11 {

   public static void main(String[] args) {
      
	  Example22 ex = new Example22();   
      
      Scanner sc = new Scanner(System.in);
         
      Random rn = new Random(); //랜덤


      int rd = rn.nextInt(10)+ 1;
      System.out.println(rd); //랜덤값
      String msg;
      int user_input;
      
      int re; // 기회 
      for(re = 5; re > 0; re--) {
         msg = "총 기회가 "+ re +"번 남았습니다. 1 부터 10 까지 번호 중 한개를 입력해주세요.";
         
         if (ex.bb == false && re > 0 ) {
            System.out.println(msg);
            user_input = sc.nextInt();
            ex.ex2(user_input, rd);
         }
         
         else if (ex.bb == false && re == 0) {
            msg = "실패";
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