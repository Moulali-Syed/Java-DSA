package day2;

public class WrapperClassboxunBox {

	
	//primitive types to object types  , useful to work with Collections
	public static void main(String[] args) {
		
		
		
		//primitive to object conversion example
		int x=100;
		Integer y = Integer.valueOf(x);
		
		int z = y.intValue();
		
		
		//primitive to string
		byte n = 100;
		String q = Byte.toString(n);
		byte j = Byte.parseByte(q);
		
		
		//string objects
		long c  =100;
		String b = Long.toString(c);
		Long a = Long.valueOf(c);
		
		
		//click on array next to run btn and click on run configurations- click on arguments
		//and pass arguments as we can pass from command line

	}

}


/*
primitive to object  -- boxing

object to primitive -- unboxing

*/