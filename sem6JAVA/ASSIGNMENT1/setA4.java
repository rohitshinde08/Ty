import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class setA4
{
	public static void main(String args[])
	{
		Hashtable<String,Long> a=new Hashtable<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Pairs:");
		int n=sc.nextInt();
		
		System.out.println("\n Enter "+n+ "Pairs(Name,Mobile number):");
		for(int i=0;i<n;i++)
			a.put(sc.next() ,sc.nextLong());
			
		System.out.println("\n List elements:"+a);
		sc.close();
	}
}
