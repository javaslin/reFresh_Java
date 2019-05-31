package BasicAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintDemo {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "test2.txt")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ps.println("hello world");
    }
}
