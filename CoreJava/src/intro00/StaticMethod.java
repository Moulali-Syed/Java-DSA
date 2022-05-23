package intro00;

public class StaticMethod {

	public static void main(String[] args) {
		StaticMethod.method();
		//classname.staticMethodName - access a static method
	}

	static void method() {
		System.out.println("inside a static method");
	}

	static {
		System.out.println("Inside static block");
		StaticMethod.method();
	}

}
/*
Inside static block
inside a static method
inside a static method

*/