package personal.development.src.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		boolean result = false;
		result =  set.add("Bhagya");
		System.out.println(result);
		result = set.add("Abc");
		System.out.println(result);
		result = set.add("Bhagya");
		System.out.println(result);
		result = set.add(null);
		System.out.println(result);
		
		System.out.println(set);
		
		List<String> lstStr = new ArrayList<>();
		lstStr.add("bhagay");
		
//		Collections.asLifoQueue(deque)
	}
}
