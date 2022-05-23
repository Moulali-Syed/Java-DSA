package recursion;

public class Factorial01 {

	public int fact(int n) {
		if(n<1) {
			return -1;
		}
		
		if(n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Factorial01  r = new Factorial01();
		int res = r.fact(10);
		System.out.println(res);
	}

}


/*
Write recursion in 3 easy steps:
Lets consider recursion example
	Factorial
		product of all positive numbers less than or equal to n
		denoted by n!{Christian Camp}
		only positive numbers
		0! =1
		
	example : 4! = 4*3*2*1
			10! = 10*9*8*7*6*5*4*3*2*1
			n -> n-1 
			
Step1:
Identify the recursive flow
	n! = (n-1)*(n-2).....*2*1
	n! = n*(n-1)!
	
Step2:
Integrate Base case
	0!=1
	1!=1
	
Step3: Unintentional Case
 what if some one pass factorial(-1),factorial(-2)
 in our condition n is less than 1 or not
*/