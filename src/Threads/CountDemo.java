package Threads;

class Counter{
	int count;
	public void increment() {
		count++;
	}
}


public class CountDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		Runnable obj2=()->{
			for(int i=1;i<=1000;i++) {
				c.increment();
				
			}
		};
		Runnable obj3=()->{	
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		};
		Thread t1=new Thread(obj2);
		Thread t2=new Thread(obj3);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(c.count);

	}

}
