package strings;

public class Palindrome {

	public static void main(String[] args) {
		String str = "122221";
		System.out.println(checkPalindrome(str));

	}

	private static String checkPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
			}else {
				return "Not Palindrome";
			}
		}
		return "Palindrome";

	}
	
	static boolean isPalindrome(String str) {
		if(str==null || str.length()==0) {
			return true;
		}
		str = str.toLowerCase();
		for(int i=0;i<str.length()/2;i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i);
			if(start!=end) {
				return false;
			}
		}
		return true;
	}

}
