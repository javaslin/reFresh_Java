package 线程交替打印;

public class Test4 {

    private int j;

    public static void main(String args[]) {

        Test4 tt = new Test4();

        Inc inc = tt.new Inc();

        Dec dec = tt.new Dec();

        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(inc);
            t.start();
            t = new Thread(dec);
            t.start();
        }

    }

    private synchronized void inc() {
        j++;
        System.out.println(Thread.currentThread().getName() + "-inc:" + j);
    }

    private synchronized void dec() {
        j--;
        System.out.println(Thread.currentThread().getName() + "-dec:" + j);
    }

    class Inc implements Runnable {

        public void run() {
            for (int i = 0; i < 100; i++) {
                inc();
            }
        }
    }

    class Dec implements Runnable {

        public void run() {
            for (int i = 0; i < 100; i++) {
                dec();
            }
        }
    }

}
