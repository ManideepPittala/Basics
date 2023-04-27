package day7;

class S{
	public void show() {
		System.out.println("In show...");
	}
	static class P{                                   //static class we can use like this S.P obj1=new S.P();
		                                              //Non static class then S.P obj1=obj.new P();
		public void config() {
			System.out.println("In config...");
		}
	}
	
}


public class InternalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S obj=new S();
		obj.show();
		S.P obj1=new S.P();
		obj1.config();

	}

}
