abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    @Override
    public int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    @Override
    public int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    @Override
    public int getBalance() {
        return 200;
    }
}

public class S21 {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        System.out.println("Balance in Bank A: Rs." + a.getBalance());
        System.out.println("Balance in Bank B: Rs." + b.getBalance());
        System.out.println("Balance in Bank C: Rs." + c.getBalance());
    }
}