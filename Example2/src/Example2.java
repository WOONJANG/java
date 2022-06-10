
public class Example2 {
   
	private int val1; // pc
	private int val2; // user
	private String msg; //결과 메세지
	
   public void ex22 (int pc, int user) { //setter (인수값 O)
      
	   this.val1 = pc;
	   this.val2 = user;
	   
	   if (this.val1 > this.val2) {
		   this.msg = "UP";
	   }
	   else if (this.val1 < this.val2) {
		   this.msg = "DOWN";
	   }
	   else if (this.val2 > 10 || this.val2 < 1) {
		   this.msg = "1 ~ 10만 입력";
	   }
	   else {
		   this.msg = "정답";
		   
	   }
   }

  
   public String result() {  //getter ( 인수값X) return
	   return this.msg;
   }
}