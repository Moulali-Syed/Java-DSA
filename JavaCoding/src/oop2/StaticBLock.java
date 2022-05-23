package oop2;

public class StaticBLock {

	static int a = 4;
	static int b;
	static {
		// static block will execute only once , when the class is loaded for the first time
		System.out.println("Iam a static block");
		b = a * 5;
	}

	public static void main(String[] args) {
		StaticBLock obj = new StaticBLock();
		System.out.println(StaticBLock.a + " " + StaticBLock.b);
		StaticBLock.b += 3;

		StaticBLock obj1 = new StaticBLock();
		System.out.println(StaticBLock.a + " " + StaticBLock.b);
		
		StaticBLock obj2 = new StaticBLock();
		System.out.println(StaticBLock.a + " " + StaticBLock.b);
	}
}
