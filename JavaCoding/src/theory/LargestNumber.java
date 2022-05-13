package theory;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		/*
		 * Method-1
		//find largest of 3 numebers
		if(a>b) {
			if(a>c) {
				System.out.println(" a is greater "+a);
			}
		}else if(b>c) {
			System.out.println("b is gretaer "+ b);
		}else {
			System.out.println("c is greater "+c);
		}
*/
		
		/*
		 * Method -2
		
		int max =a;
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println("max number is "+max);
		*/
		
		int max = Math.max(c,Math.max(a, b));
		System.out.println(max);
	}

}
