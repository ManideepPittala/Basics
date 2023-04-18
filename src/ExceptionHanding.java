
public class ExceptionHanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result=10/0;
			System.out.println("Result"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Result"+e.getMessage());
			
		}
		finally{
			System.out.println("Block is executed");
		}

	}

}
