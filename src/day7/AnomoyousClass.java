package day7;

abstract class C{
	public abstract void show();
	public abstract void mani();
}
public class AnomoyousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C() {
			public void show() {
				System.out.println("In show");
			}
			public void mani() {
				System.out.println("I am Mani...");
			}
			
		};
		obj.show();
		obj.mani();

	}

}
