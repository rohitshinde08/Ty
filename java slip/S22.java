import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    int rollno;
    String name;
    String className;
    double percentage;

    public Student(int rollno, String name, String className, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.className = className;
        this.percentage = percentage;
    }

    public void displayStudentInfo() {
        System.out.println("Roll No:" + rollno);
        System.out.println("Name:" + name);
        System.out.println("Class:" + className);
        System.out.println("Percentage:" + percentage + "%");
    }
}

public class S22 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Roll No: ");
            int rollno = Integer.parseInt(reader.readLine());

            System.out.print("Enter Name: ");
            String name = reader.readLine();

            System.out.print("Enter Class: ");
            String className = reader.readLine();

            System.out.print("Enter Percentage: ");
            double percentage = Double.parseDouble(reader.readLine());

            Student student = new Student(rollno, name, className, percentage);

            System.out.println("\nStudent Information:");
            student.displayStudentInfo();

        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}