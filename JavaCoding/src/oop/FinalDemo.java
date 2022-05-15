package oop;

public class FinalDemo {

	public static void main(String[] args) {

		// final variable
		final int INCREASE = 2;
		// final variables must be initialized
		// always initialize while declaring it

		// we cannot reassign to a primitive variable if its final
		// if its a reference variable we can assign value , but cannot be reassigned
		// directly to variable

		final A obj = new A("Hello");
		obj.name = "hey";// we can do this
		// when a non primitive is final , you cannot reassign it
		// obj = new A("hii!!");//this is not possible because obj is declared final

	}

}

class A {
	final int num = 10;
	String name;

	A(String name) {
		this.name = name;

	}

	protected void finalize() throws Throwable{
		
		//Called by the garbage collector on an object when garbage collectiondetermines that there are 
		//no more references to the object.A subclass overrides the finalize method to dispose ofsystem 
		//resources or to perform other cleanup. 
	}
}