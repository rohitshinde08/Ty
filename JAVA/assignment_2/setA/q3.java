import java.util.*;
import java.io.*;
import java.util.Scanner;
class q3{

public static void main(String args[])
{
     int a[]=new int[args.length];
     for (int j=0;j<args.length;j++)
     {
          a[j]=Integer.parseInt(args[j]);
      }
      System.out.println("\n");
         
      for (int i=0;i<args.length-1;i++)
          for (int j=i+1;j<args.length;j++)
              if (a[i]<a[j])
              {
                  int temp=a[j];
                  a[j]=a[i];
                  a[i]=temp;
              }
      System.out.println("Sorted array is\n");
      for (int i=0;i<args.length;i++)
          System.out.print(" \t "+a[i]);
}
}
