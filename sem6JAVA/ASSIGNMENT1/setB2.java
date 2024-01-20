import java.util.*;
class a2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> a=new HashMap<>();
			
		System.out.println("Enter the Number of Pairs:");
		
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
		System.out.println("\n Enter "+n+" Pairs(integer,string):");
		int k=sc.nextInt();
		sc.nextLine();
		System.out.println("\n  Enter value of entry:");
		String v=sc.nextLine();
		a.put(k,v);
		}
		System.out.println("Before sorting:"+a);
		TreeMap b=new TreeMap(a);
		System.out.println("After sorting:"+b);
			
	}
}
