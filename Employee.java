package GFT1;

public class Employee {
	private int empid;
	private int esalary;
	private String ename;


	public Employee() {
		super();
	}


	public Employee(int empid, int esalary, String ename) {
		super();
		this.empid = empid;
		this.esalary = esalary;
		this.ename = ename;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public int getEsalary() {
		return esalary;
	}


	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int calsal() {
		return esalary;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", esalary=" + esalary + ", ename=" + ename + "]";
	}


	public static void main(String[] args) {
		Employee e = new Employee(1001, 10000, "Aniket");
		System.out.println(e.toString());
		System.out.println("Salary = "+e.calsal());
		
	}

}
