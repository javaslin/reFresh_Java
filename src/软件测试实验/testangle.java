package 软件测试实验;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class testangle {
    private int param1,param2,param3;
    private int result;
    public testangle(int param1,int param2, int param3,int result){
        this.param1=param1;
        this.param2=param2;
        this.param3=param3;
        this.result=result;
    }
    @Parameters
    public static Collection data(){
        Object[][] obj={{3,3,3,2},{8,8,9,4},{3,4,5,1}};
        return Arrays.asList(obj);
    }
    @Test
    public void testIstriangle() {
        mytriangle obj=new mytriangle();
        assertEquals(this.result,obj.istriangle(param1,param2,param3));
    }
}
