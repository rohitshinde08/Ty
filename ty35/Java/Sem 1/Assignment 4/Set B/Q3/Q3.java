import java.io.*;
class invaliddate extends Exception{
	public invaliddate(String message){
	super(message);
}
}
class mydate{
int day,month,year;
public mydate(int day,int month,int year)throws invaliddate{
	if(isValidDate(day,month,year))
	{
		this.day=ay;
		this.month=month;
		this.year=year;
	}
	else
	{
		throw new invaliddate("Invalid date:"+day+"/"+month+"/"+year);
	}
}
public void displaydate()
{
	System.out.println("Date:"+day+"/"+month+"/"+year);
	
}
public boolean isvaliddate(int day,int month,int year)
{
	int[] daysinmonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
	if(month>=1 && month<=12 && day>=1 && day<=daysinmonth[month])
	{
		if(month==2 && isLeapYear(year)){
			return day <=29;
		}
		return true;
	}
	return false;
}
public boolean isLeapYear(int year)
{
	return (year % 4==0 && year % 100 !=0)|| (year % 400==0);
}
}
public class Q3{
	public static void main(String args[])
	try{
	int day=Integer.parseInt(args[0]);
	int month=Integer.parseInt(args[1]);
	int year=Integer.parseInt(args[2]);
	mydate date=new mydate(day,month,year);
	date.displaydate();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Please provide day,month year as command line arguments!!!!");
	}
	catch(NumberFormatException e)
	{
		System.out.println("invalid integers for day,date and month");
	}
	catch(invaliddate e)
	{
		System.out.println("Error:"+e.getMessage());
	}
	
}
