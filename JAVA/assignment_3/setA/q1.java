class cont
{
      String contn;
      cont (String contn)
      {
           this.contn=contn;
      }
      void displayc()
      {
           System.out.println("Continent :"+contn);
      }
}
class country extends cont
{
      String cname;
      country (String cname,String contn)
      {
              super(cname);
              this.cname=cname;
      }
      void displaycountry()
      {
           displayc();
           System.out.println("country :"+cname);
      }
}
class state extends country
{
      String state,city;
      state (String contn,String cname,String state,String city)
      {
             super(contn,cname);
             this.state=state;
             this.city=city;
      }
      void display()
      {
           displaycountry();
           System.out.println("\nstate :"+state);
           System.out.println("\nCity :"+city);
      }
}
class q1
{
      public static void main(String args[])
      {
             state s=new state("ASIA","BHARAT","MAHARASTHRA","NASHIK");
             s.display();
      }
}
