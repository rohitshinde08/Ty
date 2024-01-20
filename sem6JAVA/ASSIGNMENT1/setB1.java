import java.util.Scanner;
import java.util.TreeSet;
class setB1{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> a=new
			TreeSet<>();
			
		System.out.println("Enter the Number of elements:");
		
		int n=sc.nextInt();
		
		System.out.println("\n Enter "+n+" Elements");
		
		for(int i=0;i<n;i++)
		a.add(sc.nextInt());
		
		System.out.println("\nList elements:"+a);
		sc.close();
			
	}
}
