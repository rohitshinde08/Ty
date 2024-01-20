import java.util.Scanner;
import java.util.LinkedList;
class a2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> a=new
			LinkedList<>();
			
		System.out.println("Enter the Number of Friends:");
		
		int n=sc.nextInt();
		
		System.out.println("\n Enter "+n+" Elements");
		
		for(int i=0;i<n;i++)
		a.add(sc.next());
		
		System.out.println("\n Linked List elements:"+a);
		sc.close();
			
	}
}
