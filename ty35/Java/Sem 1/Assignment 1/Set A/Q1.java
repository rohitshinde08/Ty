public class Q1
{
	int num;
	public Q1()
	{
	  num=0;
	}
	public Q1(int num)
	{
		this.num=num;
	}
	public static void main(String args[])
	{
		Q1 m1=new Q1();
		if(args.length>0)
		{
		 int n=Integer.parseInt(args[0]);
		 Q1 m2=new Q1(n);
		 System.out.println(m1.num);
		 System.out.println(m2.num);
		}
		else
		{
		 System.out.println("Insufficient Arguments...");
	        }
	}
}
