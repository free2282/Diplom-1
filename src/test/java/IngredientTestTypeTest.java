import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertTrue;

public class IngredientTestTypeTest {
    public IngredientType[] ingredients = IngredientType.values();

    @Test
    public void checkLengthEnumTest() {
        int expectingLengthOfIngredientTypeQuantityValues = 2;
        Assert.assertEquals(expectingLengthOfIngredientTypeQuantityValues, ingredients.length);
    }

    @Test
    public void checkIngredientsEnumValues() {
        IngredientType.valueOf("SAUCE");
        IngredientType.valueOf("FILLING");
    }
}
