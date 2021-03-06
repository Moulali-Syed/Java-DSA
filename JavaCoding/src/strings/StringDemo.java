package strings;

public class StringDemo {

	public static void main(String[] args) {
		int a = 10;// primitive stored in stack
		int[] arr = { 2, 31, 1, 6 }; // reference variable arr stored in stack , actual content in heap
		// any change thru arr will change the actual value in the array

		String name = "Apple Shimla";

		System.out.println(name);

		String c = "hi";
		String b = "hi";
		c="hello";
		System.out.println();

	}

}

/*
 * everything starts with capital letter is class - String is a class name is
 * reference variable "Apple Shimla" is object
 * 
 * String a = "hi"; String b="hi";
 * 
 * String pool: in above a will created in stack and points to heap memory in
 * which we have string pool when b is created in stack it will check if there
 * exists a value assigned to it in string pool if exists it points to it , else
 * creates new
 * 
 * Thus optimised code
 * 
 * 
 * Immutability:
 * 
 * if we change the value of "hi" thru a refernce variable , it will not change
 * the value for the other varaible pointing to it because of immutability
 * 
 * but in arrays if we change value thru one reference variable it will change
 * for other reference var also
 * 
 * for security reasons string is immutable
 */
