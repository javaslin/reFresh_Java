package 多线程;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ContainerNotSafeDemo {



    public static void main(String[] args) {
         List<String> list = Collections.synchronizedList(new ArrayList<>());

        for (int i = 0; i <30 ; i++) {
            new Thread(() ->{
                list.add(UUID.randomUUID().toString().substring(0,7));
                System.out.println(list);
            },String.valueOf(i)).start();

        }
    }
}
