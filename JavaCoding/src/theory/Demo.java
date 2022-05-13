package theory;

public class Demo {

	public String a1 = "hi";
	public String a2 = a1;

	public static void main(String[] args) {

		int a = 10;
		int b = a;
		int c = a;
		System.out.println(a + " " + b + " " + c);

		a = 20;
		System.out.println(a + " " + b + " " + c);

		/*
		 * 10 10 10 20 10 10
		 */

		String name = "apple";
		String nickName = name;
		String petName = name;
		System.out.println(name + " " + nickName + " " + petName);

		name = "happy";
		System.out.println(name + " " + nickName + " " + petName);

		name = "cool";
		nickName = name;
		petName = name;
		System.out.println(name + " " + nickName + " " + petName);
		/*
		 * 
		 * 
		 * apple apple apple happy apple apple cool cool cool
		 */

		Demo obj = new Demo();
		obj.a1 = "hello";
		System.out.println(obj.a1 + " " + obj.a2);
		//hello hi
		
		int[] arr = {1,3,4,5,9};
		int[] arr1 = arr;
		
		arr[0] = 100;
		System.out.println(arr[0]+" "+arr1[0]);
		//100 100
	}

}
