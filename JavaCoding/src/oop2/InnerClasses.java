package oop2;


//outside class cannot be static , as it is not dependent on any other class
public class InnerClasses {

	
	static class Test{
		String name;
		public Test(String name) {
			this.name = name;
		}
		
			
	}
	
	public static void main(String[] args) {
		//Test class must be declared static , else it will throw error
		Test a = new Test("Mango");
		Test b = new Test("Apple");
		
		System.out.println(a.name);
		System.out.println(b.name);
	}
}
