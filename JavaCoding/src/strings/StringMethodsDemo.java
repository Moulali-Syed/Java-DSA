package strings;

import java.util.Arrays;

public class StringMethodsDemo {

	public static void main(String[] args) {

		String name = "Apple Shimla";
		System.out.println(Arrays.toString(name.toCharArray()));

		name.toLowerCase();
		name.toUpperCase();
		name.charAt(0);
		name.indexOf('a');
		name.lastIndexOf('h');
		name.strip();// extra spaces remove
		Arrays.toString(name.split(" "));

	}

}
