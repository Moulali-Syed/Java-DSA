package theory;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		System.out.println("Hello WOrld");
//		System.out.println(args[0]);

		// primitives
		int rollNo = 64;
		char letter = 'r';
		float marks = 21.2f;
		double largeDecimal = 2323.23;
		long largeInteger = 123238833L;
		boolean check = false;
		// primitve which we can not break into any other datatype
		// STring - can be break into char so not a primitive datatype

		// still we have classes for the primitve datatypes , for greater control of
		// manipulation
//		Integer no=63;

		// read input and print it
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = (sc.nextInt());
		System.out.println("your number is " + num);
		
		int n = 123_902_678;

	}

}
//************************************************************************************************

//public means can be accessed from anywhere
//in java it is convention that we must have a main function
//************************************************************************************************

//class - group of methods
//************************************************************************************************

//main is method name - it is reserved java always looks for it , it is entry point for java program
//so we make it public
//main method is part of the Demo01 class
//it shouldnot depend on object so we made it static
//args[0] can be passed at run time - java Demo01.java 30

//if file name is Demo01 then class Name must be Demo01
//************************************************************************************************

//System is a class has a variable called out , which has a method println
//println - adds new line
//print - no new line added
//************************************************************************************************
//read input from keyboard

//************************************************************************************************

//package - consists of java files , like folder

//************************************************************************************************
//convert java code to byte code

// in cmd write cd C:\Testing\Java-DSA\JavaCoding\src\theory\
//then javac FileName.java
//now we can go to the path C:\Testing\Java-DSA\JavaCoding\src\theory\ and see we will get fileName.class file generated
//thus its converted to byte code
//now we can run
//java Demo01.java