package navya;

public class IFNESTED {
	public static void main(String[] args) {
		String student="navya";
		int marks=31;
		
		if(marks>0&& marks<=30) {
			System.out.println("Navya is Fail");
		}
			
		else if (marks>=31 && marks<=50) {
			System.out.println("Navya grade is C");
		} 
		else if (marks>=51 && marks<=80) {
			System.out.println("Navya grade is B");
			
		}
		else if (marks>=81 && marks<=100) {
			System.out.println("Navya grade is A");
			
		}
		else {
			System.out.println("wants more improvement");
		}
		
	}

}
