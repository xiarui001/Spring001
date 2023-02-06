package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class demo1 {
    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(0);
        integer.incrementAndGet();
        List<String> strings = Arrays.asList("a", "b", "a");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ExecutorService pool1 = Executors.newCachedThreadPool();
        pool1.submit(new Runnable() {
            public void run() {
                System.out.println("aaa");
            }
        });
        SynchronousQueue<String> queue1 = new SynchronousQueue<String>();
        queue1.poll();

        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
        queue.add("aa");

        ExecutorService pool = Executors.newCachedThreadPool();


    }

    public demo1(){}
    public void demo1(){}
}
