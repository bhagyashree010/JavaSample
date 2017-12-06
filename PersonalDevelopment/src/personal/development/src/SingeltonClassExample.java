package personal.development.src;

public class SingeltonClassExample {

	private static SingeltonClassExample singleObj_ = null;
	
	
	private SingeltonClassExample()
	{
		
	}

	public static SingeltonClassExample getInstance()
	{
		if(singleObj_ == null)
		{
			singleObj_ = new SingeltonClassExample();
		}
		return singleObj_;
	}
	
	private void demoMethod()
	{
		System.out.println("Called");
	}
	
	
	
	public static void main(String[] args) 
	{
		SingeltonClassExample obj = SingeltonClassExample.getInstance();
//		obj = obj.getInstance();
		obj.demoMethod();
		System.out.println("Received obj id : "+obj.hashCode());
		
	}
	
}
