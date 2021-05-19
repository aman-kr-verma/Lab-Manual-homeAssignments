package payrollpolymorphism;

public class Academic extends Payroll {
	private String name;
	private int salary;
	
	public Academic () {}
	
	public Academic(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public void adjustSalary(int n) {
		this.salary=n;
		System.out.println("Academic sal: " + this.salary);
	}
	public void giveLecture() {
		System.out.println("Giving Lecture");
	}
	
	public void printDetails() {
		System.out.println("Name: " + this.name + ",salary: " + this.salary);
	}
	
}
