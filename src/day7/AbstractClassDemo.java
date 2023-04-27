package day7;


abstract class D{
	public abstract void show();
	public abstract void config();
}
abstract class As extends D{
	public void show() {
		System.out.println("In show block.....");
	}
}
class Bb extends As{

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("In config.....");
		
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj=new Bb();
		obj.show();
		obj.config();

	}

}
