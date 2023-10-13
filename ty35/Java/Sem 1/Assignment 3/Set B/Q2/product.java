import java.io.*;
import java.util.Scanner;
interface product1
{
}
class product implements product1
{
	int id,quantity;
	String name;
	double cost;
	public product(int id,String name,double cost,int quantity)
	{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	public static void main(String args[])throws IOException
	{
		int i,count=0;
		int id,quantity;
		String name;
	        double cost;
	        Scanner sc= new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of products:");
		int n=Integer.parseInt(br.readLine());
		product p[]=new product[n];
		for(i=0; i<n; i++)
		{
		 	System.out.println("Enter Details of product no "+(i+1));
			System.out.println("id:");
			id=Integer.parseInt(br.readLine());
			System.out.println("name::");
			name=br.readLine();
			System.out.println("quantity:");
			quantity=Integer.parseInt(br.readLine());
			System.out.println("Cost:");
			cost=Double.parseDouble(br.readLine());
			p[i]=new product(id,name,cost,quantity);
			count++;
		}
		if(p[0] instanceof product)
		{
		 System.out.println("Product Marker Interface");
		}
		System.out.println("ID\tName\tCost\tQuantity");
		for(product p1:p)
		{
		 	System.out.println(p1.id+"\t"+p1.name+"\t"+p1.cost+"\t"+p1.quantity);
		}
		System.out.println("Count:"+count);
	}
	
}
