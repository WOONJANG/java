package Ex;

public class Example6 {

	public static void main(String[] args) {
		/*
		 *abstract을 이용하여 구구단 8단 결과를 모두 더한 결과값을 return 받아 메인에서 출력 되도록합니다. 
		 */	
	      math mt = new math();
	      System.out.println(mt.gugudan());

	   }

	}

	class math {
	   int re;
	   int a = 8;
	   int b;

	   public int gugudan() {
	      int total = 0;

	      for (this.re = 1; this.re <= 9; this.re++) {
	         this.b = a * this.re;
	         total += this.b;
	      }
	      return total;
	   }
	}