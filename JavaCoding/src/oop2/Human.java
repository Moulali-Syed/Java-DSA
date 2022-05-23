package oop2;

public class Human {

	int age ;
	String name;
	int salary;
	boolean married;
	static long population;
	
	static void message() {
		System.out.println("hello");
//		this.age; we can not use this inside static block
	}
	public Human(int age,String name,int salary,boolean married) {
		this.age = age;
		this.name = name;
		this.salary =salary;
		this.married = married;
		Human.population+=1;
		
		Human.message();
	}
}

/*

what if there is something constant across all the objects

then use static - thus it will become specific to class but not to object

without referencing object we can access static variables 
className.staticVariable - access static variable


static method - main is static
we can use it without creating object of class

static methods, variables belong to class , not object

static method can access static data , because which is non static is belongs to object


static void fun() {
		System.out.println("funny");
		greeting();//not accessible 
		
		//then how to access ?
		Packages p = new Packages();
		p.greeting(); // u cannot access non statci stuff without referencing their instances in a static context
		//hence we created a reference above
	}
	
	void fun2() {
		greeting();//accessible here , because we know object will be created in main method
	}
	void greeting() {
		fun();//static method accessible inside non static methods
		System.out.println("hello world");
	}

*/