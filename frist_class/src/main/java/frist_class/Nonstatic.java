package frist_class;

public class Nonstatic {
	 int a;
	public static void main(String[] args) {
		Nonstatic nst=new Nonstatic();
		nst.a=30;
		System.out.println(nst.a);
		Nonstatic nst2=new Nonstatic();
		nst2.a=45;
		System.out.println(nst2.a);
		Nonstatic nst3=new Nonstatic();
		nst3.a=99;
		System.out.println(nst3.a);
		

		}
  
}
