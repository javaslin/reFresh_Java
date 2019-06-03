package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class WayOfThree implements Callable {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        WayOfThree w = new WayOfThree();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(w);
        executor.submit(futureTask);
        executor.shutdown();
        try {
            System.out.println(futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
