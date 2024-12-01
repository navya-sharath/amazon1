package vidhaan;

public class Practice_variables {
	static String name="navya";
	//static String lastname="krishna";
	static int age;
	static long phonenumber=9820446122l;
	static void height (float height) {
		System.out.println(height);
	}
	 public void weight() {
		 double weight=51.25;
		 System.out.println(weight);
	 }
	 public void friend(String colour,char grade) {
		 
		 System.out.println(colour+" "+grade);
	 }
	public void friend () {
		char grade='B';
		String colour="white";
		//System.out.println(grade+" "+colour);
	}
	

public static void main(String[] args) {
	System.out.println((Practice_variables.name));
	 String lastname="krishna";
	System.out.println(lastname);
	System.out.println((Practice_variables.age=28));
	long phonenumber=9820446122l;
	System.out.println(phonenumber);
	Practice_variables.height(5.1f);
	Practice_variables pv=new Practice_variables();
	pv.weight();
     pv.friend("black",'A');
     pv.friend();
    
	
}
}
