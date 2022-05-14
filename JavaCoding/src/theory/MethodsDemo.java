package theory;

import java.util.Scanner;

public class MethodsDemo {

	public static int add() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number one");
		int a = sc.nextInt();
		System.out.println("Enter a second number ");
		int b = sc.nextInt();
		return (a + b);
	}

	static String greet(String name) {
		return "hello " + name;
	}

	static void swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("the value of n1 is :" + n1 + "the value of n2 is : " + n2);
	}

	public static void main(String[] args) {

		int sum = add();
		System.out.println(sum);
		String greet = greet("Apple");
		System.out.println(greet);

		swap(2, 3);
	}

}

//In java we have only pass by value , no pass by reference