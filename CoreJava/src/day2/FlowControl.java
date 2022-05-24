package day2;

public class FlowControl {

	public static void main(String[] args) {

		if (2 > 10) {
			System.out.println("a");
		} else {
			System.out.println("a");
		}

		if (10 > 100) {
			System.out.println();
		} else if (101 > 120) {
			System.out.println("a");
		} else {
			System.out.println("a");
		}

		String b = "a";
		switch (b) {
		case "a":
			System.out.println("apple");
			break;
		case "b":
			System.out.println("happy");
			break;
		default:
			System.out.println("hi");
		}
		
		//no of iterations unknown
		int i=1;
		while(i<10) {
			System.out.println();
			i++;
		}
		
		//do while - to run code atleast once
		do {
			
		}while(i<10);
		
		//for loopp
		for(int j=1;j<10;j++) {
			
		}
		
		//break - out of loop
		//continue - skip current iteartion
		
		//labelled block 
		li:{
			System.out.println("block begins");
			if( i==10) {
				break li;
			}
			System.out.println("");
		}
		System.out.println("outside block");
		
		//continue
		for(int i1=1;i1<10;i1++) {
			if(i1%2==0) {
				continue;
			}
		}
		
	}

}

/*
 * 
 * selection - if else switch | iterative - for , while ,do while , for each
 * transfer statements - break , continue ,return , try catch finally assert
 * 
 * 
 * 
 */