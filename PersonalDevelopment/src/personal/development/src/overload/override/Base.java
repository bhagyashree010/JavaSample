package personal.development.src.overload.override;

public class Base {

	public void func()
	{
		System.out.println("In base func()");
//		protectFunc();
		
	}
	protected void protectFunc()
	{
		System.out.println("In base protectFunc()");
		privateFunc();
		
	}
	
	private void privateFunc()
	{
		System.out.println("In base privateFunc()");
	}
}
