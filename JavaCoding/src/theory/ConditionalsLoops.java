package theory;

import java.util.Scanner;

public class ConditionalsLoops {

	public static void main(String[] args) {

		/*
		 * synatx of if statment if(boolean expression T or F){
		 * 
		 * //body }else{ }
		 */

		int salary = 25000;
		if (salary > 20000) {
			salary += 2000;
		} else {
			salary += 1000;
		}
		/*
		 * multiple if -else
		 * 
		 */
		if (salary > 10000) {
			salary += 2000;
		} else if (salary > 15000) {
			salary += 3000;
		} else {
			salary += 1000;
		}

		System.out.println(salary);

		// Loops
		// print numbers from 1 to 5
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		/*
		 * if known number of iterations use for
		 * for(initialization ; condition; incre/decre){ //body }
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(n);
		}
		 
		//while -when we dont know how many times to run
		int num=1;
		while(num<=5) {
			System.out.println(num);
			num++;
		}
		
		//do while
		int n1=1;
		do {
			System.out.println(n1);
		}while(n1<5);
	}

}
//**************************************************************************