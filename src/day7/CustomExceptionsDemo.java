package day7;


class ManideepException extends Exception
{
	public ManideepException(String msg) {  //constructor....
		super(msg);
	}
}
public class CustomExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0)
				throw new ManideepException("It cannot be Zero..");
			
		}
		catch(ManideepException e){
			j=18/1;
			System.out.println("the deafult value is 18"+e);
			
		}
		catch(Exception e) {
			System.out.println("Something went wrong...");
		}
		System.out.println(j);

	}


	

}
