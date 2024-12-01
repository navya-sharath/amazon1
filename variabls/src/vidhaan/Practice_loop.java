package vidhaan;

public class Practice_loop {
	public static void main(String[] args) {
		//increment
		int i;
		for( i=0;i<5;i++) {
			System.out.println(i);
		}
		//decrement
		for(int z=10;z>0;z--) {
			System.out.println(z);
		}
		//even number
		for(int x=0;x<20;x++) {
			if(x%2==0)
			System.out.println(x);
		}
		//odd numbers
		for(int y=1;y<=30;y+=2) {
			System.out.println(y);
		}
		//polindrome
		String name="navya";
		String reverse="";
		
	for(int s=name.length()-1;s>=0;s--) {
		reverse=reverse+name.charAt(s);
		//System.out.println(reverse);
	}
	System.out.println(reverse);
	
	//foreach loop
	String[] colours= {"red","blue","green"};
	for(String colour:colours) {
		System.out.println(colour);
		
	}
	//while loop
	int k=1;
	while(k<=10) {
		if(k%2==0) {
			System.out.println(k);
			
		}
		k++;
	}
		
	}
}
		
	