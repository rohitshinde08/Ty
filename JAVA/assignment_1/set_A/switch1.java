import java.util.*;
class switch1
{
      public static void main(String args[])
      {
             int op=1,s=0,fact=1,d;
             Scanner sc=new Scanner(System.in);
             while (op>=1 && op<=4)
             {
                   System.out.println("1.Cylinder : ");
                   System.out.println("2.Factorial : ");
                   System.out.println("3.Armstrong : ");
                   System.out.println("4.Exit : ");
                   op=sc.nextInt();
                   switch (op)
                   {
                          case 1 : System.out.println("Enter Radious : ");
                                   int r=sc.nextInt();
                                   System.out.println("Enter Height : ");
                                   int h=sc.nextInt();
                                   System.out.println("Volume = "+3.14*r*r*h);
                                   break;
                          case 2 : System.out.println("Enter number: ");
                                   int n=sc.nextInt();
                                   for (int i=1;i<=n;i++)
                                   {
                                       fact=fact*i;
                                   }
                                   System.out.println("Factorial = "+fact);
                                   break;
                          case 3 : System.out.println("Enter Number : ");
                                   int n1=sc.nextInt();
                                   int n2=n1;
                                   while (n2!=0)
                                   {
                                         d=n2%10;
                                         s=s+(d*d*d);
                                         n2=n2/10;
                                   }
                                   if (s==n1)
                                      System.out.println("It is armstrong");
                                   else
                                      System.out.println("it is not armstrong");
                                   break;
                          case 4 : System.exit(0);
                   }
             }
       }
}      
