package frist_class;

public class Stringmethod {
	public static void main(String[] args) {
		String name="navya";
		String uppercase=name.toUpperCase();
		System.out.println(name.toUpperCase());
		
		String animal="Lion";
		String lowercase=animal.toLowerCase();
		System.out.println(animal.toLowerCase());
		
		String birds="crow";
		int lenght=birds.length();
		System.out.println(birds.length());
		
		String fname="navya krishna";
		boolean a=fname.contains(birds);
		System.out.println(a);
		
		
		String bags="kadespade";
		String sling="gucci";
		boolean z=bags.equals(sling);
		System.out.println(z);
		
		String brand="Tiffiny&co";
		String bands="tiffINY&CO";
		boolean b = brand.equalsIgnoreCase("Tiffiny&co");
		System.out.println(b);
		
		
		
		
	}


}
