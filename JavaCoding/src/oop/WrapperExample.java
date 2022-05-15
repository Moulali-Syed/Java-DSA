package oop;

public class WrapperExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		swap(a, b);
		System.out.println(a + " " + b);
		System.out.println("********************************************");
		Integer c = 30;
		Integer d = 40;

		swap1(c,d);
		System.out.println(c+" "+d);
		
		

	}

	private static void swap1(Integer c, Integer d) {
		Integer temp = c;
		c=d;
		d=temp;
		System.out.println(c+" "+d);
		
	}

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}

}
/*

20 10
10 20
********************************************
40 30
30 40


*/