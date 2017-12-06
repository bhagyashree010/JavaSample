package personal.development.src.lambdas.processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import personal.development.src.executors.employee.Employee;


public class ProcessEmployee {

	public Employee emp1 = new Employee("1", "Bhagya", 4230, 230, 347, 90);
	public Employee emp2 = new Employee("2", "Piyush", 3230, 230, 245, 90);
	public Employee emp3 = new Employee("3", "Suyash", 5230, 230, 745, 90);
	public Employee emp4 = new Employee("4", "Isha", 6230, 230, 945, 90);
	
	public List<Employee> listEmp = new ArrayList<Employee>();
	
	public static void main(String[] args) {
		
		ProcessEmployee obj = new ProcessEmployee();
		obj.addEmployees();
		
		/**
		 * provide employees only who have basic salary greater than 4500.
		 */
		obj.filterEmployees();
	}
	
	public void filterEmployees() {
		
		Stream<Employee> streamOfEmployees =  listEmp.stream();
		streamOfEmployees = streamOfEmployees.filter(emp -> 
		{
			System.out.println(emp.getBasic());
			return emp.getBasic() > 400;	
		} );
		long i = streamOfEmployees.count();
		System.out.println(i);
		/*List<Employee> listOfFiltredEmployees = streamOfEmployees.collect(Collectors.toList());
		
		for (Employee employee : listOfFiltredEmployees) {
			System.out.println(employee.getName());
		}*/
		
		
		
	}

	public void addEmployees() {
		listEmp.add(emp1);
		listEmp.add(emp2);
		listEmp.add(emp3);
		listEmp.add(emp4);
		for (Employee employee : listEmp) {
			System.out.println(employee.getName());
		}
	}
}
