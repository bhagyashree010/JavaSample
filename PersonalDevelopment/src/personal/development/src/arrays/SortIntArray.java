package personal.development.src.arrays;

import java.util.Arrays;
import java.util.List;

public class SortIntArray {
	public static void main(String[] args) {
		Integer[] inputArr = new Integer[10];
		inputArr[0] = 21;
		inputArr[1] = 3;
		inputArr[2] = 4;
		inputArr[3] = 11;
		inputArr[4] = 66;
		inputArr[5] = 50;
		
		System.out.println(inputArr.length);
		//Arrays.sort(inputArr);
		 
		SortIntArray obj = new SortIntArray();
		obj.addElement(inputArr, inputArr.length, 6, 44);
		
		System.out.println("AFTER");
		for (int i = 0; i < inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}
	}
	
	public void addElement(Integer[] source, int arrCurrSize, int position, Integer element)
	{
		source[position] = element;
		/*int[] copyArr = Arrays.copyOf(source, arrCurrSize+1);
		copyArr[copyArr.length-1] = element;
		
		for (int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i]);
		}
		
		source[5]= 103;
*/		
	}
}
