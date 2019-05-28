package BasicAPI;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask{
    @Override
    public void run() {
        SimpleDateFormat sd=new SimpleDateFormat("yyy-MM-dd HH:mm:ss:SSS");
        System.out.println(sd.format(new Date()));
    }
}
public class TimeDemo {
    public static void main(String[] args){
        Timer t=new Timer();
        MyTask mt=new MyTask();
        t.schedule(mt,1000,2000);

    }

}
