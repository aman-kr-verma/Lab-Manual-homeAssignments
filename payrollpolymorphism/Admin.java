package payrollpolymorphism;

public class Admin extends Payroll {
	private String name;
	private int salary;
	public Admin() {}
	public Admin(String name, int sal) {
		super();
		this.name=name;
		this.salary=sal;
	}
	
	public void adjustSalary(int sal) {
		salary=sal;
		System.out.println("Admin's salary " + sal);
	}
	public void doAdminStuff() {
		System.out.println("Doing Admin stuff");
	}
	public void printDetails() {
		System.out.println("Name: "+ this.name + ", salary: " + this.salary);
	}
}
