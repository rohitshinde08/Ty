import java.io.*;
import java.util.*;

public class S13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int flag = 0, i;
        int m;

        System.out.print("Enter the number  : ");
        num = sc.nextInt();
        m = num / 2;
        try {
            if (num != 0) {
                if (num <= 2)
                    System.out.println(num + " is not prime number");
                else {
                    for (i = 2; i <= m; i++) {
                        if (num % i == 0) {
                            System.out.println(num + " is not prime number");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(num + " is prime number");
                    }
                }
            } else
                throw new NullPointerException();
        }

        catch (Exception e) {
            System.out.print("\n Number  is 0 : ");
        }

    }
}
