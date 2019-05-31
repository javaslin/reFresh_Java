package BasicAPI;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:" + File.separator + "test.txt");
        if (f.exists()) {
            f.delete();
        } else {
            f.createNewFile();
        }
    }
}
