import java.util.Scanner;
public class Q3
{
	public static void main(String args[])
	{
	        int arr[][]=new int[10][10],arr2[][]=new int[10][10],arr3[][]=new int[10][10],arr4[][]=new int[10][10],arr5[][]=new int[10][10],sum=0;;
		System.out.println("Enter(nxm):");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter Array 1 is:\n");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
			 arr[i][j]=sc.nextInt(); 
			}
		}
		System.out.println("Entered Array 1 is:\n");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
			 System.out.print(arr[i][j]+"\t");
			}
		        System.out.println(" ");
		
		}
		System.out.println("Enter Array 2 is:\n");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
			 arr2[i][j]=sc.nextInt(); 
			}
		}
		System.out.println("Entered Array 2 is:\n");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
			 System.out.print(arr2[i][j]+"\t");
			}
			System.out.println(" ");
		}
		int ch=0;
		int i,j,tempp;
		while(ch!=4)
		{
		System.out.println("Enter (1)Addition (2)Multiplication (3)Transpose of any matrix (4)Exit");
		ch=sc.nextInt();
		switch(ch)
		{
		   case 1:
		      System.out.println("Addition:\n");
		      for(i=0; i<n; i++)
		       {
			for(j=0; j<m; j++)
			{
			   arr3[i][j]=arr[i][j]+arr2[i][j]; 
			   System.out.print(arr3[i][j]+"\t");
			}
			 System.out.println(" ");
		      }
		   break;
		
		   case 2:
		
		    System.out.println("Multipication:\n");
		      for(i=0; i<n; i++)
		       {
		  	for(j=0; j<m; j++)
		  	{
		  	  for(int k=0; k<n; k++)
		  	  {
		  	   sum+=arr[i][k]*arr2[k][j]; 
		          }
		          arr4[i][j]=sum;
		          sum=0;
		          System.out.print(arr4[i][j]+"\t");
		        }
			 System.out.println(" ");
			
	              }
		   break;
		
		   case 3:
		
		    System.out.println("Transpose:\n");
			for(i=0; i<m; i++)
		        {
			   for(j=0; j<n; j++)
			   {
			      int x=arr[j][i];
			      arr5[j][i]=arr[i][j];
			      arr5[i][j]=x;
			      System.out.print(arr5[i][j]+"\t");
			    }
			   System.out.println(" ");
			 
		       }
		   break;
		  }
		}		
	}
	
}
