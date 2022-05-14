package theory;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		// System.out.println(isPrime(n));
		armstrong(n);
	}

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		int c = 2;
		while (c * c <= n) {
			if (n % c == 0) {
				return false;
			}
			c++;
		}
		return c * c > n;
	}

	// armstrong numbers
	// 153 = 1^3 +5^3+3^3

	static void armstrong(int n) {
		int original = n;
		int res = 0;
		while (n > 0) {
			int rem = n % 10;
			res += rem * rem * rem;
			n = n / 10;
		}
		if (res == original) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}
	}

}
