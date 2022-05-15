package strings;

public class Performance {

	public static void main(String[] args) {

		String series = "";
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			System.out.println(ch);
			series+=ch;
		}
		
		//string doesnot allow us to modify , so at last we have a , ab ,abc , ....... thus wastage of memory
		
		//to make string mutable we have StringBuilder
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch = (char)('a'+i);
			builder.append(ch);
		}
		System.out.println(builder.toString());
		
		builder.reverse();
		
		

	}

}
