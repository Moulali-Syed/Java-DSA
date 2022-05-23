package recursion;

public class SumOfDigitsRecursion {

	public static void main(String[] args) {
		SumOfDigitsRecursion sum = new SumOfDigitsRecursion();
		System.out.println(sum.sumOfDigits(212));
	}

	public int sumOfDigits(int n) {
		
		if(n==0 || n<0) {
			return 0;
		}
		return n % 10 + sumOfDigits(n / 10);
	}

}

/*
 * 
 * 121 = divide by 10 - 1
 * 
 * 
 * 
 */