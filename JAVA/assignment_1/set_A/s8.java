public class s8
{
      int num;
      public s8()
      {
             num=0;
      }
      public s8(int num)
      {
             this.num=num;
      }
      public static void main(String args[])
      {
             s8 m1=new s8();
             if (args.length>0)
             {
                int n=Integer.parseInt(args[0]);
                s8 m2=new s8(n);
                System.out.println(m1.num);
                System.out.println(m2.num);
             }
             else
                System.out.println("Insufficient arguments");
      }
}
