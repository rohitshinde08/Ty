import sy.sy;
import ty.ty;
import java.util.Scanner;

public class stud
{
       private int rno;
       private String name;
       private sy Sy;
       private ty Ty;
       
       public stud(int rno,String name,sy Sy,ty Ty)
       {
              this.rno=rno;
              this.name=name;
              this.Sy=Sy;
              this.Ty=Ty;
       }
       
       public int calculateTotalMarks()
       {
              int syTotal=Sy.getct()+Sy.getmt()+Sy.getet();
              int tyTotal=Ty.gettm() + Ty.getpm();
              return syTotal+tyTotal;
       }
       
       public char calculateGrade()
       {
              int totalMarks=calculateTotalMarks();
              double percentage=((double)totalMarks/500)*100;
              
              if (percentage>=70)
                 return 'A';
              else if (percentage>=60)
                 return 'B';
              else if (percentage>=50)
                 return 'C';
              else if (percentage>=35)
                 return 'P';
              else 
                 return 'F';
       }
       
       public void displayResult()
       {
              System.out.println("Roll no. :"+rno);
              System.out.println("Name :"+name);
              System.out.println("Total marks :"+calculateTotalMarks());
              System.out.println("percentage :"+((double)calculateTotalMarks()/500)*100);
              System.out.println("Grade :"+calculateGrade());
       }
       
       public static void main(String args[])
       {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the no. of studs :");
              int n=sc.nextInt();
              sc.nextLine();
              for (int i=0;i<n;i++)
              {
                  System.out.println("Enter roll no. :");
                  int rno=sc.nextInt();
                  sc.nextLine();
                  System.out.println("Enter name :");
                  String name=sc.next();
                  System.out.println("Enter SY comp total :");
                  int comp=sc.nextInt();
                  System.out.println("Enter SY maths total :");
                  int math=sc.nextInt();
                  System.out.println("Enter SY elec total :");
                  int elec=sc.nextInt();
                  System.out.println("Enter TY theory marks total :");
                  int they=sc.nextInt();
                  System.out.println("Enter TY practical total :");
                  int pract=sc.nextInt();
                  
                  sy Sy =new sy(comp,math,elec);
                  ty Ty =new ty(they,pract);
                  stud stud=new stud(rno,name,Sy,Ty);
                  stud.displayResult();
              }
              sc.close();
       }
}
