package personal.development.src.executors;

import java.util.concurrent.ThreadFactory;

/**
 * Executor -> ExecutorService -> AbstractExecutorService, ScehuledExecutorService
 * AbstractExecutorService -> ThreadPoolExecutor
 * ScheduledExecutorService -> ScheduledThreadPoolExecutor
 * @author bdhavalshankh
 *1) Create producer condumer model
 *2) Use Executor implemetation to spawn a thread in pool
 */
public class ConcurrencyExample {

	public static void main(String[] args) 
	{
		Thread t1 = new MyThreadFactory().newThread(executionCode); 
		t1.start();
	}
	
	static Runnable executionCode = new Runnable() {
		@Override
		public void run() {
			System.out.println("This is called for thread"+ Thread.currentThread().getName());
			
		}
	};
}

class MyThreadFactory implements ThreadFactory
{
	public  int THREAD_ID = 0;
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread t = new Thread(r);
		t.setName(Integer.toString(THREAD_ID));
		return t;
	}
}
