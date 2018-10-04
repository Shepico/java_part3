import lesson6.MainClass;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestRebuildException {

    private Integer[] intExcep = {0,1,3,5,6,7};

    @Test(expected = RuntimeException.class)
    public void testExceptionRebuild() {
        Assert.assertEquals(true, MainClass.rebuildArray(intExcep));
    }
}
