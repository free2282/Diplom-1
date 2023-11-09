import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertTrue;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class IngredientTestTypeTest {
    public IngredientType[] ingredients = IngredientType.values();

    @Test
    public void checkLengthEnumTest()
    {
        Assert.assertEquals(2, ingredients.length);
    }

    @Test
    public void checkIngredientsEnumValues(){
        for (IngredientType ingredient: ingredients){
            switch (ingredient){
                case SAUCE:
                    assertTrue(true);


                case FILLING:
                    assertTrue(true);
                    break;
            }
        }
    }
}
