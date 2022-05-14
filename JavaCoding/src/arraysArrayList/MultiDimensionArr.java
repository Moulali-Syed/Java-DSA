package arraysArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArr {

	public static void main(String[] args) {

		// int[][] arr = new int[3][];

		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Scanner sc = new Scanner(System.in);
		int[][] arr2D = new int[3][3];
		for (int row = 0; row < arr2D.length; row++) {
			// now take every row
			for (int col = 0; col < arr2D[row].length; col++) {
				arr2D[row][col] = sc.nextInt();
			}
		}

		for (int row = 0; row < arr2D.length; row++) {
			// now take every row
			for (int col = 0; col < arr2D[row].length; col++) {
				System.out.print(arr2D[row][col] + " ");
			}
			System.out.println();
		}

		for (int row = 0; row < arr2D.length; row++) {
			System.out.println(Arrays.toString(arr2D[row]));
		}

		
		for(int[] a:arr2D) {
			System.out.println(Arrays.toString(a));
		}
	}

}
