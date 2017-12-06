package personal.development.src.data.structures;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("1", "One");
		map.put("2", "Two");
	
		for(Entry<String, String> entry : map.entrySet())
		{
			map.put("3", "Three");
			System.out.println(entry.getValue()+" ");
		}
	}
}
