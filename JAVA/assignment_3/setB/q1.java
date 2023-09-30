import java.util.Scanner;
abstract class order
{
     int id,id1;
     String name,des,name1,des1;
     /*order(int id,String name,String des,int id1,String name1,String des1)
     {
          this.id=id;
          this.name=name;
          this.des=des;
          this.id1=id1;
          this.name1=name1;
          this.des1=des1;
     }*/
}
class purchase extends order
{
       void display(int id,String name,String des)
       {
            System.out.print("\n\n");
            System.out.println("\nId of the buyer: "+id);
            System.out.println("\nName of the buyer : "+name);    
            System.out.println("\nDescription: "+des);
       }  
       void input()
       {
             
             Scanner sc=new Scanner(System.in);
             System.out.println("enter id of the buyer : ");
             id=sc.nextInt(); 
             System.out.println("enter name of the buyer : ");
             String name=sc.next(); 
             System.out.println("enter description  : ");
             String des=sc.next();  
             display(id,name,des);
  
       }
 }
 class sales extends order
{
       
       void dp(int id1,String name1,String des1)
       {
            System.out.println("\nId of seller : "+id1);
            System.out.println("\nName of seller : "+name1);    
            System.out.println("\nDescription: "+des1);
       }  
       void ip()
       { 
             Scanner sc=new Scanner(System.in);
             System.out.println("enter id of seller  : ");
             id1=sc.nextInt(); 
             System.out.println("enter name of seller: ");
             String name1=sc.next(); 
             System.out.println("enter description  : ");
             String des1=sc.next();  
             dp(id1,name1,des1);
            
             
       }
 }
 class B1
{
       public static void main(String args[])
       {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the no. of orders");
              int n=sc.nextInt();    	
             sales o1[]=new sales[n];
             purchase o[]=new purchase[n];
     	     for (int j=0;j<n;j++)
             {
                 o1[j]=new sales();
                 o[j]=new purchase();
                 o[j].input();
                 System.out.print("\n");
                 o1[j].ip();
                 
                  	
                
         
            }

}
}
