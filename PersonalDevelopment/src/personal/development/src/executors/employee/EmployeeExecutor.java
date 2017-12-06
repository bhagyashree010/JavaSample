package personal.development.src.executors.employee;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmployeeExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy HH:mm:ss:SSS");
		Date date = new Date();
		System.out.println("Started at "+sdf.format(date));
		List<Employee> employees = new ArrayList<Employee>();
		
		for(int i = 1; i<= 5000; i++)
		{
			employees.add(new Employee("emp"+i, "emp:"+i, 98+i, 50+i, 28+i, 38+i));
		}
		
		System.out.println("Employee list size :: "+employees.size());
		
		/*	Runnable calc = new RunnableSalaryCalculator(employees);
			Thread t = new Thread(calc);
			t.start();
			t.join();
		
		*/
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		
		employees.stream().forEach(e -> 
		{
			Future<Long> empSal = pool.submit(new SalaryCalculator(e));
			try {
				Long resultPerEmployee = empSal.get();
				System.out.println("Employee "+e.getId()+ "has salary = "
				+resultPerEmployee);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		Date stopDate = new Date();
		System.out.println("Ended at "+sdf.format(stopDate));

	}
}
