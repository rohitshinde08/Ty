import java.util.Scanner;

class Employee {
    double basicSalary;

    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSalary() {
        return basicSalary;
    }
}

class Manager extends Employee {
    double travelAllowance;
    double houseRentAllowance;

    public Manager(double basicSalary, double travelAllowance, double houseRentAllowance) {
        super(basicSalary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    @Override
    public double getSalary() {
        return basicSalary + travelAllowance + houseRentAllowance;
    }
}

public class S24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee's Basic Salary: $");
        double employeeBasicSalary = scanner.nextDouble();

        System.out.print("Enter Manager's Basic Salary: $");
        double managerBasicSalary = scanner.nextDouble();

        System.out.print("Enter Manager's Travel Allowance: $");
        double managerTravelAllowance = scanner.nextDouble();

        System.out.print("Enter Manager's House Rent Allowance: $");
        double managerHouseRentAllowance = scanner.nextDouble();

        Employee employee = new Employee(employeeBasicSalary);
        Manager manager = new Manager(managerBasicSalary, managerTravelAllowance, managerHouseRentAllowance);

        System.out.println("Employee's Salary: $" + employee.getSalary());
        System.out.println("Manager's Salary: $" + manager.getSalary());
    }
}
