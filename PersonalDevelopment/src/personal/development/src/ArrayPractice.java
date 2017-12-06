package personal.development.src;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayPractice {

	public static void main(String[] args) 
	{
		ArrayPractice obj = new ArrayPractice();
		obj.findIndexForSumOfNeighbours();
		String str1 = "101";
		String str2 = "11";
		String str3 = "102";
		
		obj.testreference();
		
		List<String> lstStr = new ArrayList<String>();
		lstStr.add(str1);
		lstStr.add(str2);
		lstStr.add(str3);
		System.out.println(lstStr);
		Collections.sort(lstStr);
		System.out.println(lstStr);
		
		Integer [] operations = {1,2};
		short CALCULATE_DEPOSIT_INDEX = 1;
		System.out.println("HI"+Arrays.asList(operations).contains((int)CALCULATE_DEPOSIT_INDEX));
		
		
//		Thread t = new Thread();
//		t.setDaemon(arg0)
	}
	
	/**
	 * You are given an array of numbers. 
	 * Find out the array index or position where sum of numbers preceeding 
	 * the index is equals to sum of numbers succeeding the index.
	 *  - See more at: http://www.java2novice.com/java-interview-programs/find-middle-index/#sthash.hmzlU5kC.dpuf
	 *  
	 */
	
	void findIndexForSumOfNeighbours()
	{
		int[] nums = {1,4,10,2,1,5,4,3,2};
		int prev = 0;
		int curr = 0;
		
		for (int i = 1; i < nums.length; i++) 
		{
			int next = 0;
			prev += nums[i-1];
//			System.out.println("Sum of prevs : "+prev);
			for(int j=i+1 ; j<nums.length ; j++)
			{
				next += nums[j];
			}
//			System.out.println("Sum of nexts : "+next);
			
			if(prev == next)
			{
				System.out.println("Found index value : "+nums[i]);
			}
			
		}
	}
	
	void testreference()
	{
		int[] a = new int[]{2,3,4,56,5};
		int[] b = a;
		
		a[2] = 77;
		System.out.println("Array test");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}
	}
}

class SerializationPractice implements Externalizable
{
	
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
