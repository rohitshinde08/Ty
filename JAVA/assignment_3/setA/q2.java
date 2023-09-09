import java.util.Scanner;
abstract class staff
{
       protected int id;
       protected String name;
       staff (int id,String name)
       {
             this.id=id;
             this.name=name;
       }
       abstract void displayd();
} 
class officestaff extends staff
{
      private String dept;
      officestaff (int id,String name,String dept)
      {
                  super(id,name);
                  this.dept=dept;
      }
      void displayd()
      {
           System.out.println("\nID :"+id);
           System.out.println("\nName :"+name);
           System.out.println("\nDepartment :"+dept);
      }
}
class q2
{
      public static void main(String args[])
      {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number of staff : ");
             int n=sc.nextInt();
             officestaff o[]=new officestaff[n];
             for (int j=0;j<n;j++)
             {
                 System.out.println("Enter ID : ");
                 int i=sc.nextInt();
                 System.out.println("Enter NAME : ");
                 String n2=sc.next();
                 System.out.println("Enter DEPARTMENT : ");
                 String dept=sc.next();
                 o[j]=new officestaff(i,n2,dept);
                 System.out.println("details of member : ");
                 o[j].displayd();
             }
     }
}

