package java_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test2 {

	public static void main(String[] args){
/*[응용문제]
 {"사과=2", "양파=1", "마늘=1", "파=1", "참치캔=6", "라면=8"}
 각각의 개당 가격이 있습니다.
 해당 장바구니는 갯수만큼 전체 값을 계산하여 총 결제할 금액을 출력하는 프로그램을 작성하시오.
 각 개당 가격
 사과 250
 양파 200
 마늘 700
 파 2300
 참치캔 1100
 라면 850 
 
 결과 출력
 "구매 하시고자 하는 총 결제 금액은 17100원 입니다.
 */
		basket b = new basket();
		b.basket_data();
		System.out.println("구매 하시고자 하는 총 결제 금액은 " + b.total + "원 입니다.");
	}
}

class basket extends test2_data{
	static int total = 0;
	public void basket_data() {
		String goods[] =  {"사과=2", "양파=1", "마늘=1", "파=1", "참치캔=6", "라면=8"};

		for (int f = 0; f < goods.length; f++) {
			goods[f].split("=");
			System.out.println(goods[f]);
		}
	}
}