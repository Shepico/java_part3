import lesson6.MainClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class checkArrayTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // {new Integer[] {0,1,3,5,6,7},new Integer[] {}},
                {new int [] {1,1,4,1,1,4},true},
                {new int [] {4,1,4,1,5,4},false},
                {new int [] {1,1,1,1,1,1},false},
                {new int [] {4,4,4},false},
                {new int [] {4,1,4},true},
        });

    }

    private int[] intArr;
    private boolean result;

    public checkArrayTest (int[] intArr, boolean result) {
        this.intArr = intArr;
        this.result = result;
    }


    @Test
    public void testCheck() {
        Assert.assertEquals(result, MainClass.checkArray(intArr));
    }
}
