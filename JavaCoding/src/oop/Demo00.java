package oop;

public class Demo00 {

	public static void main(String[] args) {
		
		
		//store 5 rool numbers, names
		int[] numners = new int[5];
		String[] names = new String[5];
		
		//store data of students
		int[] rno = new int[5];
		String[] name = new String[5];
		float[] marks = new float[5];
		
		//all above 3 can be combined into one 
		Student[] stud = new Student[5];
		

	}

}

class Student{
	int[] rno = new int[5];
	String[] name = new String[5];
	float[] marks = new float[5];
	
	
	Student() {
	
	}
}

//class is a named group of properties and functions