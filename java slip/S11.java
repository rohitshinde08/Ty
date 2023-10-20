import java.io.*;
import java.util.*;

class college {

    int cid;
    String cnm, caddr;

    college(int cid, String cnm, String caddr) {
        this.cid = cid;
        this.cnm = cnm;
        this.caddr = caddr;

    }
}

class dept extends college {

    int dno;
    String dnm;

    dept(int cid, String cnm, String caddr, int dno, String dnm) {
        super(cid, cnm, caddr);
        this.dno = dno;
        this.dnm = dnm;

    }

    public void display() {
        System.out.print("\n" + cid + "\t" + cnm + "\t" + caddr + "\t" + dno + "\t" + dnm);
    }

}

class S11 {
    public static void main(String args[]) {

        System.out.print("\n college details : ");
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter col id : ");
        int cid = sc.nextInt();
        System.out.print(" Enter col name  ");
        String cnm = sc.next();
        System.out.print(" Enter col addr  ");
        String cd = sc.next();
        System.out.print("\nEnter dept no: ");
        int dno = sc.nextInt();
        System.out.print("Enter dept name  ");
        String dnm = sc.next();
        dept d = new dept(cid, cnm, cd, dno, dnm);

        System.out.print("\ncid\tcnm\tcaddr\tdno\tdnm \n ");
        d.display();
        // d.accept();

    }
}
