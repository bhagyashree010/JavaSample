package personal.development.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda 
{
	public static void main(String[] args) {

		Operation addition = (int a, int b) -> a+b; 
		
		Operation sub = new Operation()
		{
			public int add(int a, int b)
			{
				return b-a;
			}
//			public long sub(long a, long b) {
//				return a-b;
//			};
		};
		
		System.out.println(sub.add(2, 5));
		System.out.println(addition.add(2, 3));
		
		
		Employee emp1 = new Employee(1, 30000);
		Employee emp2 = new Employee(2, 120000);
		Employee emp3 = new Employee(3, 450000);
		Employee emp4 = new Employee(4, 1240000);
		
		Collection<Employee> listEmp = new ArrayList<>();
		listEmp.add(emp1);
		listEmp.add(emp2);
		listEmp.add(emp3);
		listEmp.add(emp4);
		
		listEmp.stream().forEach(e -> System.out.println(e.getSalary()));
//		int sumOfSalary = listEmp.stream().collect(Collectors.summingInt(Employee :: getSalary));
		
		int sumOfSalary = listEmp.stream().filter(e -> e.getSalary() > 50000).mapToInt(e -> e.getSalary()).sum();
		
		double averageSalary = listEmp.stream().collect(Collectors.averagingInt(Employee :: getSalary));
		System.out.println("Average: "+averageSalary);
		System.out.println("Sum" +sumOfSalary);
//				forEach(e -> e.getSalary());
	}
}

interface Operation 
{
	int add(int a, int b);
//	long sub(long a, long b);
}


class Employee{
	
	int salary;
	int empId;
	
	public Employee(int empId, int salary)
	{
		this.salary = salary;
		this.empId = empId;
	}
	
	
	public int getSalary()
	{
		return salary;
	}
}