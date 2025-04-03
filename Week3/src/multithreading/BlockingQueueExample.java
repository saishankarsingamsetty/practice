package multithreading;

import java.util.concurrent.*;

public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

       
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                	System.out.println("Produced: " + i);
                    queue.put(i); // if the queue is full then it waits for the elements
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    Integer data = queue.take(); // if the queue is empty then it waits for the elements
                    System.out.println("Consumed: " + data);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}

