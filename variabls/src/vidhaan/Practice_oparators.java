package vidhaan;

public class Practice_oparators{
	
public static void main(String[] args) {
	int a=4,b=5,d=9,n=3,m=4,c=a+b;
	
	System.out.println(c);
	a+=5;
	System.out.println(a);
	a++;
	System.out.println(a);
	b-=5;
	System.out.println(b);
	b--;
	System.out.println(b);
	d*=2;
	System.out.println(d);
	n%=15;
	System.out.println(n);
	m/=2;
	System.out.println(m);
	
	int x=8,y=5,z=2;
	/*if(x>y||z>x) {
		System.out.println("at least one condition is true");
	}
	else {
		System.out.println("neigther condition is true");
	}*/
	
	boolean result=(x>y||z>x);
	System.out.println(result);
	
	boolean result1=(x>y&&z<y);
	System.out.println(result1);
	
	//boolean result2=(x>y!=z>y);
	//System.out.println(result2);
	
	if(x<y || y>z) {
		System.out.println("condition is pass");
	}
	else {
		System.out.println("condition is not pass");
	}
}
}
