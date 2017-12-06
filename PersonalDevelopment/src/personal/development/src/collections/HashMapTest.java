package personal.development.src.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		/*Map<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "pqr");
		map.put(3, "xyb");
		System.out.println(map);*/
		
		NewKeyClass key1 = new NewKeyClass("honeywell");
		NewKeyClass key2 = new NewKeyClass("phoenix");
		NewKeyClass key3 = new NewKeyClass("niagara");
		NewKeyClass key4 = new NewKeyClass("novar");
		NewKeyClass key5 = new NewKeyClass("alerton");
		
		Object value = new Object();
		
		Map newMap = new HashMap();
		Object re = newMap.put(key1, value);
		//System.out.println("1: "+re.toString());
		re = newMap.put(key2, value);
		//System.out.println("2 : "+re.toString());
		re = newMap.put(key3, value);
		//System.out.println("3 : "+re.toString());
		re = newMap.put(key4, value);
		System.out.println("4 : "+re.toString());
		re = newMap.put(key5, value);
		System.out.println("5 : "+re.toString());
		
		Iterator iter = newMap.keySet().iterator(); 
		while(iter.hasNext())
		{
			System.out.println(((NewKeyClass)iter.next()).toString());
		}
		
	}
}

class NewKeyClass
{
	private String keyName;
	public NewKeyClass(String keyName)
	{
		this.keyName = keyName;
	}
	
	@Override
	public int hashCode() {
		if(keyName.indexOf("a") > -1)
			return 5;
		else
			return keyName.length();

	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(keyName.indexOf("a") > -1)
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return keyName;
	}
}
