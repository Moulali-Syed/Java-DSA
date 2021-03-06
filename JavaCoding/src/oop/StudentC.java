package oop;

public class StudentC {

	int rno;
	String name;
	float marks;
	// we need a way to add values of above properties object by object
	// we need one word to access every object - this keyword helps
	// constructor

	StudentC() {

		// calling constructor from another constructor
//		we use this keyword - this(12,"apple",12.02f)
		this(11,"hey",12.01f);
		
		
		this.rno = 13;
		this.name = "Apple";
		this.marks = 1.2f;

	}

	StudentC(int roll, String name, float marks) {
		this.rno = roll;
		this.name = name;
		this.marks = marks;
	}

	void changeName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		StudentC stud = new StudentC();
		System.out.println(stud.rno);
		System.out.println(stud.name = "Shimla");

		StudentC stud1 = new StudentC(12, "hi", 12.4f);
		stud1.changeName("hello");

	}
}
