import java.io.*;
import java.util.*;

class S07 {
    public static int radius;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = sc.nextInt();
        double sur_Area = 4 * 3.14 * (radius * radius);
        System.out.println("Surface Area of the sphere: " + sur_Area);

        double volume = ((4 / 3) * 3.14 * (radius * radius * radius));
        System.out.println("Volume of the sphere: " + volume);

    }
}
