package bigO;

public class PrintUnorderedpairsArray {

	public void printUnorderedPairsArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				System.out.print(arr[i] + "" + arr[j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PrintUnorderedpairsArray o = new PrintUnorderedpairsArray();
		int[] arr = { 1, 3, 4, 5,6,7 };
		o.printUnorderedPairsArray(arr);
	}

}
