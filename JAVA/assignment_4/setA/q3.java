import java.io.*;
import java.util.*;
import java.io.File;
class q3
{
      public static void main(String args[]) throws IOException
      {
             //FileReader f=new FileReader("sample.txt");
             Scanner sc=new Scanner(System.in);
             System.out.print("Source file name :\n");
             String f1=sc.next();
             System.out.print("Destination file name :\n");
             String f2=sc.next();
             FileReader fin=new FileReader(f1);
             FileWriter fout=new FileWriter(f2,true);
             int c;
             while ((c=fin.read()) !=-1)
             {
                    fout.write(c);
             }
             System.out.println("copy finish...");
             fin.close();
             fout.close();
      }
}
