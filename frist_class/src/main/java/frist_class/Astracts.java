package frist_class;

public abstract class Astracts {
	public abstract void car();
	
	public abstract void bicycle();
	public abstract void plane();
	private static  void truck() {
		System.out.println("truck is driving" );
	}
	
public static void main(String[] args) {
	
	Astracts.truck();
	
}
}
