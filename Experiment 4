class Account {
    String name;
    int accountNo;

    Account(String n, int a) {
        name = n;
        accountNo = a;
    }

    void display() {
        System.out.println(name + " " + accountNo);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String n, int a) {
        super(n, a);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String n, int a) {
        super(n, a);
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    PremiumSavingsAccount(String n, int a) {
        super(n, a);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Sam", 101);
        CurrentAccount c = new CurrentAccount("Ram", 102);
        PremiumSavingsAccount p =
                new PremiumSavingsAccount("John", 103);

        s.display();
        c.display();
        p.display();
    }
}
