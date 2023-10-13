import java.util.Scanner;
class continent
{
	String cntname;
}
class country extends continent
{
	String country_name;
}
class state extends country
{
	String state_name;
}
class place extends state
{
	String place_name;
	place(String cntname,String country_name,String state_name,String place_name)
	{
		this.cntname=cntname;
		this.country_name=country_name;
		this.state_name=state_name;
		this.place_name=place_name;	
	}
	void display()
	{
	System.out.println("\nContinent:"+cntname);
	System.out.println("\ncountry:"+country_name);
	System.out.println("\nstate:"+state_name);
	System.out.println("\nPlace:"+place_name);
	}
}
class Q1{
 	public static void main(String args[])
 	{
 	 Scanner sc= new Scanner(System.in);
 	System.out.println("\nEnter Continent:");
 	String cnt=sc.nextLine();
	System.out.println("\nEnter country:");
	String country=sc.nextLine();
	System.out.println("\nState:");
        String state=sc.nextLine();
	System.out.println("\nPlace:");
        String place=sc.nextLine();
        place location=new place(cnt,country,state,place);
        location.display();
 	}
	}
