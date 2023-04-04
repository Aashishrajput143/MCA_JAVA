import java.util.Scanner;

public class EmployeeCaller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MessageReader msg = new MessageReader();
		System.out.println(msg.getMessages("input.id"));
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println(msg.getMessages("input.name"));
		String name = sc.nextLine();
		
		System.out.println(msg.getMessages("input.Salary"));
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(id,name,salary);
		//Employee emp = new Employee(101,"Aashish",50000.00);
//		System.out.println("Company name : "+emp.getCompanyname());
//		System.out.println("Emp Id : "+emp.getEmpid());
//		System.out.println("Emp name : "+emp.getEmpname());
//		System.out.println("Emp Dept : "+emp.getEmpDept());
//		System.out.println("Emp Salary : "+emp.getSalary());
//		System.out.println("Emp NetSalary : "+emp.netSalary());
		
		// It will print hash code
		// hash code - String representation of object
		System.out.println(emp.toString());// alpha numeric String
		// toString - Converts object into String Representation
		// it is a pre-defined method inside Object class
		// Object class is the parent class of All Java classes
		//It is also called GodClass
		sc.close();
	}
}
