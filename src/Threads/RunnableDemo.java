package Threads;
class C implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Hi.");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class D implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Hello.");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj=new C();
		Runnable obj1=new D();
		
		Thread t=new Thread(obj);
		Thread t1=new Thread(obj1);
		
		t.start();
		t1.start();

	}

}
