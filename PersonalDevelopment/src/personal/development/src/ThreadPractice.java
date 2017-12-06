package personal.development.src;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadPractice {

	public static void main(String[] args) throws InterruptedException 
	{
//		Runnable task = new Producer();
//		Thread t1 = new Thread(task, "T1");
//        System.out.println("Thread spawned from main thread");
//		System.out.println("Before running..is daemon:  "+t1.isDaemon());
//		
//		t1.setDaemon(true);
//		t1.start();
//		System.out.println("back in main");
//		Thread.currentThread().sleep(2000);
		
//		t1.join();
	
		CyclicBarrier barrier = new CyclicBarrier(2);
		Runnable r1 = new PingPong("Ping", barrier);
		Runnable r2 = new PingPong("Pong", barrier);
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.setName("Pong");
		t2.setName("Ping");
		
		t1.start();
		t2.start();
	}

	public synchronized void printCommand(String printMessage)
	{
		System.out.print(" "+printMessage);
	}
}


class PingPong implements Runnable
{
	public PingPong(String str, CyclicBarrier barrier)
	{
		printMessage = str;
		this.barrier2 = barrier;
	}
	
	ThreadPractice obj = new ThreadPractice();
	String printMessage ;
	CyclicBarrier barrier2;
	public void run() 
	{
		int i = 0;
		while(true)
		{
				i++;
				if(i == 10)
				{
					break;
				}
				synchronized (obj) {
					
					String me = Thread.currentThread().getName();
					if(!printMessage.equals(me))
					{
						obj.printCommand(printMessage);
						notify();
					}
					else
					{
						try {
							wait(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					notify();
				}
			
			
/*			try {
				barrier2.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
*/			
			/*try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}


class Producer implements Runnable
{

	public void run() {
		
		Thread t = Thread.currentThread();
		try {
			t.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("t is daemon : "+t.isDaemon());
		go();
//		Thread t2 = new Thread("T2");
//		System.out.println("Spawned from t1 : "+t2.isDaemon());
		
	}
	
	public void go()
	{
		doMore();
	}
	
	public void doMore()
	{
		System.out.println("Top o' the stack");
	}
}
