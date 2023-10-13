/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;*/
import java.io.*;
public class Q2{
	public static void main(String args[])
 	{
	String fn="sample.txt";
	
	try(BufferedReader br=new BufferedReader(new FileReader(fn)))
	{
		
		String line;
		StringBuilder content=new StringBuilder();
		while((line=br.readLine())!=null)
		{
			content.insert(0,line.toUpperCase()+"\n");
		}
		System.out.println("Orignal contents in Uppercase:");
		System.out.println(content);
		System.out.println("Contents in Reversed order:");
		System.out.println(content.reverse());
	}
	catch(Exception e) 
	{
	 	System.out.println("Error while reading the file:"+e.getMessage());
	}
	}
}
