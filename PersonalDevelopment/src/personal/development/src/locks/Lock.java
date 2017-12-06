package personal.development.src.locks;

public class Lock {

	Thread lockingThread = null;
	boolean isLocked = false;
	int lockCount = 0; //for reentrant lock
	public synchronized void lock() {
	
		Thread currentThread = Thread.currentThread();
		//System.out.println("Called lock by thread :: "+Thread.currentThread().getName());
		while(isLocked
				&& lockingThread != currentThread) //added for reenterant lock so that same same can go ahead while aquiring the lock on the same object form the critical part of code. 
		{
			try 
			{
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		isLocked = Boolean.TRUE;
		lockCount++;
		lockingThread =  Thread.currentThread();
	}
	
	public synchronized void unlock() 
	{
		if(lockingThread == Thread.currentThread())
		{
			lockCount --;
			if(lockCount == 0)
			{
				isLocked = Boolean.FALSE;
				lockingThread = null;
				notify();
			}
		}

	}
}
