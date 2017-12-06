package personal.development.src.locks;

import java.util.ArrayList;
import java.util.List;

public class FareLock {

	Thread lockingThread = null;
	boolean isLocked = false;
	
	List<LockQueue> queuedThreads = new ArrayList<LockQueue>();
	
	public void lock() 
	{
		LockQueue obj = new LockQueue();
		boolean isLockedForCurrentThread = true;
		/**
		 * As soon as a thread enters, add it to the queue
		 */
		synchronized (this) {
			queuedThreads.add(obj);
		}
		
		synchronized (this){
		while(isLockedForCurrentThread){
				isLockedForCurrentThread = isLocked || obj == queuedThreads.get(0);
				if(isLockedForCurrentThread)
				{
					isLocked = true;
					queuedThreads.remove(obj);
					lockingThread = Thread.currentThread();
					return;
				}
			}

			obj.doWait();
			
		}
		
	}
	
	public void unlock() 
	{
		if(lockingThread == Thread.currentThread())
		{
			synchronized (this) {
				isLocked = false;
				lockingThread = null;
				if(!queuedThreads.isEmpty() 
						&& queuedThreads.get(0) != null)
				{
					queuedThreads.get(0).doNotify();
				}
			}
		}

	}
	
}

class LockQueue
{
	boolean isElementLocked = true;
	public void doWait() {
		
		synchronized (this) 
		{
			while(isElementLocked)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}
	
	public void doNotify() {
		
		synchronized (this) 
		{
			if(isElementLocked)
			{
				isElementLocked = false;
				notify();
			}
		}

	}
}