package _1_Encapsulation_GetterSetter;

public class _1_Encapsulation_GetterSetter {

	private int empId;
	private String empName;
	private int salary;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("Employee id : "+ getEmpId());
		System.out.println("Employee name : "+ getEmpName());
		System.out.println("Employee Salary : "+ getSalary());
	}


	public static void main(String[] args) {
		_1_Encapsulation_GetterSetter _1_Encapsulation_GetterSetter = new _1_Encapsulation_GetterSetter();
		_1_Encapsulation_GetterSetter.setEmpId(1);
		_1_Encapsulation_GetterSetter.setEmpName("Amit Sharma");
		_1_Encapsulation_GetterSetter.setSalary(20000);
		_1_Encapsulation_GetterSetter.displayDetails();
		
		System.out.println("-----------------------------------------------------");
		_1_Encapsulation_GetterSetter.setEmpId(2);
		_1_Encapsulation_GetterSetter.setEmpName("Prachi Sharma");
		_1_Encapsulation_GetterSetter.setSalary(10000);
		_1_Encapsulation_GetterSetter.displayDetails();

	}

}
