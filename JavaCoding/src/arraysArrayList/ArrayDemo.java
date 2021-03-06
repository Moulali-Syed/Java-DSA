package arraysArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		// array datatypes of all elements must be same
		int[] arr = new int[5];
		int[] arr1 = { 1, 2, 3, 4 };

		int[] ros;// declaration of array . ros is getting defined in stack
		ros = new int[3]; // initialisation: actually here object is being created in the memory(heap)

		// array objects are in heap
		// heap objects are not continous
		// dynamic memory allocation
		// in java internally , array is not continuous because it depends on JVM

		// new is used to create an object
		System.out.println(ros[2]);// 0 by default
		String[] str = new String[3];
		System.out.println(str[1]);// null

		// null
		String s = null;
//		int n=null;//compile time error

		// Any reference type datatype will have null by default , not an object

		String[] arrStr = new String[5];
		// internal working of object
		// we have stack and heap memory , array stored in heap memory

		Scanner sc = new Scanner(System.in);

		int[] s1 = new int[5];
		for (int i = 0; i < s1.length; i++) {
			s1[i] = sc.nextInt();
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}

		for (int j : s1) {
			System.out.println(j);
		}
//best way to print an array
		System.out.println(Arrays.toString(s1));

		// toString
		String[] str1 = new String[4];
		for (int i = 0; i < str1.length; i++) {
			str1[i] = sc.next();
		}
		System.out.println(Arrays.toString(str1));
		
		//arrays are mutable

	}

}
