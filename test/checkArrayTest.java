import lesson6.MainClass;
import org.junit.Assert;
import org.junit.Test;
public class checkArrayTest {


    private int[] intArr = {1,1,4,1,5,4};

    @Test
    public void testCheck() {
        Assert.assertEquals(true, MainClass.checkArray(intArr));
    }
}
