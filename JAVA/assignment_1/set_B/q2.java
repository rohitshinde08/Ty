import java.util.*;
class q2
{
      void ispositive(int n)
      {
           if (n>0)
           {
              System.out.println("Number is positive");
              if (n%2==0)
                 System.out.println("Even number: ");
              else
                 System.out.println("odd number");
           }
           else if(n<0)
              System.out.println("Number is negative: "); 
           else 
              System.out.println("Number is zero");
      }
      public static void main(String args[])
      {
           System.out.println("Enter number : ");
           Scanner sc=new Scanner(System.in);
           int num=sc.nextInt();
           q2 a=new q2();
           a.ispositive(num);
      }
}
