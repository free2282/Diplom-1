import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {
    private Bun bun;

    @Before
    public void setUp() {
        bun = new Bun("Белая", 0.1f);
    }

    @Test
    public void changeNameDirectlyTest() {
        String expected = "Белая";
        String actual = bun.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changePriceDirectlyTest() {
        float expected = 0.1f;
        float actual = bun.getPrice();

        Assert.assertEquals(expected, actual, 0.0f);
    }
}
