package personal.development.src;

/*
 * Points to remember
 * 1) Overloading takes place only if u r extending to superclass
 * 2) You can not have 2 methods with same name in a class if the return type of methods are same
 * 3) Overloading is defined by input params . To overload a method, we need to have same method
 *  name as of superclass and different set of input params.
 * 4) If you provide same name and same set of inout params but different return type, our code will not
 * compile.
 * 5) Commented code below is wrong 
 * 
 */
public class OverloadOverride extends A{

	public String printString(int i) {
		// TODO Auto-generated method stub
		return "hi";
	}
	
	public static void main(String[] args) {
		
		A obj = new A();
		int n = obj.process(2, 2);
		System.out.println(n);
	}
	/*
	 * this doesnt work for overloading n overriding both
	 */
	/*public int printString()
	{
		return 1;
	}*/
	
	
	/*
	 * This works
	 */
	/*public String printString()
	{
		return "ki";
	}*/
	
}

class A extends B
{

	public String printString()
	{
		return "Hi there!";
	}
	
	public int process(long a, long b)
	{
		return (int)Math.pow(a, b);
	}
	
	/*public StringBuffer printString()
	{
		return "Hello";
	}*/
}

class B 
{
	public int process(int a, int b)
	{
		return a-b;
	}
}