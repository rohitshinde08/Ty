import java.util.*;
import java.io.*;
import java.util.Scanner;
class q4{

public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first name of student : ");
     String f1=sc.next();
     System.out.println("Enter middle name of student : ");
     String m1=sc.next();
     System.out.println("Enter last name of student : ");
     String l1=sc.next();
     int l=m1.length();
     String a=m1.substring(0,1);
     String b=m1.substring(1,l);
     a=a.toUpperCase();
     m1=a+b;
     System.out.println(" LAST    FIRST    MIDDLE : ");
     System.out.println(l1+"\t"+f1+"\t"+m1);
}
}    
