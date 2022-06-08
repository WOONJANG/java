package App;

public class App2 {

	public static void main(String[] args) {
		
		
		

	}

}

class a12{
	
	private String a1[][];
	private String a2[] = new String[5];
	private String a3="";
	public boolean s123 = true;
	
	public a12(String c, String d) {
		
		String a[][] ={
			{"박은경","이경훈","장운","조기현","김진수"},
			{"80","78","92","67","40"},
			{"40","80","80","92","100"},
			{"95","30","55","90","65"},
			{"20","80","100","95","30"}
			};
		
		
		
		this.a1 = a;
		
		
		
		if(!c.equals("박은경")&&!c.equals("이경훈")&&!c.equals("장운")&&!c.equals("조기현")&&!c.equals("김진수")) {
			s123 = false;
		}
		

		if(d.equals("전체")) {
		all(c,d);
		a5();
		}
		
		else if(d.equals("국어")||d.equals("수학")||d.equals("과학")||d.equals("역사")) {
		sel(c,d);
		a4();
		}
		
		else {
			
		}
		
		
		
		
	}
	public void all(String e,String f) {
		int w = 0;
		int aea = a1[0].length; // 5개
		
		while(w<aea) {
				
				if(e.equals("박은경")) {
					this.a2[w] = a1[w][0];
				}
				else if(e.equals("이경훈")) {
					this.a2[w] = a1[w][1];
				}
				else if(e.equals("장운")) {
					this.a2[w] = a1[w][2];
				}
				else if(e.equals("조기현")) {
					this.a2[w] = a1[w][3];
				}
				else if(e.equals("김진수")) {
					this.a2[w] = a1[w][4];
				}
				
			
			w++;
			}
			
	}
	
	public void sel(String e,String f) { // e 학생이름 // f 과목
		int w = 0;
		int aea = a1[0].length; // 5개
		
		while(w<aea) {
			
			if(e.equals("박은경")) {
				this.a2[w] = a1[w][0];
			}
			else if(e.equals("이경훈")) {
				this.a2[w] = a1[w][1];
			}
			else if(e.equals("장운")) {
				this.a2[w] = a1[w][2];
			}
			else if(e.equals("조기현")) {
				this.a2[w] = a1[w][3];
			}
			else if(e.equals("김진수")) {
				this.a2[w] = a1[w][4];
			}
			
		
		w++;
		}
		
		switch(f) {
		
		case "국어" ->{
			this.a3 = a2[1];
		}
		case "수학" ->{
			this.a3 = a2[2];
		}
		case "과학" ->{
			this.a3 = a2[3];
		}
		case "역사" ->{
			this.a3 = a2[4];
		}
		
		
		
		}
			
			
	}
	
	
	public String[] a5() { //전체 리턴
		String a123[] = this.a2;
		return a123;
	}
	public String a4() { // 별개 과목 리턴
		String a123 = this.a3;
		return a123;
	}

	}