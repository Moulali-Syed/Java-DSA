package theory;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char ch = sc.next().trim().charAt(0);
		
		if(ch >= 'a' && ch<='z') {
			System.out.println("lowercase");
		}else {
			System.out.println("Upper case");
		}
		System.out.println(ch);
		
		int a =10;
		int b=20;
		if(a==10 || b==20) {
			System.out.println("hello");
		}
	}

}
