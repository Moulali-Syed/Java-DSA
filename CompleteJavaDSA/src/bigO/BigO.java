package bigO;

public class BigO {

	/*
	 Big O is the language and metric we use to describe the efficiency of algorithms
	 
	 Big O Notation:
	 as a car has a different mileage , based on conditions
	 we have our code also running based on different conditions
	 
	 based on this we have worst case ,average case , best case
	 
	 
	 Big O : worst case
	 Big omega : best case
	 Big Theta : average case
	 
	 
	 O(1) - constant  - accessing specific element in array
	 O(N) - Linear    - loop through elements  [loop]
	 O(logN) -logarithmic - find elements in sorted array 
	 O(N^2) -  quadratic - looking every index in array twice - 2 loops[loop inside loop]
	 O(2^N) -  exponential - double recursion
	 
	 
	 space complexity : how much memory required
	 
	 
	 drop constants and non dominant terms
	 O(2N) --> O(N)
	 O(N^2+N) --> O(N^2)
	 as n tends to infinity  , constant factors are not big deal
	 
	 
	 Add vs multiply:
	 2 for loops one after other
	 O(A+B) = O(2N)  =  O(N)
	 
	 2 loops one inside other
	 O(N*N) = O(N^2)  
	 
	 
	 measure code using Big O:
	 any assignmnet statements  and if statements that are executed once regardless of
	 size of problem - O(1)
	 
	 A simple for loop from 0 to n [no internal loops] - O(N)
	 
	 A nested loop of same type takes quadratic time complexity - O(N^2)
	 A loop in which controlling parameter is divided by two each time - O(logN)
	 When dealing with multiple statements just add them
	 
	 
	 how to measure recursive algorithms:
	 consider that algorithms take M(n) input values , and go on calculating
	 each step
	 
	 
	 how to measure recursive algorithm with multiple calls:
	 check how many times function is happening , we can have O(2^N)
	 */
}
