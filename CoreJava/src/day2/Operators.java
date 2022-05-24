package day2;

public class Operators {

	public static void main(String[] args) {

		
		//increment - pre , post [unary operators]
		int x=10;
		x++;
		++x;
		
		//decrement - pre post 
		int y=10;
		y--;
		--y;
		
		
		//arthimetic operators
		
		//+ , - , * , / , %
		
		//concatenation operator
		// +
		System.out.println("apple"+ "  "+"hello");
		
		//comparision operator
		// > , < , >=  , <=
		
		
		//bitwise operator
		/*
		 
		 &   , | , ^ - xor returns true if both arguments are different
		 
		 ~ - bitwise unary only applied to integer , it changes 0 to 1 , 1 to 0
		 */
		
		//short circuit operatos
		
	//x && y - when x is false it will not look what y is
		// x|| y -  when x is true it will not look what y is
		
		
		//assignment operator
		int a=10;
		int b,c,d;
		b=c=d =100;
		
		//+=, -=
		
		//terenary operator
		// condition ? "if true": "if false"
		
		int h=10,h1=20;
		String v = h>h1  ? "h is big":"h1 is big";
		
		int j = 16;
		System.out.println(j++);
		System.out.println(++j);
	}

}
