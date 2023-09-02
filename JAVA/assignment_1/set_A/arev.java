import java.util.*;
class arev
{
      public static void main(String args[])
      {
             int n,i;
             System.out.println("Enter size of array : ");
             Scanner sc=new Scanner(System.in);
             n=sc.nextInt();
             int[] a=new int[n];
             System.out.println("Enter element : ");
             for (i=0;i<n;i++)
             {
                 a[i]=sc.nextInt();
             }
             System.out.println("Array : ");
             for (i=0;i<n;i++)
             {
                 System.out.println(a[i]);
             }
             System.out.println("Array in reverse order: ");
             for (i=n-1;i>=0;i--)
             {
                 System.out.println(a[i]);
             }
      }
}
