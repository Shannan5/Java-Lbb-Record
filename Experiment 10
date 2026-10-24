class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int n) throws InterruptedException {
        while (available)
            wait();

        data = n;
        System.out.println("Produced: " + data);
        available = true;
        notifyAll();
    }

    synchronized void consume() throws InterruptedException {
        while (!available)
            wait();

        System.out.println("Consumed: " + data);
        available = false;
        notifyAll();
    }
}

class Main {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Thread p = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    b.produce(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread c = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    b.consume();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        p.start();
        c.start();
    }
}
