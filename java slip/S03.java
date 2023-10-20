import java.io.*;
import java.util.*;

public class S03{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int i;
        int n = sc.nextInt();
        String[] ct = new String[n];

        System.out.println("Enter the names of cities:");

        for (i = 0; i < n; i++) {
            System.out.print("City " + (i + 1) + ": ");
            ct[i] = sc.next();
        }
        Arrays.sort(ct);

        // Display
        System.out.println("\nCities in ascending order:");
        for (i = 0; i < n; i++)
            System.out.println(ct[i] + "\t");

    }
}
