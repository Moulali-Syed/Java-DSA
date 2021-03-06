package theory;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();

		System.out.println("apples".equals(fruit));

		// equals check only value but not reference
		// == checks value and reference

		int num1 = 10;
		int num2 = 10;
		System.out.println(num1 == num2);

		/*
		 * In switch statements you can jump to various cases based on your expression
		 * 
		 * Note: cases have to be same type as expressions , must be constant or literal
		 * duplicae case values are not allowed break is used to terminate the sequence
		 * if break is not used it will continue to next case default will execute when
		 * none of the above does if default is not at end put break after it
		 */

		switch (fruit) {
		case "Mango":
			System.out.println("king of fruits");
			break;
		case "Apple":
			System.out.println("red fruit");
			break;
		case "Grapes":
			System.out.println("Small fruit");
			break;
		default:
			System.out.println("Unknown fruit");
		}
		
		int empId = sc.nextInt();
		
		String dept = sc.next();
		switch(empId) {
		case 1:
			System.out.println("name");
			break;
		case 2:
			System.out.println("lastname");
		case 3:
			System.out.println("Emp number 3");
			switch(dept) {
			case "IT":
				System.out.println("IT department");
				break;
			case "CS":
				System.out.println("CSE");
				break;
			default:
				System.out.println("Unknown");
				
			}
			break;
		default:
			System.out.println("hello");
		}

	}

}
