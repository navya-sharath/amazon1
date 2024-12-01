package vidhaan;

public class Practice_nested {
	
	public static void main(String[] args) {
		int age=110;
		
		if(age>=1 && age<=17) {
			System.out.println("these age are childrens");
		}
		else if (age>=18 && age<=25) {
			System.out.println("these age are teenagers");
		}
		else if (age>=26 && age<=40) {
			System.out.println("these age are middle ages");
		}
		else if (age>=41 && age<=55) {
			System.out.println("these age are oldage");
		}
		else if (age>=56 && age<=100) {
			System.out.println("these age are seniours ");
		}
		else if (age>+101 ) {
			System.out.println("people are death");	
		}
		else {
			System.out.println("could you please enter age ");
		}
	}

}
