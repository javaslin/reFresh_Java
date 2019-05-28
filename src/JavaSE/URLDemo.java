package JavaSE;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {
    
    
    public static void main(String[] args) throws IOException {
        URL url=new URL("http","104.245.45.194",80,"/?p=194");
        InputStream inputStream=url.openStream();
        Scanner scanner=new Scanner(inputStream);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

    }
}
