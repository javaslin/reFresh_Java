package 多线程;

public class WayOfTwo implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        WayOfTwo w = new WayOfTwo();
        Thread thread = new Thread(w, "T1");
        thread.start();
    }
}
