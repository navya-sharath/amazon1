package navya;

public class Return_type {
	public static String method1() {
		String name="vidhaan";
		return name;
	}
	static int method2() {
		int a=2,b=12,c;
		
		return c=a+b; 
	}
	
	
	
	public static void main(String[] args) {
		String fname=method1();
		System.out.println(fname);
		int num=method2();
		System.out.println(num);
	}
		
	}
