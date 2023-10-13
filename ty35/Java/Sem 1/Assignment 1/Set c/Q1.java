import java.util.Scanner;
public class Q1{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of names:");
		int n=sc.nextInt();
		sc.nextLine();
		String[] names=new String[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter name number #"+(i+1));
			names[i]=sc.nextLine();
		}
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(names[i].compareTo(names[j])<0)
				{
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Names in descending order:");
		for(int i=0; i<n; i++)
		{
			System.out.println(names[i]);
		}
		sc.close();
	}
	
}
