import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance;

    BankAccount(double b) {
        balance = b;
    }

    void withdraw(double amount)
            throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance");

        balance -= amount;
        System.out.println("Balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            double b = sc.nextDouble();

            BankAccount a = new BankAccount(b);

            System.out.print("Enter withdrawal: ");
            double amount = sc.nextDouble();

            a.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Transaction completed");
            sc.close();
        }
    }
}
