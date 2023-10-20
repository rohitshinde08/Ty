import java.util.Scanner;

class Customer {
    String name;
    String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

class Depositor extends Customer {
    int accNo;
    double balance;

    public Depositor(String name, String phoneNumber, int accNo, double balance) {
        super(name, phoneNumber);
        this.accNo = accNo;
        this.balance = balance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: $" + balance);
    }
}

class Borrower extends Depositor {
    int loanNo;
    double loanAmount;

    public Borrower(String name, String phoneNumber, int accNo, double balance, int loanNo, double loanAmount) {
        super(name, phoneNumber, accNo, balance);
        this.loanNo = loanNo;
        this.loanAmount = loanAmount;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Loan Number: " + loanNo);
        System.out.println("Loan Amount: $" + loanAmount);
    }
}

public class S16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();

        Customer[] customers = new Customer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name: ");
            String name = scanner.next();
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.next();
            System.out.print("Enter account number: ");
            int accNo = scanner.nextInt();
            System.out.print("Enter balance: ");
            double balance = scanner.nextDouble();
            customers[i] = new Depositor(name, phoneNumber, accNo, balance);
            System.out.print("Enter loan number: ");
            int loanNo = scanner.nextInt();
            System.out.print("Enter loan amount: ");
            double loanAmount = scanner.nextDouble();
            customers[i] = new Depositor(name, phoneNumber, accNo, balance);
            customers[i] = new Borrower(name, phoneNumber, -1, -1, loanNo, loanAmount);
        }
        System.out.println("Customer Details:");
        for (int i = 0; i < n; i++) {
            customers[i].display();

            System.out.println();
        }
    }
}