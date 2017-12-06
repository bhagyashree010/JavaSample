package personal.development.src.executors;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number..");
		int num = scanner.nextInt();
		scanner.close();
		ExecutorService pool = Executors.newFixedThreadPool(10);
		Future<String> result = pool.submit(new ForecastFuture(num));
		try
		{
			System.out.println("Result obtained as per input is :: "+result.get());
		}
		catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			pool.shutdown();
		}
	}
}

class ForecastFuture implements Callable<String>
{
	int i ;
	public ForecastFuture(int val)
	{
		i = val;
	}
	@Override
	public String call() {
		if(i <10)
			return "Less than 10 received";
		else
			return "Greater than 10 received";
	}
}
