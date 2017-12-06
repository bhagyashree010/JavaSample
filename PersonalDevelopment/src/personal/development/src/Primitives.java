package personal.development.src;

public class Primitives {

	void f(Long[] long1)
	{
		Long[] long2 = new Long[4];
		long2 = long1;
		long2[1] = 7L;
		//return long2;
	}
	
	public void tricky(long arg1, long arg2)
	{
	  arg1 = 100;
	  arg2 = 200;
	  long temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	}
	
	public void swap(String i, String j)
	{
		String temp = i;
		i = j;
		j= temp;
	}
	
	public static void main(String[] args) {
		
		int tt = -21;
		System.out.println(tt%2);
		
		System.out.println(Double.toString(2.00-1.10));
		long MICROS_PER_DAY = 24*60*60*1000*1000;
		long MILLIS_PER_DAY = 24*60*60*1000;
		/**
		 * Expected is 1000 , but returns 5. Why? int overflow during micros multiplication. 
		 * watch out for overflow . Its a silent killer.
		 * Solution 24L * 60 * ..
		 */
		System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
		
		Primitives obj = new Primitives();
		Long[] long1 = new Long[]{2L,3L,4L};
		//Long[] long2 = 
				obj.f(long1);
		int[] arr1 = new int[7];
		//System.out.println(long1[0] + long1[1] + long1[2]);
		//jxSystem.out.println(long2[0] + long2[1] + long2[2]);
		
	/*	long pnt1 = 0;
		long pnt2 = 0;
		System.out.println("X: " + pnt1 + " Y: " +pnt1); 
		System.out.println("X: " + pnt2 + " Y: " +pnt2);
		System.out.println(" ");
		obj.tricky(pnt1,pnt2);
		  System.out.println("X: " + pnt1 + " Y:" + pnt1); 
		  System.out.println("X: " + pnt2 + " Y: " +pnt2);
		  
		 int six = 06;
		 int eight = 010;
		 int sixteen = 0x7fffffff;
		 char d = (char)79;
		 System.out.println(d);
		 System.out.println("Six: "+six+" and esighgt = "+eight+" sixten is :" +sixteen);
		 */
		 
		 /**
		  * swaps test
		  */
		 
		/* int i = 10;
		 int j = 20;
		 //obj.swap(i, j);
		 System.out.println("Before swap :: "+i+"and "+j);
		 System.out.println("After swap :: "+i+"and "+j);
		 
		 
		 String str1 = "abc";
		 String str2= "20";
		 obj.swap(str1, str2);
		 System.out.println("Before swap :: "+str1+"and "+str2);
		 System.out.println("After swap :: "+str1+"and "+str2);*/

	}
}
