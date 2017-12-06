



public class TrialPingPongTest {

	public static void main(String[] args) 
	{
		MessagePrinter msgPrinter = new MessagePrinter();
		WorkerThread r1 = new WorkerThread("ping","t2",msgPrinter);
		WorkerThread r2 = new WorkerThread("pong","t1",msgPrinter);
		Thread t1 = new Thread(r1);
		t1.setName("t1");
		
		Thread t2 = new Thread(r2);
		t2.setName("t2");

		t2.setPriority(1);
		t2.start();
		
		t1.setPriority(2);
		t1.start();
		
	}
}

class MessagePrinter
{
	private static String  whoseNext = null;

	private static Boolean isPingPrinted = Boolean.FALSE;
	public synchronized void  printPing() throws InterruptedException
	{
//		synchronized (this) {
				
			if(!isPingPrinted)
			{
				System.out.print("PING ");
				isPingPrinted = true;
				while(isPingPrinted)
				{
					wait();
				}
			}
//		}
		
//		synchronized (this) {
			if(isPingPrinted)
			{
				System.out.print("PONG ");
				isPingPrinted = false;
				notify();
			}
//		}
	}
		
	
	
	/*public synchronized void  printPong() throws InterruptedException
	{
		//System.out.println(isPingPrinted);
		if(isPingPrinted)
		{
			System.out.println("PONG ");
			isPingPrinted = false;
			notify();
		}
	}*/
}

class WorkerThread implements Runnable
{
	String message ;
	String opponent ;
	MessagePrinter msgPrinter;
	
	public WorkerThread(String message, String opponent,MessagePrinter msgPrinter) 
	{
		this.message = message;
		this.opponent = opponent;
		this.msgPrinter = msgPrinter;
	}
	public void run() 
	{
		int i=0;
		while(i < 20)
		{
			try {
				msgPrinter.printPing();
/*				if(Thread.currentThread().getName().equals("t1")){
				}else{
					msgPrinter.printPong();
				}
*/			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			i++;
		}
	}
}

