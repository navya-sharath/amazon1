package vidhaan;

import navyakrishna.Practice_Acessmodifers;

public class Practice_statickeyword extends  {
	 Practice_statickeyword (String name, int num){
		 System.out.println(name+num); 
	 }
	Practice_statickeyword(int num, String name){
		System.out.println(num+name);
	}
	Practice_statickeyword(int num,String name,char grade){
	System.out.println(num+name+grade);
	}
	public static void main(String[] args) {
		Practice_statickeyword ps = new Practice_statickeyword("navya" ,28);
		Practice_statickeyword ps1=new Practice_statickeyword(6, "vidhaan", 'A');
		Practice_statickeyword ps2=new Practice_statickeyword(4, "mahesh");
		
		
	}
	}


