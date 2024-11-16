package frist_class;

public class Nested_if {
	static String student="navya";
	static int marks=55;
	public static void main(String[] args) {
		
		if (student.equalsIgnoreCase("marks are 30 between 50")) {
			if (marks<30 && marks>=30) {
				System.out.println("navya student is fail");
			}
				else if (marks>30&&marks<=50) {
					System.out.println("navya grade is C");
			}
				else if (student.equalsIgnoreCase("navya marks are 50 between 100 ")) {
					if (marks >50&&marks<=80) {
						System.out.println("navya grade is B");
						
					}
					else if (marks>80&&marks<=100) {
						System.out.println("navya grade is A");
					}
					else {
						System.out.println("she wants to improvement");
					}
					
				}
		}
	}
}
		


