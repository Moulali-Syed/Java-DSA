package theory;

public class ReverseNumber {

	public static void main(String[] args) {
	
		
		int num =1234567;
		/*
		while(num>0) {
			int rem = num%10;
			System.out.print(rem);
			num=num/10;
		}
		*/
		int ans = 0;
		while(num>0) {
			int rem= num%10;
			num/=10;
			ans = ans*10+rem;
		}
		System.out.println(ans);

	}

}
