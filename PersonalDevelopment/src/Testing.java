import java.util.Arrays;


public class Testing {
public static void main(String[] args) {
	
	
	String state1 = "Active";
	String state2 = "Pending";
	String state3 = "Available";
	
	String input = "Active";
	
	if(input.equals(state1) 
			|| input.equals(state3))
	{
		//do nothign
		System.out.println("Fine");
	}
	else
	{
		System.out.println("Nope");
	}
	if(!input.equals(state1)
			|| !input.equals(state3))
	{
		System.out.println("Not allowed ");
	}
	else
	{
		System.out.println("OK");
	}
	/*
			
			
	int[] integersArr = new int[] {2,3, 4, 5, 1 };
	short toCompare = 3;
	
	for (int i : integersArr) {
		if(i == toCompare)
		{
			System.out.println("yes for : "+i);
		}
		else
		{
			System.out.println("No for: "+i);
		}
	}
	/*
	Arrays.sort(integersArr);
	int i = Arrays.binarySearch(integersArr, toCompare);
	System.out.println(i);
	/*if(Array
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}*/
	
}
}
