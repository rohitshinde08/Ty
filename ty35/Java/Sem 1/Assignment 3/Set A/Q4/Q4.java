import java.util.Scanner;
interface cube
{
	public void print(int num);
}
class Q4
{
 	public static void main(String args[])
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter n:");
 		int n=sc.nextInt();
 		cube c=num->System.out.println("Cube is:"+(num*num*num));
 		c.print(n);
 		sc.close();
 	}
}
