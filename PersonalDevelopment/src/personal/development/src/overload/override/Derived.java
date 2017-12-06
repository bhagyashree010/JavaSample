package personal.development.src.overload.override;

public class Derived extends Base{
	
	public void func()
	{
		System.out.println("In derived func()");
//		protectFunc();
		
	}
	protected void protectFunc()
	{
		System.out.println("In derived protectFunc()");
		super.protectFunc();
		privateFunc();
		
	}
	
	private void privateFunc()
	{
		System.out.println("In derived privateFunc()");
	}
	
	public static void main(String[] args) {
/*		Base base = new Derived();
		base.func();
*/		
		Base vehicle = new Base();
		Derived car = new Derived();
		
		vehicle = car;
		vehicle.func();
		
		Derived car2 = (Derived)vehicle;
		car2.func();
//		car = (Derived)vehicle;
//		b = d;
//		Derived car.func();
//		base.protectFunc();
	}
}
