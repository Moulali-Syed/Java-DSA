package theory;

import java.util.Scanner;

public class FibonacciSeq {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		while (count <= n) {
			int temp = b;
			b = a + b;
			a = temp;
			
			count++;
		}
		System.out.println(b);
	}

}
