package Ex;

public class Example6 {

	public static void main(String[] args) {
		/*
		 *abstract�� �̿��Ͽ� ������ 8�� ����� ��� ���� ������� return �޾� ���ο��� ��� �ǵ����մϴ�. 
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