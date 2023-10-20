
import java.io.*;
import java.util.*;

interface cube {
    int calculate(int x);
}

class S09 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        cube s = (int x) -> x * x * x;

        int ans = s.calculate(n);
        System.out.println("\n cube of < " + n + " > is : " + ans);
    }
}