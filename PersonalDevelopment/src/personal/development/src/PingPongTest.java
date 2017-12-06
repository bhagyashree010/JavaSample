package personal.development.src;



public class PingPongTest {

	public static void main(String[] args) 
	{
		MessagePrinter msgPrinter = new MessagePrinter();
		WorkerThread r1 = new WorkerThread("ping","you",msgPrinter);
		WorkerThread1 r2 = new WorkerThread1("pong","me",msgPrinter);
		Thread t1 = new Thread(r1);
		t1.setName("me");
		
		Thread t2 = new Thread(r2);
		t2.setName("you");
		
		t1.start();
		t2.start();
		
	}
}

class MessagePrinter
{
	private static String  whoseNext = null;

	private static Boolean isPingPrinted = Boolean.FALSE;
	public synchronized void  printPing() throws InterruptedException
	{
		if(!isPingPrinted)
		{
			System.out.println("PING ");
			isPingPrinted = true;
			wait();
		}
	}
		
	
	
	public synchronized void  printPong() throws InterruptedException
	{
		//System.out.println(isPingPrinted);
		if(isPingPrinted)
		{
			System.out.println("PONG ");
			isPingPrinted = false;
			notify();
		}
	}
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
		while(i<10)
		{
			try {
				
				msgPrinter.printPing();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
	class WorkerThread1 implements Runnable
	{
		
		String message ;
		String opponent ;
		MessagePrinter msgPrinter;
		
		public WorkerThread1(String message, String opponent,MessagePrinter msgPrinter) 
		{
			this.message = message;
			this.opponent = opponent;
			this.msgPrinter = msgPrinter;
		}
		public void run() 
		{int i = 0;
			while(i<10)
			{
				try 
				{
					msgPrinter.printPong();
					i++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
