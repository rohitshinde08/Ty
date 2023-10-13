import java.util.Date;
import java.text.SimpleDateFormat;
public class Q1
{
	public static String sdf(String format)
	{
	 SimpleDateFormat sdf=new SimpleDateFormat(format);
	 return sdf.format(new Date());
	}
	public static void main(String args[])
	{
	System.out.println("Current date is:"+sdf("dd/MM/yyyy"));
	System.out.println("Current date is:"+sdf("MM-dd-yyyy"));
	System.out.println("Current date is:"+sdf("EEEEEEEE MMMM dd yyyy"));
	System.out.println("Current date and time is:"+sdf("EEE MMMMM dd HH:mm:ss z yyyy"));
	System.out.println("Current time is:"+sdf("HH:mm:ss"));
	System.out.println("Current week of year is:"+sdf("w"));
	System.out.println("Current week of month:"+sdf("W"));
	System.out.println("Current day of the year is:"+sdf("D"));
	}
}
