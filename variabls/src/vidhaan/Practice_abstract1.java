package vidhaan;

public class Practice_abstract1 extends Practice_abstract{

	@Override
	public void lakeme(String colour) {
		System.out.println(colour);
		
	}

	@Override
	public void lakeme1(String producttype) {
		System.out.println(producttype);
		
	}

	@Override
	public void facewash(String name, int howmuch) {
	System.out.println(name+" "+howmuch);
		
	}
	public static void main(String[] args) {
		Practice_abstract1 pa=new Practice_abstract1();
		pa.lakeme("light shade");
		pa.lakeme1("lipstick");
		pa.facewash("channel",  2);
	}

	

}
