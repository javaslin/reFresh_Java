package 多线程;

public class DeadLockDemo implements Runnable {
    private String lockA;
    private String lockB;

    public DeadLockDemo(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "持有锁" + lockA + "尝试获取锁" + lockB);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "持有锁" + lockB + "尝试获取锁" + lockA);

            }
        }

    }


    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";


        new Thread(new DeadLockDemo(lockA, lockB), "AAA").start();
        new Thread(new DeadLockDemo(lockB, lockA), "BBB").start();
    }
}
