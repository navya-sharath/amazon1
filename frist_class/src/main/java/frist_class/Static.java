package frist_class;

public class Static {
	static String name;
	static String mothername;
	static String fathername;
	public static void main(String[] args) {
	 Static.name="navya krishna ";
	 System.out.println(Static.name);
	 Static.name="deshamchetty mahesh";
	 Static.mothername="bharathi";
	 System.out.println(Static.mothername);
	 Static.fathername="mahesh";
	 System.out.println(Static.fathername);
	
	 
	
	}
	static {
		mothername="bharathi mahesh";
		System.out.println(mothername);
		
	}
	static {
		fathername="desamchetty krinayachetty";
		System.out.println(fathername);
	}

}
