import java.util.Scanner;
import java.util.TreeSet;
class a2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TreeSet<String> a=new
			TreeSet<>();
			
		System.out.println("Enter the Number of colours:");
		
		int n=sc.nextInt();
		
		System.out.println("\n Enter "+n+" Elements");
		
		for(int i=0;i<n;i++)
		a.add(sc.next());
		
		System.out.println("\n  elements:"+a);
		sc.close();
			
	}
}
