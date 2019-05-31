package 线程交替打印;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 三个线程交替打印A、B、C
 */
public class Test1 extends Thread {

    private final static AtomicInteger atomI = new AtomicInteger();
    private final String str[] = {"A", "B", "C"};

    public Test1(String name) {
        this.setName(name);
    }

    public static void main(String[] args) {
        new Test1("A").start();
        new Test1("B").start();
        new Test1("C").start();
    }

    @Override
    public void run() {
        while (true) {
            // 满10次退出打印
            if (atomI.get() / 3 == 10) {
                break;
            }
            synchronized (atomI) {
                // 顺序打印A、B、C
                if (str[atomI.get() % 3].equals(getName())) {
                    atomI.getAndIncrement();
                    System.out.println(getName());
                    if ("C".equals(getName())) {
                        System.out.println();
                    }
                    // 当前线程打印打印完成后唤醒其它线程
                    atomI.notifyAll();
                } else {
                    // 非顺序线程wait()
                    try {
                        atomI.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

