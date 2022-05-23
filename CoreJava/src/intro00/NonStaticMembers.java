package intro00;

public class NonStaticMembers {

	//we dont mark static because we want different values for different objects
	int num;
	// we initialize in constructor
	NonStaticMembers(){
		System.out.println("inside constructor");
	}
	
	//Non static block - gets executed before constructor
	{
		System.out.println("Non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		NonStaticMembers obj  = new NonStaticMembers();
		obj.doSomething();
	}
	static {
		System.out.println("inside static block");
	}
	
	void doSomething() {
		System.out.println("inside do something");
	}
}
/*
inside static block
inside main method
Non static block
inside constructor
inside do something
*/