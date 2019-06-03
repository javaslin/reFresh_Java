package 多线程;

public class WayOfOne extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "调用");
    }

    public static void main(String[] args) {
        WayOfOne wa = new WayOfOne();
        Thread thread = new Thread(wa, "T1");
        thread.start();
    }
}
