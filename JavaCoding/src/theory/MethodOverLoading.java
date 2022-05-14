package theory;

public class MethodOverLoading {

	public static void main(String[] args) {

		fun(1);
		fun(1, 2);
	}

	// Method Overloading -  happens at compile time
	//arguments must be different
	static void fun(int a) {
		System.out.println(a);
	}

	static void fun(int a, int b) {
		System.out.println(a + " " + b);
	}

}
