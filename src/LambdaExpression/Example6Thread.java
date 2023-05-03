package LambdaExpression;

public class Example6Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{
			System.out.println("Thread is Running.........");
			
		};
		Thread t=new Thread(r);
			t.start();

	}

}
