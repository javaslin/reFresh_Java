package 线程交替打印;

/*
两个线程交替打印A和B，如ABABAB
 */
public class Test {
    public static void main(String[] args) {
        final PrintAB print = new PrintAB();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    print.printA();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    print.printB();
                }
            }
        }).start();
    }
}

class PrintAB {
    private boolean flag = true;

    public synchronized void printA() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("A");
        flag = false;
        this.notify();
    }

    public synchronized void printB() {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("B");
        flag = true;
        this.notify();
    }
}

