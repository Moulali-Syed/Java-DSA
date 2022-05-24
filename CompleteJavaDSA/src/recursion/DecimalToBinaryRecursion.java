package recursion;

public class DecimalToBinaryRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int decimalToBinary(int n) {
		if(n==0) {
			return 0;
		}
		return n%2+10*decimalToBinary(n/2);
	}

}


/*
13 to binary

13/2 = 6   |   1
6/2  = 3   |   0
3/2  = 1   |   1
1/2  = 0   |   1

*/