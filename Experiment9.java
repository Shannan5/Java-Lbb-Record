class ReservationThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket reserved");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class StatusThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket confirmed");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        ReservationThread t1 = new ReservationThread();
        Thread t2 = new Thread(new StatusThread());

        t1.start();
        t2.start();
    }
}
