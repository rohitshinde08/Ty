import java.util.*;
class q1
{
      void ap(int l, int b)
      {
           int area=l*b;
           int p=2*(l+b);
           System.out.println("Area = "+area);
           System.out.println("Perimeter ="+p);
      }
      public static void main(String args[])
      {
           System.out.println("Enter length : ");
           Scanner sc=new Scanner(System.in);
           int ln=sc.nextInt();
           System.out.println("Enter breadth : ");
           //Scanner sc1=new Scanner(System.in);
           int br=sc.nextInt();
           q1 a=new q1();
           a.ap(ln,br);
      }
}
