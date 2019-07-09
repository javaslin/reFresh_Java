package 软件测试实验;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestMyWS {
    private String pram1;
    private String result;


    public TestMyWS(String pram1, String result) {
        this.pram1 = pram1;
        this.result = result;
    }

    @Parameters
    public static Collection data() {
        Object[][] obj = {{"apple 1", "5110"}};
        return Arrays.asList(obj);
    }

    @Test
    public void testcountSYB() {
        MyWordSymbol obj = new MyWordSymbol();
        assertEquals(this.result, obj.countSymbol(pram1));
    }
}
