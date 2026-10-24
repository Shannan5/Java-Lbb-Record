class Payment {
    void makePayment(int amount) {
        System.out.println("Cash: " + amount);
    }

    void makePayment(double amount) {
        System.out.println("Payment: " + amount);
    }

    void makePayment(String type, int amount) {
        System.out.println(type + ": " + amount);
    }
}

class UPIPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("UPI: " + amount);
    }

    public static void main(String[] args) {
        UPIPayment p = new UPIPayment();

        p.makePayment(100);
        p.makePayment(200.5);
        p.makePayment("Card", 300);
    }
}
