
public class Example22 {

   private int user_input;
   private int pc_num;
   public boolean bb = false;
   
   public void ex2 (int a, int b) {
      
      this.user_input= a;
      this.pc_num = b;
      
      if (this.pc_num > this.user_input) {
         System.out.println("UP");
      }
      else if (this.pc_num < this.user_input) {
         System.out.println("DOWN");
      }
      else if (this.user_input > 10 || this.user_input < 1) {
         System.out.println("1 ~ 10 ������ ���ڸ� �Է����ּ���.");
      }
      else {
         System.out.println("����");
         bb = true;
      }

   }

}