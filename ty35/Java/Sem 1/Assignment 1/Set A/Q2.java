import java.util.Scanner;
public class Q2
{
	public static void main(String args[])
	{
	double l,b,area,peri;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Length:");
	l=sc.nextDouble();
	System.out.println("Enter the Breath:");
	b=sc.nextDouble();
	area=l*b;
	peri=2*(l+b);
	System.out.println("Area is:"+area);
	System.out.println("Perimetere is:"+peri);
  } 
}
