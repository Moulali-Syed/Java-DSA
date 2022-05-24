package bigO;

public class SumAndProductArray {

	//time complexity of method is O(N)
	public void sumProdArray(int[] arr) {
		int sum = 0;    //O(1)
		int prod = 1;	//O(1)

		for (int i = 0; i < arr.length; i++) {     //O(N)
			sum += arr[i]; //O(1)
			prod *= arr[i]; //O(1)
		}
		System.out.println(sum + " " + prod); //O(1)
	}

	public static void main(String[] args) {
		SumAndProductArray s = new SumAndProductArray(); 
		
		int[] ar = {1,2,3,4,5,6};
		s.sumProdArray(ar);
	}
}
