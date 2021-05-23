package lab4.ques2.com.cg.eis.pl;

import lab4.ques2.com.cg.eis.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService es = new EmployeeService();
		es.getEmpDetails();
		es.displayEmpDetails();
	}

}
