import lesson6.MainClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MainTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
               // {new Integer[] {0,1,3,5,6,7},new Integer[] {}},
                {new Integer[] {0,1,4,5,6,7},new Integer[] {5,6,7}},
                {new Integer[] {0,4,3,5,4,7},new Integer[] {7}},
                {new Integer[] {0,1,3,5,6,4},new Integer[] {}},
                {new Integer[] {4,1,3,5,6,7},new Integer[] {1,3,5,6,7}},
        });

    }

    private Integer[] intArr;
    private Integer[] resultArr;
    /*private Integer[] intExcep = {0,1,3,5,6,7};*/


    public MainTest (Integer[] intArr, Integer[] resultArr){
        this.intArr = new Integer[intArr.length];
        this.resultArr = new Integer[resultArr.length];
        this.intArr = intArr;
        this.resultArr = resultArr;

    }

    @Test
    public void testRebuild() {
        Assert.assertEquals(true,Arrays.equals(resultArr, MainClass.rebuildArray(intArr)));
    }



    /*@Test(expected = RuntimeException.class)
    public void testExceptionRebuild() {
        Assert.assertEquals(true, MainClass.rebuildArray(intExcep));
    }*/

}
