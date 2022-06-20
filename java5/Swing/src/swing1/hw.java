package swing1;

import java.util.Arrays;

public class hw {

   public static void main(String[] args) {
      /*
       * 특강문제 abstract 이용 구구단 8단 결과를 모두 더한 결과값을 return을 받아 메인에서 출력되도록 함.
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