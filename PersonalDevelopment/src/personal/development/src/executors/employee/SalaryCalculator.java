package personal.development.src.executors.employee;

import java.util.concurrent.Callable;

public class SalaryCalculator implements Callable<Long>
{
	Employee emp = null;
	public SalaryCalculator(Employee emp) {
		this.emp = emp;
	}
	
	@Override
	public Long call() throws Exception {
		
		//Compute salary
				return
						(emp.getBasic() + emp.getDA() + emp.getHRA()
				- (emp.getPF())
				);
//		return returnVal;		
		
	}
}
