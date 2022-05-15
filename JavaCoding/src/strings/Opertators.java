package strings;

import java.util.ArrayList;

public class Opertators {

	public static void main(String[] args) {
		System.out.println('a' + 'b');// 195
		System.out.println("a" + "b");// ab
		System.out.println('a' + 3);// 100
		System.out.println((char) ('a' + 3));// d

		System.out.println("a" + 1);// a1
		// integer will be converted to integer that will call toString()
		// this is same as after few steps "a"+"1"

		System.out.println("apple" + new ArrayList<>());// apple[]

		System.out.println("apple" + new Integer(56));// apple56

//		System.out.println(new ArrayList<>()+new Integer(56)); willgive error
		// atleast one element must be String , and works with primitives

	}

}
