import java.io.*;
import java.util.*;
public class Q3{
	public static void main(String args[])throws IOException
	{
		int c;
		String f1,f2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of first file:");
		f1=sc.next();
		System.out.println("Enter name of second file:");
		f2=sc.next();
		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2,true);
		while((c=fr.read())!=-1)
		{
		 	fw.write(c);
		}
		fw.append("\nEnd of file!!!");
		fr.close();
		fw.close();
	}
	/*try{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of first file:");
		String inputFile=reader.readLine();
		System.out.println("Enter the name of second file:");
		String outputFile=reader.readLine();
		try(BufferedReader br=new BufferedReader(new FileReader(inputFile));
	}*/
}
