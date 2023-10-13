import java.util.Scanner;
abstract class staff
{
	protected int id;
	protected String name;
	staff(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	abstract void displaydetails();
}
class officestaff extends staff
{
 private String department;
 officestaff(int id,String name,String department)
 {
  super(id,name);
  this.department=department;
 }
 void displaydetails()
 {
        System.out.println("\nID:"+id);
	System.out.println("\nName:"+name);
	System.out.println("\nDepartment:"+department);
	//sc.nextLine();
 }
}
class Q2
{
 public static void main(String args[])
 {
 	Scanner sc=new Scanner(System.in);
 	int n=0;
 	System.out.println("\nEnter number of members:");
 	n=sc.nextInt();
 	//sc.nextLine();
 	officestaff os[]=new officestaff[n];
 	for(int i=0; i<n; i++)
 	{
 		System.out.println("Enter id of member "+(i+1)+":");
 		int id=sc.nextInt();
 		sc.nextLine();
 		System.out.println("Enter the name of member:");
 		String name=sc.nextLine();
 		System.out.println("Enter department name:");
 		String department=sc.nextLine();
 		os[i]=new officestaff(id,name,department);
 	}
 	
 	for(int i=0; i<n; i++)
 	{
 	os[i].displaydetails();
 	}
 }
}

