package arraysArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// initial capacity - 10
		ArrayList<Integer> list = new ArrayList<>();
		// generics is telling what type of data we can store in it

		list.add(12);
		list.add(13);
		list.add(67);
		list.add(90);
		list.add(32);

		System.out.println(list);
		
		System.out.println(list.contains(12));
		
		list.set(0, 200);//update
		
		list.remove(2);//remove
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println(list);
		
		list.get(3);

	}

}
