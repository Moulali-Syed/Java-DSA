package theory;

import java.util.Arrays;

public class Varargs {

	public static void main(String[] args) {
		fun(2,3,4,5,56,6,7,7,0);
		
		multiple(2,2,123,4,2,3);

	}
	
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	
	static void multiple(int a,int b,int ...z) {
		System.out.println();
	}

}


//varargs must come at end if there are more arguments