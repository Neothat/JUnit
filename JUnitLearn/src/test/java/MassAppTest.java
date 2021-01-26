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
    public static void init(){
        app = new App();
    }

    Integer[] conclusion;
    int[] input;

    public MassAppTest(Integer[] conclusion, int[] input) {
        this.conclusion = conclusion;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][][]{
                {{1, 7}, {1, 2, 5, 3, 4, 4, 6, 6, 4, 1, 7}},
                {{6, 6, 1, 7}, {1, 2, 5, 3, 4, 4, 6, 6, 1, 7}}
        });
    }

    @Test
    public void testMethodOne(){
        Assert.assertArrayEquals(conclusion, app.methodOne(input));
    }
}
