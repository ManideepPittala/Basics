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
		// TODO Auto-generated method stub
		Mani obj=new Mani();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
