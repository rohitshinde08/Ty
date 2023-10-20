import java.util.*;
import java.io.*;
import java.io.File;

class S14 {
    public static void main(String args[]) throws IOException {
        // FileReader file = new FileReader("ok.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Source File Name : \n");
        String f1 = sc.next();
        System.out.println("Destination File Name : \n");
        String f2 = sc.next();
        FileReader fin = new FileReader(f1);
        FileWriter fout = new FileWriter(f2, true);
        int c;
        while ((c = fin.read()) != -1) {
            fout.write(c);
        }
        System.out.println("Copying Finished...");
        fin.close();
        fout.close();

    }

}
