import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

    Ingredient ingredient;

    @Before
    public void setUp(){
        ingredient = new Ingredient(FILLING, "Тест", 10.5f);
    }

    @Test
    public void checkGetTypeTest()
    {

        IngredientType expected = FILLING;
        IngredientType actual = ingredient.getType();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkGetNameTest(){
        String expected = "Тест";
        String actual = ingredient.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkGetPriceTest(){
        float expected = 10.5f;
        float actual = ingredient.getPrice();
        Assert.assertEquals(expected, actual, 0.0f);
    }
}
