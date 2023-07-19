import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    Random random = new Random();
    BlockingQueue<Integer> queue = new  ArrayBlockingQueue<Integer>(15);

    public void produce(){
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            try {
                Integer value = random.nextInt(150);
                queue.put(value);
                System.out.println("Sayı üretiliyor :" + value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void consume(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Integer value =  queue.take();
                System.out.println("Sayı tüketiliyor : " + value);
                System.out.println("Queue Size: " + queue.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
