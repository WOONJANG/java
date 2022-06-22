import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {
		/*[응용문제]
		 * data a = { "hong45", "lee90", "kang100", "park70", "kim72" };f
		 * 해당 배열 데이터 값을 main2라는 메소드로 값을 던집니다.
		 * 해당 값을 던질 때 예외처리를 무조건 발생 시켜야 하며,
		 * 최초값을 던질 때는 가공없이 던지게 됩니다.
		 * main2에서는 해당 배열 값을 받은 후 해당 점수를 모두 합산 한 결과가 나와야합니다
		 * 단, 숫자 변환시 문제가 발생할 경우 finally로 체크 후 main2 메소드로 호출하여 정상적으로 데이터가 나오도록 하십시오.
		 */
		String data[]  = { "hong45", "lee90", "kang100", "park70", "kim72" };
		Exception3 ex3 = new Exception3();
		try {
			ex3.main2(data);
		}catch(Exception ee) {
			System.out.println(ee);
		}finally {
			ArrayList<String> rdata = new ArrayList<String>();
			String modify;
			for (int f = 0; f <=data.length; f++) {
				modify = data[f].replaceAll("[a-zA-z]", "");
				rdata.add(modify);
			}
			String cdata[] = new String[rdata.size()];
			int qq= 0;
			do {
				cdata[qq]= rdata.get(qq);
				qq++;
			}while(qq<rdata.size());
			try {
				ex3.main2(cdata);
			}catch(Exception z) {
				// printStackTrace() : 사용금지
				if(z.getMessage() == null)
				System.exit(0);
			}
		}
	}
	public void main2(String aa[]) throws Exception {
		
		int total = 0;
		for (int f =0; f < aa.length; f++) {
			String q = aa[f].replaceAll("[a-zA-z]", "");
			int w = Integer.parseInt(q);
			total += w;
		}
		System.out.println(total);
		Exception z = new Exception();
		throw z;
	}
}