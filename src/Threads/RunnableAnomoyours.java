package Threads;

public class RunnableAnomoyours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj=()->{
			for(int i=0;i<=100;i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable obj1=()->{
			for(int i=0;i<=100;i++) {
				System.out.println("Hello.");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		t1.start();
		t2.start();

	}

}
