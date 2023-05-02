package day7;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0)
				throw new ArithmeticException("It cannot be Zero..");
			
		}
		catch(ArithmeticException e){
			j=18/1;
			System.out.println("the deafult value is 18");
			
		}
		catch(Exception e) {
			System.out.println("Something went wrong...");
		}
		System.out.println(j);

	}

}
