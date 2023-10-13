import java.util.Scanner;
public class Q2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of rows & columns:");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int[][] mat=new int[rows][cols];
		System.out.println("Enter The elements of the matrix:");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		while(true)
		{
			System.out.println("(1)Sum of diagonal elements (2)Sum of upper diagonal elemets (3)Sum of lower diagonal elemets (4)Exit!");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					int dsum=calculatedsum(mat);
					System.out.println("Sum of diagonal elements:"+dsum);
					break;
				case 2:
					int up_dsum=calculate_updsum(mat);
					System.out.println("Sum of upper diagonal elements:"+up_dsum);
					break;
				case 3:
					int lw_dsum=calculate_lwdsum(mat);
					System.out.println("Sum of lower diagonal elements:"+lw_dsum);
					break;
				case 4:
					sc.close();
					System.exit(0);
					System.out.println("Exited sucessfully!");
					break;
				
			}
		}
	}
	public static int calculatedsum(int[][] mat)
	{
	int sum=0; int n=mat.length;
	for(int i=0; i<n; i++)
	{
		sum+=mat[i][i];
	}
	return sum;
	}
	public static int calculate_updsum(int[][] mat)
	{
	int sum=0; 
	int n=mat.length;
	for(int i=0; i<n; i++)
	{
	 for(int j=0; j<n; j++)
	 {
		sum+=mat[i][j];
	 }
	}
	return sum;
	}
	public static int calculate_lwdsum(int[][] mat)
	{
	int sum=0; 
	int n=mat.length;
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<=i; j++){
		sum+=mat[i][j];
	  }
	}
	return sum;
	}
	
	
}
