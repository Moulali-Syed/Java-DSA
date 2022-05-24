package bigO;

public class PrintPairsFromArray {

	
	//O(N^2)
	public void pairs(int[] arr) {

		for (int i = 0; i < arr.length; i++) {   //O(N)
			for (int j = 0; j < arr.length; j++) {   //O(N)
				System.out.print(arr[i] + "" + arr[j] +" ");   //O(1)
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PrintPairsFromArray o = new PrintPairsFromArray();
		int[] arr = { 1, 3, 4, 5 };
		o.pairs(arr);
	}

}
