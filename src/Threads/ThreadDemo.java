package Threads;


class A extends Thread{
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

class B extends Thread{
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



public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		B obj1=new B();
		obj.start();
		obj1.start();

	}

}
