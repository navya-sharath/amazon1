package navyakrishna;

import java.util.Scanner;

public class Java_Class {

	public static void main(String[] args) {
		int passcode=2508;
		int balance =5000;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter passcode");
		
		int pin=sc.nextInt();
		if(passcode==pin) {
			System.out.println("please select the below option");
			System.out.println("option 1 withdraw");
			System.out.println("option 2 balance enquery");
			System.out.println("option 3 deposit");
			System.out.println("option 4 money transfer");
			System.out.println("exit");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("please enter the withdrraw amount");
				int withdrawamount=sc.nextInt();
				if(withdrawamount>0 && withdrawamount<=balance){ 
					balance-=withdrawamount;
					System.out.println("your withdrawamount is"+balance );
				}
				else {
					System.out.println("your account is have insufficient balance ");
				}
				break;
			case 2:
				System.out.println("your currentamount is "+balance);
			break;
			case 3:
				System.out.println("please enter your amount of deposit" );
				int deposit=sc.nextInt();
				if(deposit>0) {
					balance+=deposit;
					System.out.println("your depositamount is"+balance);
					
				}
				else {
					System.out.println("your not successfull deposit");
				}
				break;
			case 4:
				System.out.println("please enter your details for money transfer");
				int MoneyTransfer=sc.nextInt();
				if(MoneyTransfer>0 && MoneyTransfer<=balance){
					MoneyTransfer-=balance;
					//MoneyTransfer2-=balance;
					System.out.println("your sucessfull transfer"+MoneyTransfer);
					System.out.println("your newbalance"+balance);
					
				}
				
				else {
					System.out.println("your deposit amount is not sucessful transfer");
				}
				
				
				break;
			case 5:
				System.out.println("exit");
				break;
			}
		}
		else {
			System.out.println("your passcode is wrong please enter valid passcode");
		
			}
		
		}
	}


	
			

