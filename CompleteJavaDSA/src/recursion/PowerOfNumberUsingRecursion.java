package recursion;

public class PowerOfNumberUsingRecursion {

	public static void main(String[] args) {
		PowerOfNumberUsingRecursion p = new PowerOfNumberUsingRecursion();
		System.out.println(p.power(10, 2));
	}

	
	public int power(int base,int exp) {
		if(exp<0) {
			return -1;
		}
		if(exp==1) {
			return 1;
		}
		return base*power(base,exp-1);
	}
}
