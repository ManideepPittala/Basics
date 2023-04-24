package day6;
class A{
	
	public A() {
		super();
		System.out.println("In A class");
	}
	public A(int n) {
		super();
		System.out.println("In A int");
	}
	
}
class B extends A{
	
	public B() {
		super();
		System.out.println("In B Class");
	}
	public B(int n) {
		super(n); //this();
		System.out.println("In B int");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B(5);
		

	}

}
