import java.io.*;
import java.util.*;

class S06

{
    public static void main(String[] args) throws IOException {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("\n Enter file name : ");
        String file = sc1.next();

        FileReader f = new FileReader(file);
        Scanner sc = new Scanner(f);
        String ch, ch3;
        while (sc.hasNext()) {

            StringBuilder ch1 = new StringBuilder();
            // StringBuilder ch2 = new StringBuilder();
            ch = sc.next();
            ch1.append(ch);
            ch1 = ch1.reverse();
            ch3 = ch1.toString();
            ch3 = ch3.toUpperCase();
            System.out.println(ch3);
        }
        f.close();
    }

}
