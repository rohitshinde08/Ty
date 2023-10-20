import java.util.Scanner;

public class S17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int diagonalSum = 0;
        for (int i = 0; i < Math.min(rows, cols); i++) {
            diagonalSum += array[i][i];
        }

        System.out.println("The sum of diagonal elements is: " + diagonalSum);

        sc.close();
    }
}
