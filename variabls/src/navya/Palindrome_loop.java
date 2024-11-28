package navya;

public class Palindrome_loop {
public static void main(String[] args) {
	String name="vidhaan";
	String rev="";
	 for(int i=name.length()-1;i>=0;i--) {
		 rev=rev+name.charAt(i);
		
		 
	 }
	 System.out.println(rev);
	
	
}
}
