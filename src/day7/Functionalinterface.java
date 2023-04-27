package day7;
//Functional Interface - An interface which has only one method...

@FunctionalInterface
interface P{
	void show();
}
//class Q implements P{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("In Show.......");
//		
//	}
//	
//}
public class Functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p obj=new Q();
		P obj=new P()
		{
			public void show() {
				System.out.println("in show............");
			}
			
		};
		obj.show();

	}

}
