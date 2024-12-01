package vidhaan;

public class Practice_if {
	public static void main(String[] args) {
		int age=78;
		String country="india";
		
		if(age>=18) {
			System.out.println("these people are adults");
			if(country.equals("USA")) {
				System.out.println("these people are eligible for vote");
				
			}
			else {
				System.out.println("these people are other country so these are not eligible for vote ");
			}
		}
		else {
			System.out.println("these people are not elegible for vote");
		}
		
	}

}
