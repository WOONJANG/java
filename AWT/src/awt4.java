
public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java¿Í ¿¬°è
		
		decorate de = new decorate();
		de.view();
		
	}

}

class decorate extends awt4_class {
	public String result = "";
	
	public void cal_btn_push(int c) {
		System.out.println(c);
		for(int f=1; f<=9; f++) {
			this.result += c + " * " + f + " = " + (c*f) + "\n";
		}
	}

	public String calls() {
		return this.result;
	}
	
}