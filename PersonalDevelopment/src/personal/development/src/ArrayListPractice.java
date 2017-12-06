package personal.development.src;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static List<Integer> lst = new ArrayList<Integer>();
	
	
	public boolean addInList(List<Integer> list)
	{
		list.add(10);
		return true;
	}
	
	public static void main(String[] args) 
	{
		ArrayListPractice obj = new ArrayListPractice();
		obj.addInList(lst);
		System.out.println("Afer:: "+lst);
	}
}
