package frist_class;

public class Static {
	static String name;
	static String mothername;
	static String fathername;
	static String husname;
	public static void main(String[] args) {
	 Static.name="navya krishna ";
	 System.out.println(name);
	 Static.name="deshamchetty mahesh";
	 Static.mothername="bharathi";
	 System.out.println(mothername);
	 Static.fathername="mahesh";
	 System.out.println(fathername);
	 Static.husname="sharath";
	 System.out.println(husname);
	
	 
	
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
