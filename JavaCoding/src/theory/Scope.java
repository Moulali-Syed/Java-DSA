package theory;

public class Scope {

	public static void main(String[] args) {
		int num=10;
//		System.out.println(a1); not accessible
		{
		//int num =12;//cant be intialized again here but can be modifiable
		num=13;//already intialized outside block in same method cant intialiaze again but can change value
		
		
		int c=90;//values intialized in this block will remain in the block
		}
		//System.out.println(c);//cant be used here
		
		
		//scoping in for loop
		for(int i=0;i<4;i++) {
			System.out.println(i);
		}
		
		//anything which is initialised outside block can be used inside block
		//anything which is intialized inside block cannot be used outside block
	}
	
	public static void scopeVar(int a,int b) {
		int a1 =a;
		
	}
}
