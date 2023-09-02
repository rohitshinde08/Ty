import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.InputStreamReader;
import java.io.IOException;
class q2
{
      static int rno;
      static String name;
      static float per;
q2()
{
      this.rno=0;
      this.name=" ";
      this.per=0.0f;
}
q2(int r,String n,float p)
{
      this.rno=r;
      this.name=n;
      this.per=p;
}
void display()
{
     System.out.println("R.NO :"+rno);
     System.out.println("NAME :"+name);
     System.out.println("PERCENTAGE :"+per);
}
public static void main(String args[])
{
     int n=Integer.parseInt(args[0]);
     float a[]=new float[n];
     Scanner sc=new Scanner(System.in);
     q2 s1[]=new q2[n];
     for (int j=0;j<n;j++)
     {
         System.out.println("Enter ROLL NUMBER : ");
         int r=sc.nextInt();
        
         System.out.println("Enter NAME : ");
         String n2=sc.next();
        
         System.out.println("Enter PERCENTAGE : ");
         a[j]=sc.nextFloat();
         
         s1[j]=new q2(r,n2,a[j]);
      }
      System.out.println("\n");
         
      for (int i=0;i<n-1;i++)
          for (int j=i+1;j<n;j++)
              if (a[i]<a[j])
              {
                  float temp=a[j];
                  a[j]=a[i];
                  a[i]=temp;
              }
      System.out.println("Sorted array is\n");
      for (int i=0;i<n;i++)
          System.out.print(" \t "+a[i]);
}
}
