package JavaSE;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo {

    public static void main(String[] args) throws IOException {
        InetAddress locAdd = null;
        InetAddress re = null;
        locAdd = InetAddress.getLocalHost();
        re = InetAddress.getByName("www.baidu.com");

        System.out.println("本机IP地址" + locAdd.getHostAddress());

        System.out.println("百度的IP地址" + re.getHostAddress());

        System.out.println("本机是否可达" + locAdd.isReachable(5000));

    }
}
