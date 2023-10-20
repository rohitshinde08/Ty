import java.io.*;
import java.util.*;

abstract class shape {
    int a;
    int b;

    abstract void printArea();

}

class rectangle extends shape {
    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.print("Enter length : ");
        a = sc.nextInt();
        System.out.print("Enter breadth : ");
        b = sc.nextInt();

    }

    void printArea() {
        int ar = a * b;
        System.out.println("The area of rectangle is  " + ar);
    }

}

class triangle extends shape {
    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.print("Enter height  :");
        a = sc.nextInt();
        System.out.print("Enter base   :");
        b = sc.nextInt();

    }

    void printArea() {
        float ar = (float) (a * b * 0.5);
        System.out.println("The area of triangle is : " + ar);
    }
}

class circle extends shape {
    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.print("Enter radius :  ");
        a = sc.nextInt();
        /*
         * System.out.print("Enter base ");
         * b=sc.nextInt();
         */

    }

    void printArea() {
        float ar = (float) (a * 3.1415 * a);
        System.out.println("The area of circle is  :  " + ar);
    }

}

public class S19 {
    public static void main(String[] args) {

        int op = 1, ch;
        Scanner sc = new Scanner(System.in);

        while (op >= 1 && op <= 4) {
            System.out.println(" 1:  find area of rectangle ");
            System.out.println(" 2:  find area of triangle ");
            System.out.println(" 3:  find area of circle ");
            System.out.println(" 4:  exit");
            System.out.println(" Enter the choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    rectangle r = new rectangle();
                    r.accept();
                    r.printArea();
                    break;
                case 2:
                    triangle r1 = new triangle();
                    r1.accept();
                    r1.printArea();
                    break;
                case 3:
                    circle r2 = new circle();
                    r2.accept();
                    r2.printArea();
                    break;
                case 4:
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error ! \nEnter a valid choice !!!!");
            }

        }
    }
}