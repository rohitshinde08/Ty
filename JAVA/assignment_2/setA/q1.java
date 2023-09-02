import java.util.*;
import java.io.*;
import java.util.Scanner;
class q1
{
      static int id,cnt=0;
      static String name;
      static String d;
      static float sal;
q1()
{
      this.id=0;
      this.name=" ";
      this.d=" ";
      this.sal=0.0f;
      cnt++;
}
q1(int i,String n2,String dep,float s)
{
      this.id=i;
      this.name=n2;
      this.d=dep;
      this.sal=s;
}
void display()
{
     System.out.println("OBJECT COUNT :"+cnt);
     System.out.println("ID :"+id);
     System.out.println("NAME :"+name);
     System.out.println("DEPARTMENT :"+d);
     System.out.println("SALARY :"+sal);
}
public static void main(String args[])
{
     int n=Integer.parseInt(args[0]);
     Scanner sc=new Scanner(System.in);
     q1 e2[]=new q1[n];
     for (int j=0;j<n;j++)
     {
         System.out.println("Enter ID : ");
         int i=sc.nextInt();
         System.out.println("Enter NAME : ");
         String n2=sc.next();
         System.out.println("Enter DEPARTMENT : ");
         String dep=sc.next();
         System.out.println("Enter SALARY : ");
         float s=sc.nextFloat();
         e2[j]=new q1(i,n2,dep,s);
         e2[j].display();
     }
}
}
