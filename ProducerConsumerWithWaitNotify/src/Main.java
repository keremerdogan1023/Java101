public class Main {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.produce();
            }
        });

        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consume();
            }
        });

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}