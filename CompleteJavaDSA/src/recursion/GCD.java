package recursion;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int gcd(int a , int b) {
		
		if(a<0 || b<0) {
			return -1;
		}
		
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

}


/*
 
 gcd(48,18) 
 	48%18 - 12
 	18%12 - 6
 	12%6 - 0

 gcd(a,0) = a;
 gcd(a,b) = gcd(b, a mod b)
*/