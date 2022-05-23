package oop2;

public class SingleTon {
	
	//we wnat only instance to be allowed that can be done using singleton class
	//we shouldnot allow the constructor to be called , thus restricts object creation
	
	//1.create a private constructor - thus restricting object creation
	private SingleTon() {
		
	}
	
	//2.create private instance variable 
	private static SingleTon instance;
	
	// 3.create a public method for private instance variable
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();//only one object will be created here
		}
		return instance;
	}
	
	

}


/*
 * 
 * SingleTon class
 * 1.create a private constructor - thus restricting object creation
 * 2.create private instance variable 
 * 3.create a public method for private instance variable
 * 4.create  reference variables , all will point to same instance , hence only one object is used all over
 */

/*
 package oop2;

public class MainSingleTon {

	public static void main(String[] args) {
		SingleTon obj = SingleTon.getInstance();
		
		SingleTon obj1 = SingleTon.getInstance();
		//all refernce variables are poinitng to just one object
		
	}

}

 */
