import java.util.Date;
import java.text.SimpleDateFormat;
class date1
{
      public static void main(String args[])
      {
             Date Date=new Date();
             SimpleDateFormat df=new SimpleDateFormat();
             
             SimpleDateFormat df1=new SimpleDateFormat("dd/MM/yy");
             System.out.println("Current Date is "+df1.format(Date));
             
             SimpleDateFormat df2=new SimpleDateFormat("MM-dd-yyyy");
             System.out.println("Current Date is "+df2.format(Date));
             
             SimpleDateFormat df3=new SimpleDateFormat("EEEE MMMMMM dd yyyy");
             System.out.println("Current Date is "+df3.format(Date));
             
             SimpleDateFormat df4=new SimpleDateFormat("E MMMMMM dd hh:mm:ss z yyyy");
             System.out.println("Current Date is "+df4.format(Date));
             
             SimpleDateFormat df5=new SimpleDateFormat("dd/mm/yy hh:mm:ss a Z");
             System.out.println("Current Date is "+df5.format(Date));
             
             SimpleDateFormat df6=new SimpleDateFormat("hh:mm:ss");
             System.out.println("Current Date is "+df6.format(Date));
             
             SimpleDateFormat df7=new SimpleDateFormat("w");
             System.out.println("Current Date is "+df7.format(Date));
             
             SimpleDateFormat df8=new SimpleDateFormat("W");
             System.out.println("Current Date is "+df8.format(Date));
             
             SimpleDateFormat df9=new SimpleDateFormat("D");
             System.out.println("Current Date is "+df9.format(Date));
      }
}
