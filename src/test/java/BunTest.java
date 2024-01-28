import com.github.javafaker.Faker;
import org.junit.Test;
import praktikum.Bun;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void testGetName() {
        String expectedName = "bun";
        float price = 2.0f;

        Bun bun = new Bun(expectedName, price);

        String actualName = bun.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetPrice() {
        float minPrice = 1.0f;
        float maxPrice = 10.0f;

        Random random = new Random();
        float expectedPrice = minPrice + random.nextFloat() * (maxPrice - minPrice);

        Bun bun = new Bun("bun", expectedPrice);

        float actualPrice = bun.getPrice();

        assertEquals(expectedPrice, actualPrice, 0.01);
    }
}
