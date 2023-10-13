import java.io.*;
import java.lang.*;
import java.util.*;
abstract class order
{
 int id;
 String description;
 abstract void accept();
 abstract void display();
}
class purchaseorder extends order
{
	String cname;
	void accept()
	{
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter purchase order details:");
		System.out.println("Enter id,description,customer name::");
		id=Integer.parseInt(br.readLine());
		discr=br.readLine();
		cname=br.readLine();
		}
		catch(Exception e)
		{
		 	System.out.println("Exception caught...");
		}
	}
class salesorder extends order
{
	String vname;
	void accept()
	{
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sales order details:");
		System.out.println("Enter id,description,customer name::");
		id=Integer.parseInt(br.readLine());
		discr=br.readLine();
		vname=br.readLine();
		}
		catch(Exception e1)
		{
		 	System.out.prinln("Exception caught...");
		}
	}
        void display()
 	{
 	System.out.println("id:"+id);
 	System.out.println("description:"+description);
 	System.out.println("customer name:"+customername);
 	System.out.println("vendor name:"+discr);
 	}
}
public class o
{
 int id;
 String discr,cname,vname;
 public o(int id,String discr,String cname,String vname)
 {
  this.id=id;
  this.discr=discr;
  this.cname=cname;
  this.vname=vname;
 }
 public static void main(String args[])throws IOException
 {
  int i,ch;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  do
  {
 	System.out.println("(1)Purchase order\n(2)sales order \n(3)Exit");
 	ch=Integer.parseInt(br.readLine());
 	switch(ch)
 	{
 	 	case 1:
 	 	{
 	 	order[] p=new purchaseorder[3];
 	 	for(i=0; i<3; i++)
 	 	{
 	 	 p[i]=new purchaseorder();
 	 	 p[i].accept();
 	 	}
 	 	for(i=0; i<3; i++)
 	 	{
 	 	 p[i]=new purchaseorder();
 	 	 p[i].display();
 	 	}
 	 	break;
 	 	}
 	 	case 2:
 	 	{
 	 	order[] s=new salesorder[3];
 	 	for(i=0; i<3; i++)
 	 	{
 	 	 p[i]=new salesorder();
 	 	 p[i].accept();
 	 	}
 	 	for(i=0; i<3; i++)
 	 	{
 	 	 p[i]=new salesorder();
 	 	 p[i].display();
 	 	}
 	 	break;
 	 	}	
 	}
  }while(ch!=3);
 }
}

