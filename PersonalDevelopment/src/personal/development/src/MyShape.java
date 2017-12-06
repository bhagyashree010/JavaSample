package personal.development.src;

public class MyShape 
{
		private String name;
		public MyShape(String name)
		{
			this.name = name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public String getName()
		{
			return name;
		}
	
		
		public static void main (String a[]) throws Exception
		{
			MyShape shape1 = new MyShape("shape1");
			MyShape shape2 = shape1;
			createNewShape(shape2);
			System.out.println(shape2.getName());
		}
		public static void createNewShape (MyShape shape)
		{
//			shape.setName("New shape");
			shape = new MyShape("I’m new Shape!");
		}
}
