import java.io.*;
import java.util.*;

class S01 {
    public static void main(String[] args) {

        int n = 10;
        int i, j;
        int[] a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = Integer.parseInt(args[i]);

        for (i = 0; i < n; i++) {
            int c = 0;
            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    c++;
                }
            }

            if (c == 2) {
                System.out.print(a[i] + " ");
            }
        }

    }
}