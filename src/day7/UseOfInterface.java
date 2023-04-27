package day7;
 
interface Computer {

	 void code();
		
	
}
class Laptop implements Computer{
	public void code() {
		System.out.println("code,compile,run");
	}
}
class Desktop implements Computer{
	
	public void code() {
		System.out.println("code,compile,run:Faster");
	}
}
class Devloper{
	public void devApp(Computer lap) {
		//System.out.println("Coding.........");
		lap.code();
	}
} 	 
public class UseOfInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer lap=new Laptop();
		Computer desk=new Desktop();
		Devloper mani=new Devloper();
		mani.devApp(lap);

	}

}
