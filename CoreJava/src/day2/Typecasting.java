package day2;

public class Typecasting {

	
	/*
	  integer to long - implicit   [low to high]
	  
	  long to integer - explicit   [high to low]
	 */
	public static void main(String[] args) {
		
		//implict type casting
		byte b=10;
		int i=b;
		
		char ch = 'c';
		int j = ch;
		System.out.println(j);
		
		
		//explicit type casting
		int x=100;
		byte y = (byte)x;
		
		int p=80;
		char q = (char)p;
		System.out.println(q);
		
		
		//explicit casting beyond range
		int k = 1209;
		byte l = (byte)k;
		System.out.println(l);//beyond byte range so gives some negative number
		
		
		
	}
	
	//identifiers
	
	
	
}
