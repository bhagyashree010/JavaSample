package personal.development.src.multithreading;

public class OddPrinter implements Runnable{

	MyNumber obj = null;
	public OddPrinter(MyNumber obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
	
		synchronized (obj) 
		{
			int oddNum = obj.num;
			while(oddNum < 20)
			{
				oddNum = obj.num;
				if(oddNum%2 == 0)
				{
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else
				{
					System.out.print(oddNum+" ");
					obj.notify();
					obj.setNum(oddNum+1);
				}
			}
		}
	}
}
