package personal.development.src.executors.employee;

public class Employee {

	String id;
	String name;
	long HRA;
	long DA;
	long basic;
	long PF;
	
	
	public Employee(String id, String name, long hRA, long dA, long basic,
			long pF) {
		super();
		this.id = id;
		this.name = name;
		HRA = hRA;
		DA = dA;
		this.basic = basic;
		PF = pF;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getHRA() {
		return HRA;
	}
	public long getDA() {
		return DA;
	}
	public long getBasic() {
		return basic;
	}
	public long getPF() {
		return PF;
	}
	
	
	
	
}
