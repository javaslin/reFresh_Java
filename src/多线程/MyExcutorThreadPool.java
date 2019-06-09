package 多线程;

import java.util.concurrent.*;

public class MyExcutorThreadPool {
    static class HoldThread implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "办理业务");
        }
    }


    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(2, 5, 1L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(3));
        for (int i = 0; i < 10; i++) {
            es.execute(new HoldThread());
        }
    }
}
