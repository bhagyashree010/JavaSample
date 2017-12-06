package personal.development.src.locks;


/**
 * using 2 threads, print odd and even number in sequence. 
 * @author bdhavalshankh
 *
 */
public class OddEven {

	public static void main(String[] args) 
	{
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.setName("1");
		t2.setName("2");
		t1.start();
		t2.start();
		
	}
}

class MyNumber
{
	int i = 0; 
	Thread previousThread = null;
	public void printNumber() {

		while(i < 500)
		{
			synchronized (this) 
			{
				Thread currentThread = Thread.currentThread();
				if(currentThread != previousThread)
				{
					System.out.print(Thread.currentThread().getName()+":"+i++ +", ");
					previousThread = Thread.currentThread();
				}
			}
		}
	}
}

class MyRunnable implements Runnable
{

	MyNumber myNum = new MyNumber();
	@Override
	public void run() {

		myNum.printNumber();
		
	}
}