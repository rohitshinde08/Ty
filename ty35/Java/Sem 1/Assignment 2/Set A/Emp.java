import java.util.Scanner;
class Emp
{
	int id;
	String name;
	String deptname;
	float salary;
	static int objcount=0;
	public Emp()
	{
	id=0;
	name="unknown";
	deptname="unknown";
	salary=0;
	}
	public Emp(int id,String name,String deptname,float salary)
	{
	this.id=id;
	this.name=name;
	this.deptname=deptname;
	this.salary=salary;
	objcount++;
	}
	public void display()
	{
	System.out.println("Employee id:"+id);
	System.out.println("Employee name:"+name);
	System.out.println("Employee Department name:"+deptname);
	System.out.println("Employee Salary:"+salary);
	}
	public static void main(String args[])
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Employees:");
		n=sc.nextInt();
		Emp[] ob=new Emp[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Details of Employee"+(i+1));
			//Scanner sc=new Scanner(System.in);
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter Name:");
			sc.nextLine();
		        String name=sc.nextLine();
		        System.out.println("Enter Department name:");
		        String deptname=sc.nextLine();
		        System.out.println("Enter Salary:");
		        float salary=sc.nextFloat();
		        ob[i]=new Emp(id,name,deptname,salary);
		}
		System.out.println("Number of employees:"+objcount);
		for(int i=0; i<n; i++)
		{
			ob[i].display();
		}
	}
	
	
}
