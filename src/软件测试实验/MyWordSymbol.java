package 软件测试实验;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyWordSymbol {


    public String countSymbol(String word) {
        int enCharNum = 0;
        int blankNum = 0;
        int numNum = 0;
        int elseNum = 0;

        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') enCharNum++;
            else if (c >= '0' && c <= '9') numNum++;
            else if (c == ' ') blankNum++;
            else elseNum++;
        }
        String a = "";
        return a + String.valueOf(enCharNum) + String.valueOf(blankNum) + String.valueOf(numNum) + String.valueOf(elseNum);

    }


    public void sum1(int x, int y) {
        if (x < 19 || x > 200 || y <= 5 || y > 12) {
            System.out.println("wrong limits");
        }
        int z = x * x + y * y;
        System.out.println(z);
    }

    public void sum2(int x, int y) {
        if (x <= 10 || x >= 18 || y <= 1 || y > 5) {
            System.out.println("wrong limits");
        }
        int z = x * x - (y - 1) * (y - 1);
        System.out.println(z);
    }


}
