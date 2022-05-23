package recursion;

public class RecursionObjectives00 {
	
	/*
	 What is recursion?
	 why do we need recursion?
	 logic behind recursion?
	 recursive vs iterative solutions
	 How to write recusrion in 3 steps
	 find fibonacci series using recursion
	 
	 
	 what is recursion?
	 A way of solving a problem , by having a fucntion calling itself
	 like a russian doll , if we keep opening we will see a smaller doll, till we reach a smallest doll
	 that cannot be opened anymore
	 same way in recursion we keep on calling same function , until we reach a solution
	 
	 1.performing same operation  multiple times with different inputs
	 2.in every step we try smaller inputs to make problem smaller
	 3.A base condition should be set , otherwise inifnite loop will occur
	 */
	//an example of recusrion using the russian doll example
	static void openRussianDoll(int doll) {
		if(doll==1) {
			System.out.println("All russian dolls are opened");
		}else {
			openRussianDoll(doll-1);
		}	
	}

	
	
//	why do we need recursion?
	/*
	Recursion is very important in programming
	it helps u break down bigger problems into smaller ones and easier to use
	
	When to choose recursion?
	If we know that a problem can be solved by similar sub/small problems
		Design an algorithm to compute nth
		Write a code to list n...
		implement a method to compute all
		Practice
		
		
	The prominent use of recursion in trees and graphs
	it is used in many algorithms - divide and conquer , greedy and dynamic programming
	 */
	
	//The logic behind recursion
	/*
	 1.A method that calls itself
	 2.A condition that breaks infinte loop
	 
	 A general syntax:
	 static String recursionMethod(String[] parameters) {
		if(exit from condition satisfied) {
			some value
		}else {
			recursionMethod(SomeParameters);
		}	
	}
	 */
	
	static void firstMethod() {
		secondMethod();
		System.out.println("firstMethod");
	}



	static void secondMethod() {
		thirdMethod();
		System.out.println("Second Method");
	}

	static void thirdMethod() {
		fourthMethod();
		System.out.println("Third method");
	}

	static void fourthMethod() {
		System.out.println("Fourth Method");
	}
	
	/*
	 Now when we execute firstMethod it will be stored in stack memory there is code to execute after
	 	the secondMethod() call 
	 The secondMethod again stored in stack memory , calls third method
	 third method again stored in stack memory , calls fourthMethod()
	 Then it will execute the fourthMethod
	 Then as they are stored in stack 
	 we have thirdMethod() --> secondMethod() --> firstMethod() 
	 stack follows last in first out
	 thus from stack memory it will excute the steps that were remaining the 3 methods and remove them from stack
	 */
	
	/*
	 Lets see the same in a recursive method
	 */
	static void recursiveMethod(int n) {
		if(n<1) {
			System.out.println(" n is less than 1");
		}else {
			recursiveMethod(n-1);
			System.out.println(n);
		}
	}
	
	/*
	 Now the execution flow will be like
	 if we give n=4
	 recursiveMethod(4)
	 1.checks condition , as it is false , in else it will create a method call
	 		recursiveMethod(3)
	 		and there is a step after this to execute , so stored in stack memory recursiveMethod(4)
	 2.now again executes , as it is false , in else it will vreate a method call
	 		recursiveMethod(2)
	 		and there is a step to execute , so stored in stack memory , recursiveMethod(3)
	 3.now again condition is false , so recursive method is called
	 		recursiveMethod(1)
	 		and there is a step to execute , so stored in stack memory ,recursiveMethod(2)
	 4.and so on 
	 	recursiveMethod(0) ,there is a step to execute , so stored in stack memory ,recursiveMethod(1)
	 
	 now the condition is false , recursive method will result in n is less than 1 [if statement]
	 now stack is checked it has
	 		recursiveMethod(1)
	 		recursiveMethod(2)
	 		recursiveMethod(3)
	 		recursiveMethod(4)
	 		
	 each one is called
	 	
	 	1
	 	2
	 	3
	 	4
	 and removed from stack memory
	 		
	 */
	
	
	/*
	 Recursive vs Iterative Method
	 
	 				recursion    Iteration
	 SpaceEfficient - No   		 Yes 		no usage of stack in case of iterative
	 TimeEfficient  - No   		 Yes 		in case of recursion pop and push methods should happen , thus more time 
	 									consuming
	 Easy to code	- Yes   	  No        we use recusrion when we know that code can be divided into similar small problems
	 */
	
	
	/*
	 When to use/avoid recursion
	 use: when we can easily break down a problem into similar small problems
	 	if we r ok with time and space consumption
	 	when we need a quick working solution , instead of efficient one
	 	very useful in implementing tree
	 	when we use memoization in recursion
	 	
	 donot use:
	 cannot divide problem into smaller problems
	 time and space complexity matters
	 recursion uses memory , mobile applications should be memory efficient , so dont use recusrion in mobile apps
	 */
	
	
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
	 */
}
