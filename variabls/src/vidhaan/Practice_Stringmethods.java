package vidhaan;

public class Practice_Stringmethods {
	static String mothername="NAVYA";
	
	public static void main(String[] args) {
		String name="vidhaan";
		String frdname="VIDHAAN";
		String uppercase=name.toUpperCase();
		System.out.println(uppercase);
		String lowercase=mothername.toLowerCase();
		System.out.println(mothername);
		boolean b=name.equals(mothername);
		System.out.println(b);
		boolean b1=name.equalsIgnoreCase(mothername);
		System.out.println(b1);
		
		String naMe="vidhaan";
		String NAME="VIDHAAN";
		boolean b2=naMe.equalsIgnoreCase(NAME);
		System.out.println(b2);
		int length=NAME.length();
		System.out.println(length);

		boolean b3=name.contains(frdname);
		System.out.println(b3);

}
}