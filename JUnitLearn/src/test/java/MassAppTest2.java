import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassAppTest2 {
    static App app;

    @BeforeClass
    public static void init() {
        app = new App();
    }

    int[] input;
    boolean flag;

    public MassAppTest2(int[] input, boolean flag) {
        this.input = input;
        this.flag = flag;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true},
                {new int[]{1, 1, 1, 1}, false},
                {new int[]{ 4, 4, 4, 4}, false},
                {new int[]{1, 1, 1, 4, 4, 1, 4, 3}, false}
        });
    }

    @Test
    public void testMethodTwo(){
        Assert.assertEquals(flag, app.methodTwo(input));
    }
}
