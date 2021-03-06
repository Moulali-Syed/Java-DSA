package theory;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num = sc.nextFloat();
		System.out.println(num);
		
		//typecasting
		int num1 = (int)123.123;
		System.out.println(num1);
		
		//automatic type promotion in expressions
		int a =257;
		byte b = (byte)a;
		System.out.println(b);
		//in this above we r trying to store 257 in byte which is not possible , as it can have 256 highest
		//so it will convert and print 1 [based on 257%256 =1]
		
		byte a1 = 40;
		byte a2 =50;
		byte a3 = 100;
		int a4 = (a1*a2)/a3;
		System.out.println(a4);//20
		//automatic promotion happens in above step while calculating a1*a2/a3 all r converted to int
		
		int number = 'A';
		System.out.println(number);//65 - gives ascii value
		
		
		int z=10;
		if(z==10) {
			System.out.println("hello");
		}

		//donot know how many times to run
		int count =1;
		while(count!=5) {
			System.out.println(count);
			count++;
		}
		
		//when we know how many times to run
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}

/*
conditions for type conversion

int can be conevrted to float automatically - automatic type conversion

which cant be done , is narrowing conversion have to do explicitly
*/