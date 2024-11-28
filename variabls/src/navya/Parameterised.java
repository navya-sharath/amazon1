package navya;

public class Parameterised {
	public static void static_parameter(int a,int b) {
		System.out.println(a+b);
	}
		
		public static void non_parameter(int x,int y) {
			
		
         System.out.println(x-y);
		
		
	}
		public void nonstatic_nonparameterized() {
			int s=45;
			int p=67;
			System.out.println(s*p);
			
			
		
		}
		public void nonstatic_paramereter(int m,int n){
			System.out.println(m-n);
			
		}
		public static void parameterized(String name,String animal) {
			System.out.println(name);
			System.out.println(animal);
		}
		
		
	public static void main(String[] args) {
		Parameterised.static_parameter(5, 6);
		Parameterised.static_parameter(8, 9);
		Parameterised pt = new Parameterised();
		pt.nonstatic_nonparameterized();
		Parameterised pa=new Parameterised();
		pa.nonstatic_paramereter(10, 50);
		Parameterised.parameterized("vidhaan","shimba");
		
		
		
		
	}

}
