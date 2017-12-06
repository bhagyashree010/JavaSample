package personal.development.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		
		String 
			pattern = "[a-z&&[def]]";
//		pattern = "[def]";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher("abf2f1324def677df77");
//							   01234566789
		
		while(m.find())
		{
			System.out.println(" "+m.start());
		}
		
		
		Collection<? extends Number> ls = new ArrayList<Number>();
//		ls.add(new Integer(4));
		ls.add(null);
//		ls.add(new A1());
		ls= null;
	}
}

class A1 extends Number
{

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
