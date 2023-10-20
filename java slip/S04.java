
import java.io.*;
import java.util.*;

class cont {

	String  con_nm;
	cont(String   con_nm) {
		this.con_nm = con_nm;
	}


}

class contr extends cont {

	String coun_nm;
	contr(String con_nm, String coun_nm) {
		super(con_nm);
		this.coun_nm = coun_nm;
	}

}
class st extends contr {

	String st_nm;
	st(String con_nm, String coun_nm, String st_nm) {
		super(con_nm, coun_nm);
		this.st_nm = st_nm;
	}
}

class place  extends st {

	String plc_nm;
	place(String con_nm, String coun_nm, String st_nm, String plc_nm) {
		super(con_nm, coun_nm, st_nm);
		this.plc_nm = plc_nm;
	}

}

public class S04 {
	public static void main(String[] args) {

		//	cont b = new cont("as");
		place b1 = new place("Asia", "India", "Maharashtra", "Nashik");
		System.out.println(" Multilevel Inheritance  : ");
		System.out.println("\nContinent : " + b1.con_nm);
		System.out.println("Country : " + b1.coun_nm);
		System.out.println(" State  : " + b1.st_nm);
		System.out.println("Place  : " + b1.plc_nm);
	}
}
