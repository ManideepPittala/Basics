package day7;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int j=0;
		String s=null;
		
		int nums[]=new int[5];
		
		
		try {
			j=18/i;
			System.out.println(s.length());
			System.out.println(nums[1]);
			System.out.println(nums[5]);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot be Zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Dont go out of the limit..");
		}
		catch(Exception e) {
			System.out.println("something went wrong..."+ e);
		}
		System.out.println(j);

	}

}
