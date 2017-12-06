package personal.development.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersPractice {

	private List<Integer> numbers = new ArrayList<Integer>();
	public static void main(String[] args) 
	{
		NumbersPractice obj = new NumbersPractice();
		
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 1; i<=12; i++)
		{
			numbers.add(i);
		}
		numbers.add(11);
		Collections.sort(numbers);
		obj.setNumbers(numbers);
		obj.findRepeatingNumber();
		
	}
	
	void findRepeatingNumber()
	{
		int sum = 0;
		int largestNum = numbers.get(numbers.size() -1);
		//find sum
		for (Integer num : numbers)
		{
			sum += num;
		}
		
		int repeatedNum = sum - largestNum*(largestNum +1)/2;
		System.out.println("repeated num "+repeatedNum);
	}
	
	public void setNumbers(List<Integer> numbers) 
	{
		this.numbers = numbers;
	}
}
