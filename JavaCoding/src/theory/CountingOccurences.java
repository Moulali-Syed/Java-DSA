package theory;

public class CountingOccurences {

	public static void main(String[] args) {

		CountingOccurences obj = new CountingOccurences();
		obj.getCount(123123123,3);
		int n = 45536;
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem == 5) {
				count++;
			}
			n = n / 10;
		}

		System.out.println(count);
	}
	
	public void getCount(int num,int actNo) {
		int n = num;
		int count =0;
		while(n>0) {
			int rem = n%10;
			if(rem == actNo) {
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}

}


