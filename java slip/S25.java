import java.io.*;
import java.util.*;

public class S25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String filename = sc.nextLine();
        File fn = new File(filename);
        if (fn.exists()) {
            System.out.println("File " + filename + " exists!");
            System.out.println("is file readable:" + fn.canRead());
            System.out.println("is file Writable:" + fn.canWrite());
            if (fn.isDirectory()) {
                System.out.println("File Type:Directory");
            } else {
                System.out.println("File Type:File");
            }
            System.out.println("File length is:" + fn.length());
        } else {
            System.out.println("File with given name does not exists");
        }
    }
}
