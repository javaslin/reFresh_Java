package BasicAPI;

import java.io.File;

public class FileDemo2 {

    public static void main(String[] args){
        File f=new File("d:"+File.separator+"test.txt");
        if(f.exists()){
            boolean flag=f.exists();
            System.out.println(flag);
            f.delete();
        }
    }
}
