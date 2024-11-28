package navya;

public class Constractor_java {
	 Constractor_java() {
		System.out.println("dgfrg");
	 }
	
	 Constractor_java(String name){
		 System.out.println(name);
		
	}
	 Constractor_java(int age){
		 System.out.println(age);
		 
	 }
	 Constractor_java(char grade){
		 System.out.println(grade);
		 
	 }
	 public static void main(String[] args) {
		 Constractor_java cj=new Constractor_java("navya");
		 Constractor_java cj1=new Constractor_java(23);
		 Constractor_java cj2= new Constractor_java('a');
		 
		 
	 }
	

}
