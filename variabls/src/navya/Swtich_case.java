package navya;

public class Swtich_case {
	public static void main(String[] args) {
		
	
	String colour="blue";
	switch(colour){
	case"orange":
	System.out.println("print orange");
	case"red":
		System.out.println("print red");
	break;
	case"blue":
		System.out.println("print blue");
	break;
	case "black":
		System.out.println("print black");
		
	
		
	}
	String atm="cash withdraw";
	switch (atm) {
	case"pincode":
		System.out.println("enter the pincode");
		break;
	case"cash withdraw":
		System.out.println("enter pincode navigate to withdraw");
		break;
	case"savings account":
		System.out.println("select withdraw navigate to enter amount");
		break;
	case"enter amount":
		System.out.println("enter amount finally collect the amount");
		//default;
		//System.out.println("please give proper information");
	}

}
}
