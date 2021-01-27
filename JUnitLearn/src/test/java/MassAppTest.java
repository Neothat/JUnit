import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassAppTest {

    static App app;

    @BeforeClass
    public static void init() {
        app = new App();
    }

    int[] output;
    int[] input;

    public MassAppTest(int[] output, int[] input) {
        this.output = output;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 7}, new int[]{1, 2, 5, 3, 4, 4, 6, 6, 4, 1, 7}},
                {new int[]{6, 6, 1, 7}, new int[]{1, 2, 5, 3, 4, 4, 6, 6, 1, 7}},
                {new int[]{}, new int[]{1, 2, 5, 3, 6, 6, 1, 7}}
        });
    }

    @Test
    public void testMethodOne() {
        Assert.assertArrayEquals(output, app.methodOne(input));
    }
}
