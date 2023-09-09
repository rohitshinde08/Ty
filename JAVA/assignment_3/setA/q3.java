import java.util.*;
import java.io.*;
interface operation
{
       float pi=3.14f;
       void area();
       void volume();
}
class cylinder implements operation
{
      float r,h,v,area;
      public void ip()
      {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the radius: ");
             r=sc.nextFloat();
             System.out.println("Enter the height : ");
             h=sc.nextFloat();     
      } 
      public void area()
      {
             area=2*pi*r*h+2*pi*r*h;
             System.out.println("Area :"+area);
      }
      public void volume()
      {
            float v=2*pi*r*h;
            System.out.println("Volume :"+v);
      }
}
class q3
{
      public static void main(String args[])
      {
             cylinder a=new cylinder();
             a.ip();
             a.area();
             a.volume();
      }
}
