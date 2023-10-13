import java.util.Scanner;
public class Q4
{
	public static void main(String args[])
	{
	 int a[]=new int[10],n,i;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of array:");
	 n=sc.nextInt();
	 for(i=0; i<n; i++)
	 {
	 	a[i]=sc.nextInt();
	 }
	 for(i=n-1; i>=0; i--)
	 {
	 System.out.println(+a[i]);
	 }	
	}
}
