package navya;

import navyakrishna.Practice_Acessmodifers;

public class String_Builder extends Practice_Acessmodifers{
	public static void main(String[] args) {
		String str="madam";
			
			StringBuilder bf = new StringBuilder(str);
			bf.
			String name=bf.reverse().toString();
			 
			 if(str.equals(name)) {
				 System.out.println(str+" is palindrome" );
			 }
			 else  {
				 System.out.println(str+" is not palindrome");
			 }
			/* String name="sir";
			 for(int i=0;i<name.length();i++) {
				 
			 }
			 StringBuilder fb=new StringBuilder(name);
			
			 System.out.println( fb.reverse());
			
			 if(name.equals(fb)) {
				 System.out.println("sir is not palindrome");
				 
			 }
			 else {
				 System.out.println("sir is not palindrome");
			 }*/
	}
	
	
	


}

