import java.util.*;



public class setA1

	{
		public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);	
	    	ArrayList<String> a=new ArrayList<>();
	    	System.out.println("\n Enter no. of cities:");
	    	int n=sc.nextInt();
	    	System.out.println("Enter"+n+"Element:");
	    	for(int i=0;i<n;i++)
	    		a.add(sc.next());
	    		
	    	System.out.println("\nList element:"+a);
	    	
	    	Iterator<String> itr=a.iterator();
	    	while(itr.hasNext())
	    	{
	    		itr.next();
	    		itr.remove();
	    	}
	    	System.out.println("\n List elements after updation:"+a);
	    	sc.close();
	    }
	 }
