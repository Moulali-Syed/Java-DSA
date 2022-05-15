package arraysArrayList;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 11, 98 };
		swap(arr, 1, 2);
		System.out.println(Arrays.toString(arr));
	}

	static void swap(int[] arr, int i, int j) {
		System.out.println(arr[i] + " " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		System.out.println(arr[i] + " " + arr[j]);

	}

}
