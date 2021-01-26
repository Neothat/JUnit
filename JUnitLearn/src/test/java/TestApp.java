import org.junit.Assert;
import org.junit.Test;

public class TestApp {

    @Test
    public void testMethodOne(){
        App app = new App();
        Assert.assertEquals(new Integer[]{1, 7}, App.methodOne(new int[]{1, 2, 5, 3, 4, 4, 6, 6, 4, 1, 7}));
    }
}
