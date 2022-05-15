package arraysArrayList;

public class Max {

	public static void main(String[] args) {

		int[] arr = { 11, 23, 3, 49, 5, 69 };
		System.out.println(max(arr));
	}

	static int max(int[] arr) {
		int maxNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

}
