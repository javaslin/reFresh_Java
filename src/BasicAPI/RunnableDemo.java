package BasicAPI;

class Runnable1 implements Runnable{
    private String name;

    public Runnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(name+"i="+i);
        }

    }
}
public class RunnableDemo {
    public static void main(String[] args){
        Runnable1 rd1=new Runnable1("A");
        Runnable1 rd2=new Runnable1("B");
        Thread th1=new Thread(rd1);
        Thread th2=new Thread(rd2);
        th1.start();
        th2.start();
    }

}
