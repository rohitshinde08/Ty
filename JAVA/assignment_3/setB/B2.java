import java.util.*;
interface products{
}
class B2 implements products
{
      int id,c,q,cnt=0;
      String name;
      
      B2()
      {
            this.id=0;
            this.name=" ";
            this.c=0;
            this.q=0;
      }
      B2 (int i,String n,int cost,int qn)
      {
            this.id=i;
            this.name=n;
            this.c=cost;
            this.q=qn;
            cnt++;
      }
      void display()
      {
           System.out.println("OBJECT :"+cnt);
           System.out.println("ID :"+id);
           System.out.println("NAME :"+name);
           System.out.println("COST :"+c);
           System.out.println("QUANTITY :"+q);
      }

public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of products : ");
     int n2=sc.nextInt();
     B2 b[]=new B2[n2];
     for (int j=0;j<n2;j++)
     {
         System.out.println("Enter ID  : ");
         int i=sc.nextInt();
         System.out.println("Enter PRODUCT NAME " +(j+1)+" :  ");
         String n=sc.next();
         System.out.println("Enter COST " +(j+1)+" :  " );
         int cost=sc.nextInt();
         System.out.println("Enter QUANTITY " +(j+1)+" : \n");
         int qn=sc.nextInt();
         b[j]=new B2(i,n,cost,qn);
         System.out.println("\n Details of the product" +(j+1)+" : \n");
         b[j].display();
     }
     System.out.println();
         
}
} 
