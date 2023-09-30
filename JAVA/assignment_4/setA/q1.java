import java.util.*;
class q1
{
      int age,oxy,hrct;
      static int cnt=0;
      String name;
      q1()
      {
            this.age=0;
            this.name=" ";
            this.oxy=0;
            this.hrct=0;
      }
      q1 (int a,String n,int o,int h)
      {
            this.age=a;
            this.name=n;
            this.oxy=0;
            this.hrct=h;
            cnt++;
      }
      void display()
      {
           System.out.println("PATIENT COUNT :"+cnt);
           System.out.println("NAME :"+name);
           System.out.println("AGE :"+age);
           System.out.println("OXIGEN LEVEL:"+oxy);
           System.out.println("HRCT LEVEL:"+hrct);
      }
      public static void main(String args[])
      {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter no of patients : ");
           int n2=sc.nextInt();
           q1 c[]=new q1[n2];
           int []a=new int[n2];
           int []o=new int[n2];
           int []h=new int[n2];
           String []n=new String[n2];
           for (int j=0;j<n2;j++)
           {
               System.out.println("\n\nEnter AGE OF PATIENT  : ");
               a[j]=sc.nextInt();
       	       System.out.println("Enter PATIENT NAME " +(j+1)+" :  ");
               n[j]=sc.next();
               System.out.println("Enter OXYGEN LEVEL OF PATIENT " +(j+1)+" :  " );
               o[j]=sc.nextInt();
               System.out.println("Enter HRCT LEVEL " +(j+1)+" :");
               h[j]=sc.nextInt();
               c[j]=new q1(a[j],n[j],o[j],h[j]);
               System.out.println("\n\nDetails of the patient" +(j+1)+" : \n");
               c[j].display();
           }
           System.out.println();
           for (int j=0;j<n2;j++)
           {
               if (o[j]<95 && h[j]>10)
               {
                   try
                   {
                      throw new NullPointerException("/n");
                   }
                   catch (Exception e)
                   {
                         System.out.println("Patient "+n[j]+" is positive");
                   }
               }
               else
               {
                   c[j].display();
               }
           }
      }
}
  
