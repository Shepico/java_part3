import lesson6.MainClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

//@RunWith(Parameterized.class)
public class MainTest {
  /*  @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0,1,3,5,6,7},
                {0,1,4,5,6,7},
                {0,4,3,5,4,7},
                {0,1,3,5,6,4},
                {4,1,3,5,6,7},
        });

    }*/

    private int[] intArr = {1,2,3,4,5,6,7,8,4,9};
    private MainClass mainClass;

    @Test
    public void testRebuild(int[] intArr) {
        mainClass = new MainClass();


    }

}
