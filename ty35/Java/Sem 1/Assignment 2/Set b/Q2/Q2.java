import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class CricketPlayer{
String name;
int noin;
int totalrun;
public CricketPlayer(String name,int noin,int totalrun)
{
	this.name=name;
	this.noin=noin;
	this.totalrun=totalrun;
} 
public double calcAvg()
{
	if(noin==0)
	{
		return 0.0;
	}
	else
	{
		return (double) totalrun/noin;
}
}
public String tostring()
{
	return "Name:"+name+",Innings:"+noin+",Total Runs:"+totalrun+",Batting Avg:"+calcAvg();
}
public static void sortt(CricketPlayer[] players){
	Arrays.sort(players,new Comparator<CricketPlayer>(){
	public int compare(CricketPlayer player1,CricketPlayer player2){
		return Double.compare(player2.calcAvg(),player1.calcAvg());
		}
		});
	}
}
public class Q2{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number of cricket players(n):");
	int n=sc.nextInt();
	sc.nextLine();
	CricketPlayer[] players = new CricketPlayer[n];
	for(int i=0; i<n; i++)
	{
		System.out.println("Enter Details for player "+(i+1)+":");
		System.out.print("Name:");
		String name=sc.nextLine();
		System.out.print("Innings:");
		int innings=sc.nextInt();
		System.out.print("Total runs:");
		int runs=sc.nextInt();
		sc.nextLine();
		players[i]=new CricketPlayer(name,innings,runs);
	}
	CricketPlayer.sortt(players);
	System.out.println("Details after sortin:");
	{
		for(CricketPlayer player : players){
			System.out.println(players);
		}
		sc.close();
  }
 }
}

