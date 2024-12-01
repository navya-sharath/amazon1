package vidhaan;

import java.util.Scanner;

public class Practice_scanner {
	public static void main(String[] args) {
		String name;
		int age;
		float height;
		int num;
		System.out.println("could you please enter your name");
		Scanner sc=new Scanner(System.in);
		String nam=sc.next();
		System.out.println(nam);
		System.out.println("please enter your age ");
		int enter=sc.nextInt();
		System.out.println(enter);
		System.out.println("please enter your height");
		float heightnumber=sc.nextFloat();
		System.out.println(heightnumber);
	System.out.println("please select below numbers");
	System.out.println("please select 1");
	System.out.println("please select 2");
	System.out.println("plaase select 3");
	int select=sc.nextInt();
	System.out.println(select);
	
	}

}
