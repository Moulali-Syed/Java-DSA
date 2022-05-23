package recursion;

public class FibonacciSeries02 {

	public static void main(String[] args) {
		FibonacciSeries02 fib = new FibonacciSeries02();
		int res = fib.fibonacci(9);
		System.out.println(res);
	}

	//finding nth fibonacci number
	public int fibonacci(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0 || n==1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	
	
}

/*
 * 
 * Fibonacci seq - start from 0 and 1 every next number is sum of two preceding
 * number
 * 
 * 0 1 1 2 3 5 8 13 ....
 * 
 * 0 1 [prec2numsSum]
 * Step1:
 * 5 = 3 + 2 | f(n)= f(n-1)+f(n-2)
 * 
 * Step2:
 * Base case - the stopping criteria
 * 0 and 1
 */