package personal.development.src.multithreading;

public class EvenPrinter implements Runnable
{
	MyNumber obj = null;
	public EvenPrinter(MyNumber obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
	
		synchronized (obj) 
		{
			int evenNum = obj.getNum();
			while(evenNum < 20)
			{
				evenNum = obj.getNum();
				if(evenNum%2 != 0)
				{
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
//					System.out.println("even number thread");
					System.out.print(evenNum+" ");
					obj.setNum(evenNum+1);
					obj.notify();
				}
			}
		}
	}

	
}
