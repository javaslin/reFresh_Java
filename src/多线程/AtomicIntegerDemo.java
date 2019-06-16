package 多线程;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    int m = 0;
    AtomicInteger atomicInteger = new AtomicInteger();


    public void add() {
        m++;
    }

    public void add1() {
        atomicInteger.getAndIncrement();
    }


    public static void main(String[] args) throws InterruptedException {

        AtomicIntegerDemo a = new AtomicIntegerDemo();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    a.add1();
                    a.add();
                }
            }).start();
        }

        Thread.sleep(2200);

        System.out.println("m的值：" + a.m);
        System.out.println("atomicInteger的值：" + a.atomicInteger);
    }
}
