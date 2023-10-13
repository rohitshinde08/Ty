import SY.SYMarks;
import TY.TYMarks;
import java.util.Scanner;
public class Student{
 int rollno;
 String name;
 SYMarks syMarks;
 TYMarks tyMarks;
 public Student( int rollno,String name,SYMarks syMarks,TYMarks tyMarks)
 {
 	this.rollno=rollno;
        this.name=name;
        this.syMarks=syMarks;
        this.tyMarks=tyMarks;
 }
 public int calculateTotalMarks(){
 	int syTotal=syMarks.getCompTotal()+syMarks.getMathsTotal()+syMarks.getElecTotal();
 	int tyTotal=tyMarks.getTheory()+tyMarks.getPracticals();
 	return syTotal+tyTotal;
  }
  public char calculateGrade()
  {
  	int totalMarks=calculateTotalMarks();
  	double percentage=((double) totalMarks/500)*100;
  	if(percentage>=70){
  	     return 'A';
  	}
  	else if(percentage>=60){
  	     return 'B';
  	}
  	else if(percentage>=50){
  	     return 'C';
  	}
  	else if(percentage>=40){
  	     return 'P';
  	}
  	else {
  	     return 'F';
  	} 
  }
  public void displayResult(){
  	System.out.println("Roll Number:"+rollno);
  	System.out.println("Name:"+name);
  	System.out.println("Total Marks:"+calculateTotalMarks());
  	System.out.println("Percentage:"+((double)calculateTotalMarks()/500)*100);
  	System.out.println("Grade:"+calculateGrade());
  	System.out.println();
  }
  public static void main(String args[])
  {
  	Scanner sc=new Scanner(System.in);
  	System.out.print("Enter the number of students:");
  	int n=sc.nextInt();
  	sc.nextLine();
  	for(int i=0; i<n; i++)
  	{
         System.out.println("Enter roll no:");
         int rollno=sc.nextInt();
         sc.nextLine();
         System.out.println("Enter name:");
         String name=nextLine();
         System.out.println("Enter Sy Computer Total:");
         int sycomp=sc.nextInt();
          System.out.println("Enter Sy Maths Total:");
         int symat=sc.nextInt();
          System.out.println("Enter Sy Electronics Total:");
         int syElec=sc.nextInt();
         System.out.println("Enter Ty Theory Total:");
         int Tytheory=sc.nextInt();
         System.out.println("Enter Ty Practical Total:");
         int typract=sc.nextInt();
         SYMarks syMarks=new SYMarks(sycomp,symat,syElec);
         TYMarks tyMarks=new TYMarks(tytheory,typract);
         Student student=new Student(rollno,name,syMarks,tyMarks);
         student.displayResult();
  	}
  	
  	
  	}
  	
  	
  	
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 }
