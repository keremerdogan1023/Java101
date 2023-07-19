import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
    Random random = new Random();
    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<Integer>();

    private int sizeLimit = 15;

    public void produce(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock){
                if(queue.size() == sizeLimit){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = random.nextInt(150);
                queue.offer(value);
                System.out.println("Sayı üretiliyor: " +value);
                lock.notify();
            }
        }
    }
    public void consume(){
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock){
                if (queue.size()== 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = queue.poll();
                System.out.println("Sayı tüketiliyor: "+ value);
                System.out.println("Queue Size : " + queue.size());
                lock.notify();
            }
        }
    }
}
