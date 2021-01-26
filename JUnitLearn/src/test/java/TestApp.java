import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestApp {

    App app;

    @Before
    public void prepare(){
        app = new App();
    }

    @Test
    public void testMethodOne1(){
        Assert.assertArrayEquals(new Integer[]{1, 7}, app.methodOne(new int[]{1, 2, 5, 3, 4, 4, 6, 6, 4, 1, 7}));
    }

    @Test
    public void testMethodOne2(){
        Assert.assertArrayEquals(new Integer[]{6, 6, 1, 7}, app.methodOne(new int[]{1, 2, 5, 3, 4, 4, 6, 6, 1, 7}));
    }

    @Test(expected = RuntimeException.class)
    public void testMethodOne3(){
        Assert.assertArrayEquals(new Integer[]{}, app.methodOne(new int[]{1, 2, 5, 3, 6, 6, 1, 7}));
    }

    @Test
    public void testMethodTwo1(){
        Assert.assertTrue(app.methodTwo(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    public void testMethodTwo2(){
        Assert.assertFalse(app.methodTwo(new int[]{1, 1, 1, 1}));
    }
}
