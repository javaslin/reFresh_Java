package BasicAPI;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f=new File("d://test.txt");
        f.createNewFile();
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
    }
}
