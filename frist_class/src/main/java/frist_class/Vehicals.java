package frist_class;

public class Vehicals extends Astracts{

	@Override
	public void car() {
		System.out.println("car is driving");
	}

	@Override
	public void bicycle() {
		System.out.println("bicycle is pedling");
		
	}

	@Override
	public void plane() {
		System.out.println("plane is flying");
	}
     public static void main(String[] args) {
    	 Vehicals v = new Vehicals();
    	 v.car();
    	 v.bicycle();
    	 v.plane();
		}
		
	}


