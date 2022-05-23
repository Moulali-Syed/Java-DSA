package oop2;

public class Packages {

	public static void main(String[] args) {
		Packages a = new Packages();
		System.out.println(a);//prints hashcode -  oop2.Packages@515f550a
		
		Human obj1 = new Human(12,"Apple",10000000,false);
		Human obj2 = new Human(11,"Mango",100102020,false);
		Human obj3 = new Human(13,"Mangoes",1000102020,false);
		System.out.println(Human.population);
		System.out.println(Human.population);
		System.out.println(Human.population);
		
		
		

	}
	static void fun() {
		System.out.println("funny");
		//greeting();//not accessible 
		
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

}


/*
Packages: Containers for classes , helps in placing classes in form of compartments
Package is just folder , we can have same class name in different package 

*/