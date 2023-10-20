import java.io.*;
import java.util.*;

class S05 {
	int id;
	String name, des_nm;
	float sal;

	//static int objcnt = 0;
	S05(int id, String name, String des_nm, float sal) {
		this.id = id;
		this.name = name;
		this.des_nm = des_nm;
		this.sal = sal;
		//	objcnt++;

	}
	
	public String toString() {
		return "Employee [Empid=" + id + ", Empname=" + name + ", Empdesignation=" + des_nm + ", Empsal="
			   + sal + "]";
	}

	public static void main(String[] args) {

		//emp ob1 = new emp()
		Scanner scanner = new Scanner(System.in);

		// Input: Employee information
		System.out.print("Enter Employee ID: ");
		int eid = scanner.nextInt();
		System.out.print("Enter Employee Name: ");
		String enm = scanner.next();
		System.out.print("Enter Employee Designation: ");
		String ed = scanner.next();
		System.out.print("Enter Employee Salary: ");
		float  es = scanner.nextFloat();

		// Creating an Employee object
		S05 employee = new S05(eid, enm, ed, es);
		System.out.println("\nEmployee Information:");
		System.out.println(employee);


	}
}