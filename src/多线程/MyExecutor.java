package 多线程;

public class MyExecutor extends Thread {
    private int index;

    public MyExecutor(int i){
        this.index=i;
    }

    @Override
    public void run() {
        try {

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
