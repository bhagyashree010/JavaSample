package personal.development.src.executors.employee;

import java.util.List;


public class RunnableSalaryCalculator implements Runnable
{
	List<Employee> emps = null;
	public RunnableSalaryCalculator(List<Employee> emp) {
		this.emps = emp;
	}
	
	@Override
	public void run() {
		
		
		emps.stream().forEach(e ->
		System.out.println("Emp salary : "+
				(e.getBasic() + e.getDA() + e.getHRA()
						- (e.getPF())))
						);
		
	}
}
