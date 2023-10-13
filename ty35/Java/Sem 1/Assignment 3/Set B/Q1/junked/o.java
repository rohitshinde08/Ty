import java.io.BufferreadReader;
import java.io.IOException;
import java.io.inputStreamReader;
abstract class order{
 int id;
 String descrption;
 }
class purchaseorder extends order
 {
 	String customername,vendorname;
 	public void acccept() throws IOException
 	{
 	 System.out.println("Enter id-description-names of customers and vendors:");
 	 BufferreadReader br= new BufferreadReader(new inputStreamReader(System.in));
 	 id=br.readLine();
 	 descrption=br.readLine();
 	 customername=br.readLine();
 	 vendorname=br.readLine();
 	}
 	public void display()
 	{
 	System.out.println("id:"+id);
 	System.out.println("description:"+description);
 	System.out.println("customername:"+customername);
 	System.out.println("vendorname:"+vendorname);
 	}
 	class salesorder
 
 }
