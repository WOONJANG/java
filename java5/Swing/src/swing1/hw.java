package swing1;

import java.util.Arrays;

public class hw {

   public static void main(String[] args) {
      /*
       * Ư������ abstract �̿� ������ 8�� ����� ��� ���� ������� return�� �޾� ���ο��� ��µǵ��� ��.
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