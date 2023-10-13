import java.util.Scanner;
public class Q3
{
	public static void main(String args[])
	{
		double r,h;
		int ch;
		System.out.println("Enter as per your choice:\n(1)Calculate volume of a cylinder.\n(2)Find the factorial of a given number.\n(3)Check the number is armstrong or not.\n(4)Exit");
		Scanner sc=new Scanner(System.in);
		ch=Integer.parseInt(sc.next());
		switch(ch)
		{
				case 1:
				{
					System.out.println("Enter Radius & Height of cylinder");
			                r=sc.nextFloat();
			                h=sc.nextFloat();
			                System.out.println("Volume:"+(3.14*r*h));
			                break;
				}
				case 2:
				{
          		         	 System.out.println("Enter a Number:");
          		         	 int num=Integer.parseInt(sc.next());
          		         	 int fact=1;
          		         	 for(int i=1; i<=num; i++)
          		         	 {
          		         	 	fact*=i;
          		         	 }			
          		         	  System.out.println("Factorial is:"+fact);
          		         	  break;	
				}
				case 3:
				 {
					 System.out.println("Enter a Number:");
					 int arm=sc.nextInt();
					 int temp=arm;
					 int sum=0;
					 while(arm>0)
					 {
					 	temp=arm%10;
					 	sum=sum+temp*temp*temp;
					 	arm=arm/10;
					 }
					 if(sum==temp)
					 {
					 	System.out.println("Armstrong Number..!");
					 }
					 else
					 {
					 	System.out.println("Not Armstrong..!");
					 }
					 break;
				 }
				 case 4:
				 {
				 	System.out.println("Exited!");
				 	break;
				 }	 
	
		}while(ch!=4);
	}
}
