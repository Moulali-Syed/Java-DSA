package intro00;

public class Demo {

	static Demo obj = new Demo();
	static {
		System.out.println(Demo.obj);
		Demo.obj = Demo.init();
	}

	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}
	
	static Demo init() {
		return new Demo();
	}
}
/*
 intro00.Demo@515f550a
intro00.Demo@cac736f

 */
