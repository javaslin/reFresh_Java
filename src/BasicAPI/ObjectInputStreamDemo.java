package BasicAPI;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception{
        File f=new File("d:"+File.separator+"test.txt");
        InputStream ip=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(ip);
        Object o=ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
