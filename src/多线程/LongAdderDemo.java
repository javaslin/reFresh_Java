package 多线程;

import java.util.concurrent.atomic.LongAdder;

public class LongAdderDemo {
    static LongAdder adder = new LongAdder();


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                adder.increment();

            }, String.valueOf(i)).start();
        }
        Thread.sleep(200);
        System.out.println(adder.sum());

    }
}
