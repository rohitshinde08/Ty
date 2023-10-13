import java.io.*;
import java.util.Scanner;
class patient
{
 	String name;
 	int age,olevel,HRCTreport;
 	patient(String name,int age,int olevel,int HRCTreport) 
 	{
 	 this.name=name;
 	 this.age=age;
 	 this.olevel=olevel;
 	 this.HRCTreport=HRCTreport;
 	}
}
public class q1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("No of patients?");
	int n=sc.nextInt();
	patient[] ob=new patient[n];
	for(int j=0; j<n; j++)
	{
	 	System.out.println("Detailes of patient no "+j+1);
	 	System.out.print("Name:");
	 	String name=sc.next();
	 	System.out.println("Age:");
	 	int age=sc.nextInt();
	 	System.out.println("oxygen level:");
	 	int olevel=sc.nextInt();
	 	System.out.println("HRCT report:");
	 	int HRCTreport=sc.nextInt();
	 	ob[j]=new patient(name,age,olevel,HRCTreport);
	}
	for(int x=0; x<n; x++)
	{
		if(ob[x].olevel<95 && ob[x].HRCTreport>10)
		{
		 try 
		 {
		  	
		 }
		  catch(Exception e)
		  {
		   System.out.println("Patient is covid +ve and need hospitalization!");
		  }
		}
		else
		{
		 System.out.println("Name:"+ob[x].name);
		  System.out.println("Age:"+ob[x].age);
		   System.out.println("Oxygen levels:"+ob[x].olevel);
		    System.out.println("HRCT Repost"+ob[x].HRCTreport);
		}
	}
}
}
