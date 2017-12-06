package personal.development.src;

public class ThreadLocalExample {

	public static void main(String[] args) {
		
		MyThread runnable = new MyThread();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
	}
}

class MyThread implements Runnable 
{
 	ThreadLocal<Double> myValue = new ThreadLocal<Double>();
	//double myValue = 0D;
	@Override
	public void run() {
		
//		myValue = Math.random();
		myValue.set(Math.random());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("My thread id is "+Thread.currentThread().getName()+" and "
				+ " myvalue is set to :: "+myValue.get());
	}
}
