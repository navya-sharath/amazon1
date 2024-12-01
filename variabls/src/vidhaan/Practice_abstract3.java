package vidhaan;

public class Practice_abstract3 extends Practice_abstract {

	@Override
	public void lakeme(String colour) {
		System.out.println(colour);
	}

	@Override
	public void lakeme1(String producttype) {
		System.out.println(producttype);
		
	}

	@Override
	public void facewash(String name,int howmuch) {
		System.out.println(name+" "+howmuch);
	}
	public static void main(String[] args) {
		Practice_abstract3 pab=new Practice_abstract3();
		pab.lakeme("dark shade");
		pab.lakeme1("contour");
		pab.facewash("cerave", 3);
		
	}
	

}
