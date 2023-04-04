//Encapsulation
//- Wrapping of data members and methods in a single unit is known as class
//Good Encapsulation
// Encapsulation + Data Hiding
// Data Hiding - private members and public methods
import java.util.Scanner;
// every java class internally inherit Object class Automatically
public class Employee extends Object {
	//instance Variables
	private int empid;
	private String empname;
	private String empDept;
	private double salary;
	private String companyname;
	
	//Default Constructor
	//- It is called when we create object of a class
	//- every java class has a by default constructor
	//- constructor is not a method so it don't have any return type
	// to initialize variables
	public Employee() {
		System.out.println("Default Cons....");
		this.companyname = "Brain Mentors";
	}
	public Employee(String empDept) {
		this();//will call default constructor
		System.out.println("Department Cons....");
		this.empDept = empDept;
	}
	//Parameterized Constructor
	public Employee(int empid,String empname,double salary) {
		this("MCA");// will call department constructor
		System.out.println("para Cons....");
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	//Getter and Setter
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompanyname() {
		return companyname;
	}
	
	//Earning
	public double getHRA() {
		return this.salary * 0.30;
	}
	public double getTA() {
		return this.salary * 0.15;
	}
	public double getDA() {
		return this.salary * 0.20;
	}
	public double getMA() {
		return this.salary * 0.10;
	}
	
	//Deductions
	public double getTDS() {
		return this.salary * 0.10;
	}
	public double getPF() {
		return this.salary * 0.05;
	}
	public double netSalary() {
		double earning = this.salary + getHRA() + getTA() + getDA() + getMA();
		double reductions = getPF()+getTDS();
		double finalSalary = earning-reductions;
		return finalSalary;
	}
	
	@Override
	public String toString() {
		//Create object of CommonUtils
		CommonUtils cu = new CommonUtils();
		//call FormatDate and FormatName
		return  "Emp Name : "+cu.FormatName(empname)+"\n"+
				"Emp Dept : "+empDept+"\n"+
				"Emp Salary : "+netSalary()+"\n"+
				"Date : "+cu.FormatDate();
	}
	
}