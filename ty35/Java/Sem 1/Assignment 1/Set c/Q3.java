public class Q3{
	public static void main(String args[])
	{
		int numberoftables=15;
		int maxMulti=10;
		for(int table=1; table<=numberoftables; table++)
		{
			System.out.println("Multiplication Table for "+table+":");
			for(int mul=1;  mul<=maxMulti; mul++)
			{
				int result=table*mul;
				System.out.println(table+"x"+mul+"="+result);
			}
			System.out.println();
		}
	}
}
