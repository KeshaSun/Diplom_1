import org.junit.Test;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class IngredientTypeTest {
    @Test
    public void checkIngredientTypeSauceTest(){
        assertEquals(IngredientType.valueOf("SAUCE"), SAUCE);
    }

    @Test
    public void checkIngredientTypeSauceFillingTest(){
        assertEquals(IngredientType.valueOf("FILLING"), FILLING);
    }

}