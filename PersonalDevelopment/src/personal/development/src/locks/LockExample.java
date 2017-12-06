package personal.development.src.locks;

public class LockExample {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "Bhagya");
		EmployeeRunnable runnable = new EmployeeRunnable(emp);
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);

		Thread t4 = new Thread(runnable);

		Thread t5 = new Thread(runnable);

		Thread t6 = new Thread(runnable);

		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		t5.setName("t5");
		t6.setName("t6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
	}
}

class EmployeeRunnable implements Runnable
{
	Employee emp = null;
	Lock lock = new Lock();
	
	public EmployeeRunnable(Employee emp)
	{
		this.emp = emp;
		emp.setSalary(2);
	}
	
	@Override
	public void run() 
	{
		int sal = 0;
		String currentThread = Thread.currentThread().getName();
		
		lock.lock();
		sal = emp.getSalary() + 2;
		System.out.println("Setting sal by thread "+currentThread+" :: "
				+sal);

		emp.setSalary(sal);
		
		lock.unlock();
//		System.out.println("Updated salary is in thread :: "
//				+ " "+currentThread+" is "+emp.getSalary());
	}
}
