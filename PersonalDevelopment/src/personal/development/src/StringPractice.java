package personal.development.src;

public class StringPractice {

	public static void main(String[] args) {
		
		StringPractice obj = new StringPractice();
		
//		System.out.println("calling meythod "+obj.notString(" added"));
//		System.out.println("char remove : "+obj.missingChar("Bhagyas", 6));
		System.out.println("backAround : "+obj.backAround("abctret"));
		System.out.println(Runtime.getRuntime().totalMemory());

		System.out.println(Runtime.getRuntime().freeMemory());
	}
	
 
	String notString(String str) 
	{
		if(str.trim().startsWith("not"))
		{
			return str;
		}
		else
		{
			return "not"+str;
		}
	}
	
	
	/*
	 * 
	 * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
	 *  The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
	 *
	 *missingChar("kitten", 1) "ktten"
	missingChar("kitten", 0)  "itten"
	missingChar("kitten", 4)  "kittn"
	 */
	String missingChar(String str, int n) 
	{
		return  str.substring(0, n) + str.substring(n+1, str.length());
	}
	
	
	
	/*
	 * Given a string, return a new string where the first and last chars have been exchanged.
	 *frontBack("code") = "eodc"
	 */
	public String frontBack(String str) 
	{
		if(str.length() <= 1)
		{
			return str;
		}
		return str.charAt(str.length()-1) + str.substring(1, str.length() -1) + str.charAt(0) ;
	}
	
	/*
	 * Given a string, we'll say that the front is the first 3 chars of the string. 
	 * If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
	 * abc78hy = abcabcabc
	 */
	String front3(String str) 
	{
		if(str.length() >= 3)
		{
			String subStr = str.substring(0, 3);
			return subStr+subStr+subStr;
		}
		return str+str+str;
	}

	/*
	 * Given a string, take the last char and return a new string with the last char added at the front and back, 
	 * so "cat" yields "tcatt".
	 * The original string will be length 1 or more.
	 */
	public String backAround(String str) 
	{
		char lastChar = str.charAt(str.length() - 1);
		return lastChar + str + lastChar;
	}


}
