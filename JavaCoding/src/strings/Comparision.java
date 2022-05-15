package strings;

public class Comparision {

	public static void main(String[] args) {
		String a = "apple";
		String b = "Apple";
		System.out.println(a == b);// true

		// == comparator
		/*
		 * a-->points to Apple b-->points to Apple checks if reference variables
		 * pointing to same object
		 */

		// creating these values outside string pool but in heap only
		String c = new String("hi");
		String d = new String("hi");
		System.out.println(c == d);// false

		// when we need to check only value , use .equals method
		System.out.println(c.equals(d));// true - because it cares only about value

		// pretty printing
		float z = 453.1234f;
		System.out.printf("Formatted number is %.3f", z);
		System.out.println();
		System.out.printf("Pie : %.3f", Math.PI);

		System.out.printf("Hi my name is %s and Iam from %s", "Apple", "Shimla");
		
		//format specifiers / placeholders
		/*
		 * %c - character
		 * %d - decimal number
		 * %e - exponential floating point number
		 * %f - floating point number
		 * %i - integer
		 * %o - octal number
		 * %s - string
		 * %u - unsigned decimal integer number
		 * %x - hexadecimal number base 16
		 * %t - Date/time
		 * %n - NewLine
		 */

	}

}
