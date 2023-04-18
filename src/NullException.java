
public class NullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		s = null;
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("its executed");
		}

	}

}
