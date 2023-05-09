package day7;


class Mani{
	public void show() throws ClassNotFoundException {
		Class.forName("ThrowsDemo");
	}
}
public class ThrowsDemo {
	static {
		System.out.println("class Loaded");
	}

	public static void main(String[] args) {
		
		Mani obj=new Mani();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
