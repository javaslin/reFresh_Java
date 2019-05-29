package 线程交替打印;


public class Test3 {
    volatile static boolean open=false;
    volatile static int index=0;
    static String s="adasdfsafwfvgs";
    static Object ob=new Object();
    static Thread t1=new Thread(new myRun1(),"线程1");
    static Thread t2=new Thread(new myRun2(),"线程2");
    public static void main(String[] args){
        t1.start();
        t2.start();
    }
    static class myRun1 implements Runnable{
        @Override
        public void run() {

            while(index<s.length()){
                synchronized (ob) {
                    if(open){
                        System.out.println(s.charAt(index++)+Thread.currentThread().getName());
                        open=false;
                    }else{
                        ob.notifyAll();
                        try {
                            ob.wait();
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                }

            }
        }

    }
    static class myRun2 implements Runnable{
        @Override
        public void run() {

            while(index<s.length()){
                synchronized (ob) {
                    if(!open){
                        System.out.println(s.charAt(index++)+Thread.currentThread().getName());
                        open=true;
                    }else{
                        ob.notifyAll();
                        try {
                            ob.wait();
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                }

            }
        }

    }
}
