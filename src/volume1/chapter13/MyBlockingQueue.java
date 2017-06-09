package volume1.chapter13;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class MyBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(2);
        Consumer consumer = new Consumer(queue);
        Producer producer = new Producer(queue);
        for (int i = 0; i < 20; i++) {
            new Thread(producer, "Producer" + (i + 1)).start();

            new Thread(consumer, "Consumer" + (i + 1)).start();
        }

        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();
    }
}

class Producer implements Runnable

{

    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String temp = "A Product, 生产线程：" + Thread.currentThread().getName();
            System.out.println("Producer put" + Thread.currentThread().getName());
            queue.put(temp);//如果队列是满的话，会阻塞当前线程  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Consumer implements Runnable {

    BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String temp = queue.take();//如果队列为空，会阻塞当前线程  
            System.out.println("Consumer take:" + temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
