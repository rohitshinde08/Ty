import java.io.*;
import java.util.*;
class Q1
{
  public static void main(String []args)throws IOException
  {
    String name,line;
    int cost=0,ch,flag=0,i,tcost=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    File f=new File("book.dat");
    RandomAccessFile rf=new RandomAccessFile(f,"rw");
    do
    {
       System.out.println("MENU");
       System.out.println("1.search\n2.display book and total cost");
       System.out.println("enter your choice");
       ch=Integer.parseInt(br.readLine());
       switch(ch)
       {
         case 1:
              rf.seek(0);
              System.out.println("enter book name to search:");
              name=br.readLine();
              while(rf.getFilePointer()!=f.length())
              {
                line=rf.readLine();
                String a[]=line.split(" ");
                if(a[1].equals(name))
                { 
                  System.out.println("book availble");
                  flag=1;
                  break;
                }
                else
                  flag=2;
              }
              if(flag==2)
              System.out.println("book unavailable");
              break;
              
         case 2:
              rf.seek(0);
              while(rf.getFilePointer()!=f.length())
              {
                line=rf.readLine();
                String a[]=line.split(" ");
                cost=cost+(Integer.parseInt(a[2])*Integer.parseInt(a[3]));
                System.out.println(a[1]+"\t"+cost);
                tcost=tcost+(Integer.parseInt(a[2])*Integer.parseInt(a[3]));
              }
              System.out.println("TOTAL COST\t"+tcost);
              break;
              }
              }while(ch!=2);
              }
              }
              
                
                           


