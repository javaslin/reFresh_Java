package 多线程.线程交替打印;

public class TestMain {
    /*
    线程1负责打印a,b,c,d

    线程2负责打印1,2,3,4

    要求控制台中输出的内容为 a1b2c3d4
     */
    static final Object object = new Object();

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            String a[] = {"a", "b", "c", "d"};

            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    synchronized (object) {
                        System.out.println("线程a 开始执行");
                        object.notify();
                        try {
                            System.out.println("线程a 开始等待");
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("线程a 继续执行");
                        System.out.println(a[i]);
                        System.out.println("线程a 执行结束");
                        object.notify();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            int a[] = {1, 2, 3, 4};

            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    synchronized (object) {
                        System.out.println("线程1 开始执行");
                        object.notify();
                        try {
                            System.out.println("线程1 开始等待");
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("线程1  继续执行");
                        System.out.println(a[i]);
                        System.out.println("线程1  执行结束");
                    }
                }

            }
        }).start();
    }
}

