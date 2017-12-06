package personal.development.src;



public class TrialPingPongTest {

	public static void main(String[] args) 
	{
		MessagePrinter2 msgPrinter = new MessagePrinter2();
		WorkerThread2 r1 = new WorkerThread2(//"ping","t2",
				msgPrinter);
		WorkerThread2 r2 = new WorkerThread2(//"pong","t1",
				msgPrinter);
		Thread t1 = new Thread(r1);
		t1.setName("t1");
		
		Thread t2 = new Thread(r2);
		t2.setName("t2");
		
		t1.start();
		
		t2.start();
		
	}
}

class MessagePrinter2
{
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

class WorkerThread2 implements Runnable
{
	String message ;
	String opponent ;
	MessagePrinter2 msgPrinter;
	
	public WorkerThread2(//String message, String opponent,
			MessagePrinter2 msgPrinter) 
	{
//		this.message = message;
//		this.opponent = opponent;
		this.msgPrinter = msgPrinter;
	}
	public void run() 
	{
		int i=0;
		while(true)
		{
			try {
				if(Thread.currentThread().getName().equals("t1")){
					msgPrinter.printPing();
				}else{
					msgPrinter.printPong();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

