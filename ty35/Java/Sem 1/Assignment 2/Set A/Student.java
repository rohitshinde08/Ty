import java.util.Scanner;
class Student
{
	int rno;
	String name;
	int percentage;
        static int objcount=0;
	public Student()
	{
	rno=0;
	name=" ";
	percentage=0;

	}
	public Student(int rno,String name,int percentage)
	{
	this.rno=rno;
	this.name=name;
	this.percentage=percentage;
	objcount++;
	}
	public static void sortstud(Student[] ob)
	{
		for(int i=0; i<ob.length-1; i++)
		{
		for(int j=0; j<ob.length-i-1; j++)
		 {
		 	if(ob[i].percentage<ob[j+1].percentage)
		             {
		             Student temp=ob[j];
		 	     ob[j]=ob[j+1];
		 	     ob[j+1]=temp;
		 	     }
		 	
		 }
		}
	}
	public void display()
	{
	System.out.println("Student roll no:"+rno);
	System.out.println("Student name:"+name);
	System.out.println("Student percentage:"+percentage);
	}
	public static void main(String args[])
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students:");
		n=sc.nextInt();
	        Student[] ob=new Student[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Details of Student "+(i+1));
			//Scanner sc=new Scanner(System.in);
			System.out.println("Enter Roll no:");
			int rno=sc.nextInt();
			System.out.println("Enter Name:");
			sc.nextLine();
		        String name=sc.nextLine();
		        System.out.println("Enter percentage:");
		        int percentage=sc.nextInt();
		        ob[i]=new Student(rno,name,percentage);
		}
		System.out.println("Number of students:"+objcount);
		System.out.println("students before sort:");
		for(int i=0; i<n; i++)
		{
			ob[i].display();
		}
		sortstud(ob);
		System.out.println("students after sort:");
		for(Student Student:ob)
		{
		 System.out.println("roll no:"+Student.rno+"Name:"+Student.name+"percentage"+Student.percentage);
		}
	}
	}
