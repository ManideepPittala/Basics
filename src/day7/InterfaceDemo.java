package day7;

interface A{
	//variables in interface are by default final and static.
	//if its final we have to intialize the age.
	
	int age = 22;
	String area="Banglore";
	
	void show();
	void config();
}
interface X{
	void run();//Inheritance is possible for the interface....(extends)
	                   //class - class->extends
}                      //class-interface->implements
                       //interface-interface->extends
class B implements A,X{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In show");
		
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("In config");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run.........");
		
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		A obj=new B();
		obj.show();
		obj.config();
		X obj1=new B();
		obj1.run();//
		System.out.println(A.age);//as it static we can use interface name..
		
		
		
	}

}
