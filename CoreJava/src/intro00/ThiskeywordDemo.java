package intro00;

public class ThiskeywordDemo {

	int x;

	ThiskeywordDemo() {
		System.out.println(this);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		new ThiskeywordDemo();
		new ThiskeywordDemo();
	}
	
}
