import java.util.*;
import java.io.*;

public class S02{
      float wt;
	    float ht;
	    String fn;
	    String ln;
	float bm;
	S02()
	{
		wt=0;
		ht=0;
		fn=" ";
		ln=" ";
		bm=0;
	}
	S02(float ht,float wt,String fn,String ln)
	{
		this.fn=fn;
		this.ln=ln;
		this.wt=wt;
		this.ht=ht;
		this.bm=wt/(ht*ht);
	}
	void display()
	{
	
		System.out.println("First Name||Last Name||Weight(kg)||Height(cm)||BMI");
		System.out.println("  "+fn+"        "+ln+"         "+wt+"          "+ht+"           "+(bm));
	}

	
	public static void main(String args[])
	{
		String fn=args[0];
		String ln=args[1];
		float wt=Float.parseFloat(args[2]);
		float ht=Float.parseFloat(args[3]);
		S02 b1=new S02(ht,wt,fn,ln);
		b1.display();
		
	}
}
