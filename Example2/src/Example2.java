
public class Example2 {
   
	private int val1; // pc
	private int val2; // user
	private String msg; //��� �޼���
	
   public void ex22 (int pc, int user) { //setter (�μ��� O)
      
	   this.val1 = pc;
	   this.val2 = user;
	   
	   if (this.val1 > this.val2) {
		   this.msg = "UP";
	   }
	   else if (this.val1 < this.val2) {
		   this.msg = "DOWN";
	   }
	   else if (this.val2 > 10 || this.val2 < 1) {
		   this.msg = "1 ~ 10�� �Է�";
	   }
	   else {
		   this.msg = "����";
		   
	   }
   }

  
   public String result() {  //getter ( �μ���X) return
	   return this.msg;
   }
}