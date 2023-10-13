
import java.util.Scanner;
interface operation
{
 float pi=3.14f;
 void area();
 void volume();
}
class cylinder implements operation 
{
	float radius,height;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		radius=sc.nextFloat();
		System.out.println("Enter height:");
		height=sc.nextFloat();
		sc.close();
	}
	public void area()
	{
		float area=2*pi*radius*(radius+height);
		System.out.println("\n Area:"+area);
	}
	public void volume()
	{
		float volume=2*pi*radius+radius*height;
		System.out.println("\n Volume:"+volume);
	}
}
class Q3
{
	public static void main(String args[])
	{
		cylinder c=new cylinder();
		c.input();
		c.area();
		c.volume();
	}
}
