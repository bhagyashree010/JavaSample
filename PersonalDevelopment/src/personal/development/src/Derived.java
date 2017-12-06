package personal.development.src;

class InterfaceOverride {

	public int add(int i, int j)
	{
		return (i+j);
	}

}


public class Derived extends InterfaceOverride
{
	public int sub(int k, int l)
	{
		return k-l;
	}
	public static void main(String[] args) {
		
		System.out.println("Hi");
		InterfaceOverride obj = new Derived();
//		obj.sub(4,2);
	}
	public static void main(int[] args)
	{
		System.out.println("This is overriden main");
	}

	
}
