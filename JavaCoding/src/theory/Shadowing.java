package theory;

public class Shadowing {
	static int num = 20;

	public static void main(String[] args) {
		// lower level overriding upper level is shadowing
		System.out.println(num);//20
		int num = 21;
		System.out.println(num);//21
	}

}
